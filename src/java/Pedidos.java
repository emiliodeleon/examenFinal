/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import MiPackage.Distribucion;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
@WebServlet(urlPatterns = {"/Pedidos"})
public class Pedidos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String usuarioPedido = request.getParameter("usuario_pedido");
        String platilloPedido = request.getParameter("platillo_pedido");
        String bebidaPedido= request.getParameter("bebida_pedido");
        String postrePedido = request.getParameter("postre_pedido");
        String fechaPedido = request.getParameter("fecha_pedido");
        String horaPedido= request.getParameter("hora_pedido");
        String mesaPedido= request.getParameter("mesa_pedido");
        String totalPedido= request.getParameter("total_pedido"); 
        
        String ruta = "C:\\Users\\sea_hack\\Documents\\Bueno\\El tamano\\pedidos.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        FileWriter TextOut = new FileWriter(archivo, true);
        if(archivo.exists()) {
            TextOut.write(usuarioPedido+ "," + platilloPedido + "," + bebidaPedido + "," + postrePedido + "," + fechaPedido + "," + horaPedido + "," + mesaPedido + "," + totalPedido + ";" + " ");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            TextOut.write(usuarioPedido+ "," + platilloPedido + "," + bebidaPedido + "," + postrePedido + "," + fechaPedido + "," + horaPedido + "," + mesaPedido + "," + totalPedido + ";" + " ");
        }
        TextOut.close();
        
        String readFile = Distribucion.readFile(ruta, Charset.defaultCharset());
        
        Queue pedidos = new LinkedList();
                
        StringTokenizer st = new StringTokenizer(readFile, ",;");
        while(st.hasMoreTokens()) {
        pedidos.add(st.nextToken());
        }
        
        
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Pedidos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El pedido ha sido enviado con la siguiente informacion:</h1>");
            out.println("<h1>Usuario: "+usuarioPedido+"</h1>");
            out.println("<h1>Platillo: "+platilloPedido+"</h1>");
            out.println("<h1>Bebida: "+bebidaPedido+"</h1>");
            out.println("<h1>Postre: "+postrePedido+"</h1>");
            out.println("<h1>Fecha: "+fechaPedido+"</h1>");
            out.println("<h1>Hora: "+horaPedido+"</h1>");
            out.println("<h1>Mesa: "+mesaPedido+"</h1>");
            out.println("<h1>Total: "+totalPedido+"</h1>");
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
