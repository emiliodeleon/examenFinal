/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sony valle
 */
@WebServlet(urlPatterns = {"/Reservaciones"})
public class Reservaciones extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String nombreComensal = request.getParameter("nombre_reservacion");
        String fechaReservacion = request.getParameter("fecha_reservacion");
        String comensales = request.getParameter("comensales");
        
        String ruta = "C:\\Users\\sea_hack\\Documents\\Bueno\\El tamano\\reservaciones.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        FileWriter TextOut = new FileWriter(archivo, true);
        if(archivo.exists()) {
            TextOut.write(nombreComensal + "," + fechaReservacion + "," + comensales + ";");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            TextOut.write(nombreComensal+ "," + fechaReservacion + "," + comensales + ";");
        }
        TextOut.close();
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Reservaciones</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Reservaciones at " + request.getContextPath() + "</h1>");
            out.println("<h1>Reservación exitosa a " + nombreComensal + "</h1>");
            out.println("<h1>Con fecha " +fechaReservacion + "</h1>");
            out.println("<h1>Para " + comensales + " " + "comensales" + "</h1>");
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
