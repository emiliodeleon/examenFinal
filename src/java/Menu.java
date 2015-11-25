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
@WebServlet(urlPatterns = {"/Menu"})
public class Menu extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      
        String bandera = null;
        String nombrePlatillo = request.getParameter("platillo_menu");
        String precioMenu = request.getParameter("precio_menu");
        String tiempoMenu = request.getParameter("tiempo_menu");
        
        String check1 = request.getParameter("si");
        String check2 = request.getParameter("no");
        String checkedIds = "";
        String si ="si";
        String no = "no";
        boolean check=false;
        
        
        
        if(check1 != null){
            
            checkedIds = "Disponible";
        }else{
            if(check2 != null){
               
                checkedIds = "No disponible";
            }else{
                if((check1 != null)&& (check2 != null )){
                    checkedIds = " Error ambos valores seleccionados";
                    check = true;
                }
            }
            
        }
        
        if (check==true)
        {
            bandera = " Error ambos valores seleccionados";
        }
            
       
        String ruta = "C:\\Users\\sea_hack\\Documents\\Bueno\\El tamano\\menu.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        FileWriter TextOut = new FileWriter(archivo, true);
        if(archivo.exists()) {
            TextOut.write(nombrePlatillo+ "," + precioMenu + "," + tiempoMenu + "," + checkedIds + ";");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            TextOut.write(nombrePlatillo+ "," + precioMenu + "," + tiempoMenu + "," + checkedIds + ";");
        }
        TextOut.close();
        
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Menu</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Menu at " + request.getContextPath() + bandera + "</h1>");
            out.println("<h1>Alta exitosa</h1>");  
            out.println("</body>");
            out.println("</html>");
            out.println("<META HTTP-EQUIV=\"REFRESH\" CONTENT=\"1;URL=Menu.jsp\">");
        
            
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
