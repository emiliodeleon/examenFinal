package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <body Background=\"sources/fondo2.jpg\">\n");
      out.write("\t<table>\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t* {\n");
      out.write("\t\t\t\tmargin:0px;\n");
      out.write("\t\t\t\tpadding:0px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t#header {\n");
      out.write("\t\t\t\tmargin:auto;\n");
      out.write("\t\t\t\twidth:500px;\n");
      out.write("\t\t\t\tfont-family:Arial, Helvetica, sans-serif;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tul, ol {\n");
      out.write("\t\t\t\tlist-style:none;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav > li {\n");
      out.write("\t\t\t\tfloat:left;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li a {\n");
      out.write("\t\t\t\tbackground-color:#A4A4A4;\n");
      out.write("\t\t\t\tcolor:#fff;\n");
      out.write("\t\t\t\ttext-decoration:none;\n");
      out.write("\t\t\t\tpadding:10px 12px;\n");
      out.write("\t\t\t\tdisplay:block;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li a:hover {\n");
      out.write("\t\t\t\tbackground-color:#FF8000;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li ul {\n");
      out.write("\t\t\t\tdisplay:none;\n");
      out.write("\t\t\t\tposition:absolute;\n");
      out.write("\t\t\t\tmin-width:140px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li:hover > ul {\n");
      out.write("\t\t\t\tdisplay:block;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li ul li {\n");
      out.write("\t\t\t\tposition:relative;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.nav li ul li ul {\n");
      out.write("\t\t\t\tright:-140px;\n");
      out.write("\t\t\t\ttop:0px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t</style>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t<li><a onclick=window.open('main.jsp')>Inicio</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">Menu</a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Entradas</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Postres</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Ensaladas</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Plato fuerte</a>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Vinos y licores</a>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Cabernets sauvignon</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Tempranillos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Licores de crema</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><a href=\"\">Acerca de</a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Bussiness Unit</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Historia</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><a href=\"\">Contacto</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("</table>\n");
      out.write("\t<div style=\"text-align:center;\">\n");
      out.write("\t<table>\n");
      out.write("\t\t<br></br>\n");
      out.write("\t\t<br></br>\n");
      out.write("                <br></br>\t\t\n");
      out.write("\t\t<td><tr><H1><img src=\"sources/elbueno.jpg\"></H1></tr></td>\n");
      out.write("                <br></br>\n");
      out.write("\t\t<td><tr><a onclick=window.open('Login.jsp')><img src=\"sources/login.jpg\"></a></tr></td>\n");
      out.write("\t\t\n");
      out.write("\t</table>\n");
      out.write("\t</div>\n");
      out.write("  </body>\n");
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
