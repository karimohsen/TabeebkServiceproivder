/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeebkServer.admin.controller;

import com.tabeebkServer.dao.AreaDao;
import com.tabeebkServer.dao.CityDao;
import com.tabeebkServer.dao.CountryDao;
import com.tabeebkServer.dao.HospitalSpecialityDao;
import com.tabeebkServer.pojo.Area;
import com.tabeebkServer.pojo.City;
import com.tabeebkServer.pojo.Country;
import com.tabeebkServer.pojo.Doctorspeciality;
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
public class AllHospitalSpecialities extends HttpServlet {

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
        RequestDispatcher rd = request.getRequestDispatcher("Admin/addBranchsToHospital.jsp");
        HttpSession session = request.getSession(false);
        if (session.getAttribute("Accountid") != null) {
            ArrayList<Doctorspeciality> list = HospitalSpecialityDao.getHospitalspecialities();
            request.setAttribute("allSpecialities", list);
            ArrayList<City> city = CityDao.getAllCities();
            request.setAttribute("allcities", city);
            ArrayList<Area> area =AreaDao.getAllAreas();
            request.setAttribute("allareas", area);
            ArrayList<Country> country =CountryDao.getAllCountries();
            request.setAttribute("allcountries", country);
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
