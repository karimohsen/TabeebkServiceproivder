/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeebkServer.admin.controller;

import com.tabeebkServer.dao.BranchDao;
import com.tabeebkServer.dao.HospitalDao;
import com.tabeebkServer.dao.TelephoneDao;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karim
 */
public class UpdateHospitalDetails extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Integer teleId1 = null;
        Integer teleId2 = null;
        
        if (request.getParameter("teleid1") != null && !request.getParameter("teleid1").equals("")) {
            teleId1 = Integer.parseInt(request.getParameter("teleid1"));
        }
        if (request.getParameter("teleid2") != null && !request.getParameter("teleid2").equals("")) {
            teleId2 = Integer.parseInt(request.getParameter("teleid2"));
        }
        
        int hospitalId = Integer.parseInt(request.getParameter("hospitalid"));
        int branchId = Integer.parseInt(request.getParameter("branchid"));
        String name = request.getParameter("name");
        String nameAr = request.getParameter("namear");
        String hospitalBranch = request.getParameter("hospitalbranch");
        String hospitalBranchAr = request.getParameter("hospitalbranchar");
        String tele1 = request.getParameter("tele1");
        String tele2 = request.getParameter("tele2");
        String address = request.getParameter("hospitaladdar");
        String addressAr = request.getParameter("hospitaladd");
        String longitude = request.getParameter("longitude");
        String latitude = request.getParameter("latitude");
        int country = Integer.parseInt(request.getParameter("Country"));
        int area = Integer.parseInt(request.getParameter("Area"));
        int city = Integer.parseInt(request.getParameter("Cities"));
        String[] specialities = request.getParameterValues("specialities");
        ArrayList<Integer> specialitiesList = new ArrayList<Integer>();
        for (int i = 0; i < specialities.length; i++) {
            specialitiesList.add(Integer.parseInt(specialities[i]));
        }
        if (teleId1 != null) {
            TelephoneDao.updateTelephone(teleId1, tele1);
        }
        if (teleId2 != null) {
            TelephoneDao.updateTelephone(teleId2, tele2);
        }
        BranchDao.updateBranch(branchId, area, address, addressAr, latitude, longitude, hospitalBranch, hospitalBranchAr, country, city);
        HospitalDao.updateHospital(hospitalId, name, nameAr);
        HospitalDao.deleteHospitalSpeciality(hospitalId);
        HospitalDao.addHospitalSpeciality(hospitalId, specialitiesList);
        response.sendRedirect("Admin/Home.jsp");
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
