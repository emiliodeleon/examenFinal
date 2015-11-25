/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MiPackage.Distribucion;
import static java.awt.SystemColor.window;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fernando
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends Admin{

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
     
        String usuario = request.getParameter("usuario");     
        String pwd = request.getParameter("contrasena");
         pila pila = new pila ();
        DateFormat df = new SimpleDateFormat ("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        out.println(df.format(dateobj));
        String ruta = "C:\\Users\\sea_hack\\Documents\\Bueno\\El tamano\\usuarios.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        FileWriter TextOut = new FileWriter(archivo, true);
        if(archivo.exists()) {
            TextOut.write(usuario+ "," + pwd + "," + df.format(dateobj) + ";");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            TextOut.write(usuario+ "," + pwd + "," + df.format(dateobj) + ";");
        }
        TextOut.close();
        out.println("DONE");
                        
         out.println("------Pila------");
               

          pila.get(pila.size()-1);
          out.println(pila.get(pila.size()-1));
          pila.get(pila.size()-2);
          out.println(pila.get(pila.size()-2));
          pila.get(pila.size()-3);
          out.println(pila.get(pila.size()-3));
          pila.get(pila.size()-4);
          out.println(pila.get(pila.size()-4));
          pila.get(pila.size()-5);
          out.println(pila.get(pila.size()-5));

        String readFile = Distribucion.readFile(ruta, Charset.defaultCharset());
        
        ArrayList<String> users;        
        users = new ArrayList<String>();
        
        StringTokenizer st = new StringTokenizer(readFile, ",;");
        while(st.hasMoreTokens()) {
        users.add(st.nextToken());
        }
        
        int validar;
        validar = Distribucion.validacion(users,usuario,pwd);
        
        

        
        
        try {
            if(validar==1){
                response.sendRedirect("Administrador.jsp");
                }
            if(validar==2){
                response.sendRedirect("ClientesLogin.jsp");
                }
            if(validar==3){
                response.sendRedirect("MeseroLogin.jsp");
                }
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
