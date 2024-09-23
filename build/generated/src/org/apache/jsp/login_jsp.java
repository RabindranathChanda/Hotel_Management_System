package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css\"\n");
      out.write("              integrity=\"sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==\"\n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"Assets/Styles/login.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Assets/Styles/Img/logo.png\" type=\"image/x-icon\">\n");
      out.write("        <title>ITC - Royal Bengal | Login</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Hero Section -->\n");
      out.write("        <section class=\"loginBack\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2>Login</h2>\n");
      out.write("                <form action=\"\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" required>\n");
      out.write("                        <label>Username</label>\n");
      out.write("                        <i class=\"fa-solid fa-user\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"password\" id=\"pass\" required>\n");
      out.write("                        <label>Password</label>\n");
      out.write("                        <i class=\"fa-solid fa-eye-slash\" id=\"togglepass\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <p>\n");
      out.write("                        <input type=\"checkbox\"> Remember Me. <a href=\"#\">Forget Password</a>\n");
      out.write("                    </p>\n");
      out.write("                    <input id=\"btn\" type=\"button\" value=\"Login\">\n");
      out.write("                    <p>\n");
      out.write("                        Don't have an account? <a href=\"register.jsp\">Register</a><br>                \n");
      out.write("                        Are you an Admin? <a href=\"adminlogin.jsp\">Login</a>\n");
      out.write("                    </p>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!-- End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Js  -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("                integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Own Js -->\n");
      out.write("        <script src=\"Assets/JS/login.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
