/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeebkServer.controller.plan;

import com.tabeebkServer.dao.planmsp.PlanMspDao;
import com.tabeebkServer.pojo.Planmsp;
import com.tabeebkServer.pojo.PlanmspId;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HMA
 */
public class MSPAddedToPlans extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String[] MSPPlans = request.getParameterValues("MSPPlans");
        if (MSPPlans.length > 0 && request.getParameter("msptypeid") != null && request.getParameter("mspid") != null) {
            int mspTypeId = Integer.parseInt(request.getParameter("msptypeid"));
            int typeId = Integer.parseInt(request.getParameter("mspid"));
//            System.out.println("herrr: " + planId + "\t" + mspTypeId + "\t" + typeId);
            List<Planmsp> planmsps = new ArrayList<>();
            for (String MSPPlan : MSPPlans) {
                int planId = Integer.parseInt(MSPPlan);
                Planmsp planmsp = new Planmsp();
                PlanmspId planmspId = new PlanmspId();
                planmspId.setPlanId(planId);
                planmspId.setTypeId(typeId);
                planmspId.setMsptypeTypeId(mspTypeId);
                planmsp.setId(planmspId);
                planmsp.setDeleted(0);
                planmsps.add(planmsp);
            }
            PlanMspDao.addMspToPlan(planmsps);
//            System.out.println("herrr: " + planmsps.size()+ "\t" + mspTypeId + "\t" + typeId);
            response.sendRedirect("MyMsp");
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