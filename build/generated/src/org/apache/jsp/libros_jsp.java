package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class libros_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .s{\n");
      out.write("                text-align: center;\n");
      out.write("               margin: 0 auto;\n");
      out.write("               \n");
      out.write("                                 \n");
      out.write("                  width: 20%;\n");
      out.write("                  transition: 2s;\n");
      out.write("                  margin-top: 20px;\n");
      out.write("                  box-shadow: 0px 0px 30px #66ff00, 0px 0px 40px #66ff33, 0px 0px 80px white;\n");
      out.write("                  background-color: rgba(0,0,0,0);\n");
      out.write("                  \n");
      out.write("            }\n");
      out.write("            .r{\n");
      out.write("                 text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"r\">Registro de libros</h1>\n");
      out.write("        <form action=\"procesa3\" method=\"post\">\n");
      out.write("            <table class=\"s\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><label>Titulo</label> </td>\n");
      out.write("                    <td><input type=\"text\" name=\"titulo\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label>Autor</label></td>\n");
      out.write("                    <td><input type=\"text\" name=\"autor\">\n");
      out.write("                        \n");
      out.write("            </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label>Resumen</label></td>\n");
      out.write("                    <td>\n");
      out.write("                        <textarea type=\"text\" name=\"resumen\"></textarea>\n");
      out.write("            </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label>Medio</label></td>\n");
      out.write("                    <td><input type=\"radio\" name=\"medio\" value=\"1\">Fisico\n");
      out.write("                        <br>  <input type=\"radio\" name=\"medio\" value=\"2\">Magnetico\n");
      out.write("            \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Enviar\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        <a href=\"index.jsp\">Volver al inicio</a>\n");
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
