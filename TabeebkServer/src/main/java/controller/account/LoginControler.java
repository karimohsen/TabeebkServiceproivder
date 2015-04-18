/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.account;

import dao.AccountDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojo.Account;

/**
 *
 * @author HMA
 */
public class LoginControler extends HttpServlet {

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

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+"  "+password);
        Account currentUser = new Account();
        currentUser.setUsername(username);
        currentUser.setPassword(password);

        //================= Hatem =====================       
        currentUser = AccountDao.checkLogin(currentUser);

        //Scucessful login
        if (currentUser != null) {
             HttpSession session = request.getSession(true);
            //if user is admin user
            session.setAttribute("Accountid", currentUser.getId().getAccountId());
            session.setAttribute("type", currentUser.getId().getAccountTypeId());

            //if Account is MSP Account
            if (currentUser.getId().getAccountTypeId() == 1) {
                response.sendRedirect("MSP/Home.jsp");
            }
            //if Account is MIC Account
            if (currentUser.getId().getAccountTypeId() == 2) {

                response.sendRedirect("MSP/Home.jsp");

            }
        } //Failed login
        else {System.out.println("Servlet Else");
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
