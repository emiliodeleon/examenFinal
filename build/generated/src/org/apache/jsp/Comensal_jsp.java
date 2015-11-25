package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Comensal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <form id=\"form1\" name=\"form1\" method=\"post\" action=\"Comensales\">    \n");
      out.write("        <h1>Comensales</h1>\n");
      out.write("        <td align=\"right\">Nombre:</td>\n");
      out.write("        <input type=\"text\" name=\"nombre_comensal\"><br>\n");
      out.write("        <td align=\"right\">Apellido:</td> \n");
      out.write("        <input type=\"text\" name=\"apellido_comensal\"><br>\n");
      out.write(" <label for=\"fafds\">Numero de comensales</label> <br/>\n");
      out.write("<select id=\"comensales\" name=\"comensales\">\n");
      out.write("  <optgroup label=\"Comensales\">\n");
      out.write("    <option value=\"1\">1</option>\n");
      out.write("    <option value=\"2\">2</option>\n");
      out.write("    <option value=\"3\">3</option>\n");
      out.write("    <option value=\"4\">4</option>\n");
      out.write("    <option value=\"5\">5</option>\n");
      out.write("    <option value=\"6\">6</option>\n");
      out.write("  </optgroup>\n");
      out.write("        <td align=\"right\">Sexo:</td>\n");
      out.write("        <label for=\"sexo_comensal\"></label>\n");
      out.write("        <input type=\"checkbox\" name=\"masculino\" value=\"Masculino\"> Masculino\n");
      out.write("        <input type=\"checkbox\" name=\"femenino\" value=\"Femenino\" checked> Femenino\n");
      out.write("        </form>    \n");
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
