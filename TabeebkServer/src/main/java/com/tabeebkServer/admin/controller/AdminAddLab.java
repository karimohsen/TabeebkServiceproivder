/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeebkServer.admin.controller;

import com.tabeebkServer.pojo.Lab;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Karim
 */
public class AdminAddLab extends HttpServlet {

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
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (isMultipart) {
            
            Lab lab = new Lab();
            // Create a factory for disk-based file items
            DiskFileItemFactory factory = new DiskFileItemFactory();

            // Configure a repository (to ensure a secure temp location is used)
            ServletContext servletContext = this.getServletConfig().getServletContext();
            File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
            factory.setRepository(repository);
            factory.setSizeThreshold(1024 * 1024 * 3);
            // sets temporary location to store files
            ServletFileUpload upload = new ServletFileUpload(factory);
            // sets maximum size of upload file
            upload.setFileSizeMax(1024 * 1024 * 40);
            // sets maximum size of request (include file + form data)
            upload.setSizeMax(1024 * 1024 * 50);
            // Parse the request
            List<FileItem> items;
            try {
                items = upload.parseRequest(request);
                Iterator<FileItem> iter = items.iterator();
                while (iter.hasNext()) {
                    FileItem item = iter.next();
                    if (item.isFormField()) {
                        if (item.getFieldName().equals("name")) {
                            lab.setLabName(item.getString());
                        } else if (item.getFieldName().equals("namear")) {
                            lab.setLabNameAr(item.getString("UTF-8").trim());
                        } 
                    } else {
                        String Name = item.getName();
                        if (!Name.equals("") && Name != null) {
//                            String uploadFolder = System.getProperty("user.home");
//                            String fName = new File(item.getName()).getName();
//                            File file = new File(uploadFolder + "\\lab");
//                            if (!file.exists()) {
//                                file.mkdir();
//                            }
//                            uploadFolder += "\\lab";
//                            String filePath = uploadFolder + File.separator + fName;
//                            lab.setLabImagepath(filePath);
                              lab.setLabImagepath(item.get());
//                            File f = new File(filePath);
//                            item.write(f);
                        }
                    }
                }
                RequestDispatcher rd = request.getRequestDispatcher("AllLabHospitalsAndSpecialities");
                this.getServletConfig().getServletContext().setAttribute("newlab",lab);
                rd.forward(request, response);
            } catch (FileUploadException ex) {
                ex.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
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
