/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sony valle
 */
@WebServlet(urlPatterns = {"/cuentas"})
public class cuentas extends HttpServlet {

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
       
        String nuevaCuenta = request.getParameter("nueva_cuenta");
        String altas = request.getParameter("altas");
        String baja = request.getParameter("bajas");
        
        String ruta = "C:\\Users\\sea_hack\\Documents\\Bueno\\El tamano\\cuentas.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        FileWriter TextOut = new FileWriter(archivo, true);
        if(archivo.exists()) {
            TextOut.write(nuevaCuenta+ "," + altas + "," + baja + ",");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            TextOut.write(nuevaCuenta+ "," + altas + "," + baja + ",");
        }
        TextOut.close();

        
        
        try {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cuentas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cuentas at " + request.getContextPath() + "</h1>");
            out.println("<h1>Servlet cuentas at " + nuevaCuenta + "</h1>");
            out.println("<h1>Servlet cuentas at " + altas + "</h1>");
            out.println("<h1>Servlet cuentas at " + baja + "</h1>");   
            Nodos n1 = new Nodos(nuevaCuenta);
            out.println("Cuentas registradas: " + n1.obtenerValor().toString());
            out.println(n1);
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
            
       
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
