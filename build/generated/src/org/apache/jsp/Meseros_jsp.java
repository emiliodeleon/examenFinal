package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Meseros_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body background=\"sources/fondo2.jpg\">\n");
      out.write("        \t<div style=\"text-align:center;\">\n");
      out.write("\t<table>\n");
      out.write("\t\t<br></br>\n");
      out.write("\t\t<br></br>\t\t\n");
      out.write("\t\t<td><tr><H1><img src=\"sources/elbueno.jpg\"></H1></tr></td>\n");
      out.write("\t\t\n");
      out.write("\t</table>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        <center><h1> Meseros </h1></center>\n");
      out.write("    <form id=\"form1\" name=\"form1\" method=\"post\" action=\"Meseros\">\n");
      out.write("    <td align=\"right\">Nombre:</td> \n");
      out.write("    <input type=\"text\" name=\"nombre_mesero\"><br>\n");
      out.write("    <td align=\"right\">Edad:</td> \n");
      out.write("    <input type=\"text\" name=\"edad_mesero\"><br>\n");
      out.write("    <td align=\"right\">No. de trabajador:</td> \n");
      out.write("    <input type=\"text\" name=\"no_trabajador\"><br>\n");
      out.write("    <td align=\"right\">Turno:</td> \n");
      out.write("    <input type=\"text\" name=\"turno_mesero\"><br>\n");
      out.write("    <label for=\"mesa_asignada\">Mesa asignada:</label> <br/>\n");
      out.write("<select id=\"mesero\" name=\"mesa_asignada\">\n");
      out.write("  <optgroup label=\"Número de mesa\">\n");
      out.write("    <option value=\"uno\">1</option>\n");
      out.write("    <option value=\"dos\">2</option>\n");
      out.write("    <option value=\"tres\">3</option>\n");
      out.write("    <option value=\"cuatro\">4</option>\n");
      out.write("    <option value=\"cinco\">5</option>\n");
      out.write("    <option value=\"seis\">6</option>\n");
      out.write("    <option value=\"siete\">7</option>\n");
      out.write("    <option value=\"ocho\">8</option>\n");
      out.write("    <option value=\"nueve\">9</option>\n");
      out.write("    <option value=\"diez\">10</option>\n");
      out.write("  </optgroup>\n");
      out.write("<input type=\"submit\" value=\"Ingresar\" id=\"nuevo\" name=\"nuevo\"/><br>\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
