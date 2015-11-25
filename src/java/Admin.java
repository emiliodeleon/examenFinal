/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MiPackage.Distribucion;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sony valle
 */
@WebServlet(urlPatterns = {"/Admin"})
public class Admin extends HttpServlet {

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
       
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String id = request.getParameter("usuario");
        String pwd = request.getParameter("pwd");
        
        String ruta = "C:\\Users\\sea_hack\\Documents\\Bueno\\El tamano\\admin.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        FileWriter TextOut = new FileWriter(archivo, true);
        if(archivo.exists()) {
            TextOut.write(id + "," + pwd + "," + nombre + "," + apellido + ";");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            TextOut.write(id + "," + pwd + "," + nombre + "," + apellido + ";");
        }
        TextOut.close();
        
        String readFile = Distribucion.readFile(ruta, Charset.defaultCharset());
        
        ArrayList<String> users = new ArrayList<String>();        
        
        StringTokenizer st = new StringTokenizer(readFile, ",;");
        while(st.hasMoreTokens()) {
        users.add(st.nextToken());
        }
        
        
        
        
        
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Administración de usuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El siguiente usuario ha sido registrado:</h1>");
            out.println("<h1>Nombre: " + nombre + "</h1>");
            out.println("<h1>Apellido: "+apellido+"</h1>");
            out.println("<h1>ID: "+id+"</h1>");
            out.println("<h1>Contraseña: "+pwd + "</h1>");
            out.println("<h1>Archivo en String: "+readFile + "</h1>");
            out.println("Elemento 0 de la lista es:" + users.get(0));
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
