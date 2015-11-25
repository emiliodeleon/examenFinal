package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Mesas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body Background=\"sources/fondo2.jpg\">\n");
      out.write("        \t<div style=\"text-align:center;\">\n");
      out.write("\t<table>\n");
      out.write("\t\t<br></br>\n");
      out.write("\t\t<br></br>\t\t\n");
      out.write("\t\t<td><tr><H1><img src=\"sources/elbueno.jpg\"></H1></tr></td>\n");
      out.write("\t\t\n");
      out.write("\t</table>\n");
      out.write("\t</div>\n");
      out.write("         <form id=\"form1\" name=\"form1\" method=\"post\" action=\"Mesas\">\n");
      out.write("         <table align=\"center\">\n");
      out.write("             <center><h1> Mesas </h1></center>\n");
      out.write("            <tr><td><label for=\"tipo_mesa\">Tipo de mesa:</label></td></tr> <br/>\n");
      out.write("            <tr><td><select id=\"programa\" name=\"mesa\">\n");
      out.write("  <optgroup label=\"Seleccionar tipo de mesa\">\n");
      out.write("    <option value=\"Mesa\">Mesa</option>\n");
      out.write("    <option value=\"Gabinete\">Gabinete</option>\n");
      out.write("  </optgroup></select></td></tr>\n");
      out.write("            <tr><td><label for=\"ubicacion_mesa\">Ubicacion:</label> <br/>\n");
      out.write("<select id=\"ubicacion\" name=\"ubicacion\">\n");
      out.write("  <optgroup label=\"Seleccionar ubicacion de la mesa\">\n");
      out.write("    <option value=\"Planta baja\">Planta baja</option>\n");
      out.write("    <option value=\"Terraza\">Terraza</option>\n");
      out.write("    <option value=\"Segundo piso\">Segundo piso</option>\n");
      out.write("  </optgroup></select></td></tr>  \n");
      out.write("             <tr><td><input type=\"submit\" value=\"Ingresar\" /></td></tr>\n");
      out.write("             </table>\n");
      out.write("    </form>\n");
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
