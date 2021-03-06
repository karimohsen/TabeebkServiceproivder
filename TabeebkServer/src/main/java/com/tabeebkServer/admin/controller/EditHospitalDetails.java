/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeebkServer.admin.controller;

import com.tabeebkServer.dao.AreaDao;
import com.tabeebkServer.dao.BranchDao;
import com.tabeebkServer.dao.CityDao;
import com.tabeebkServer.dao.CountryDao;
import com.tabeebkServer.dao.HospitalDao;
import com.tabeebkServer.dao.HospitalSpecialityDao;
import com.tabeebkServer.dao.TelephoneDao;
import com.tabeebkServer.pojo.Area;
import com.tabeebkServer.pojo.Branche;
import com.tabeebkServer.pojo.City;
import com.tabeebkServer.pojo.Country;
import com.tabeebkServer.pojo.Doctorspeciality;
import com.tabeebkServer.pojo.Hospital;
import com.tabeebkServer.pojo.Hospitalspeciality;
import com.tabeebkServer.pojo.Telephone;
import com.tabeebkServer.utilty.MyHospitalSpeciality;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Karim
 */
public class EditHospitalDetails extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = request.getRequestDispatcher("Admin/EditHospital.jsp");
        HttpSession session = request.getSession(false);
        if (session.getAttribute("Accountid") != null) {
            int id = Integer.parseInt(request.getParameter("id"));
            Hospital h = HospitalDao.getHospitalDetails(id);
            request.setAttribute("hospital", h);
            ArrayList<Doctorspeciality> list = HospitalSpecialityDao.getHospitalspecialities();
            request.setAttribute("allSpecialities", list);
            ArrayList<City> city = CityDao.getAllCities();
            request.setAttribute("allcities", city);
            ArrayList<Area> area = AreaDao.getAllAreas();
            request.setAttribute("allareas", area);
            ArrayList<Hospitalspeciality> speciality = HospitalSpecialityDao.getspecialities(id);
            ArrayList<MyHospitalSpeciality> myhospitalSpeciality = MyHospitalSpeciality.getCheckedHospitals(list, speciality);
            request.setAttribute("hospitalspeciality", myhospitalSpeciality);
            ArrayList<Country> country = CountryDao.getAllCountries();
            request.setAttribute("allcountries", country);
            ArrayList<Telephone> teleList = TelephoneDao.getTelephones(1, id);
            Telephone tele1 = new Telephone();
            Telephone tele2 = new Telephone();
            if (teleList.size() == 2) {
                tele1 = teleList.get(0);
                tele2 = teleList.get(1);
                request.setAttribute("tele1", tele1);
                request.setAttribute("tele2", tele2);
            }
            if (teleList.size() == 1) {
                tele1 = teleList.get(0);
                request.setAttribute("tele1", tele1);
            }
            Branche b = BranchDao.getBranch(1, id);
            request.setAttribute("branch", b);
            rd.forward(request, response);
        } else {
            response.sendRedirect("Login.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
