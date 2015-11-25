package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Pedidos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">Pedidos</h1>\n");
      out.write("        <table align=\"center\">\n");
      out.write("            <tr><td>Usuario del pedido:</td><td><input name=\"platillo_menu\" type=\"text\" id=\"platillo_menu\" size=\"15\" /></td></tr>\n");
      out.write("            <tr><td>Platillo pedido:</td><td><input name=\"precio_menu\" type=\"text\" id=\"precio_menu\" size=\"15\" /></td></tr>\n");
      out.write("            <tr><td>Bebida:</td><td><input name=\"tiempo_menu\" type=\"text\" id=\"tiempo_menu\" size=\"15\" /></td></tr>\n");
      out.write("            <tr><td>Postre:</td><td><input name=\"tiempo_menu\" type=\"text\" id=\"tiempo_menu\" size=\"15\" /></td></tr>\n");
      out.write("            <tr><td>Fecha:</td><td><input name=\"tiempo_menu\" type=\"date\" id=\"tiempo_menu\" size=\"15\" /></td></tr>\n");
      out.write("            <tr><td>Hora:</td><td><input name=\"tiempo_menu\" type=\"text\" id=\"tiempo_menu\" size=\"15\" /></td></tr>\n");
      out.write("            <tr><td>Mesa:</td><td><input name=\"tiempo_menu\" type=\"text\" id=\"tiempo_menu\" size=\"15\" /></td></tr>\n");
      out.write("            <tr><td>Total:</td><td><input name=\"tiempo_menu\" type=\"text\" id=\"tiempo_menu\" size=\"15\" /></td></tr>\n");
      out.write("            <tr><td><input type=\"submit\" name=\"genera_pedido\" id=\"genera_pedido\" value=\"Generar pedido\" /></td></tr>\n");
      out.write("            <td align = \"right\"> <input type=\"submit\" value=\"Atrás\" onclick=\"window.open('ClientesLogin.jsp')\" /> <br><br>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
