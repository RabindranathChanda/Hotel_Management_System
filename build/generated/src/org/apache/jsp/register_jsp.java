package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"Assets/Styles/reg.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Assets/Styles/Img/logo.png\" type=\"image/x-icon\">\n");
      out.write("        <title>ITC - Royal Bengal | Register</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Hero Section -->\n");
      out.write("        <section class=\"loginBack\">\n");
      out.write("            <div class=\"container py-5\">\n");
      out.write("                <div class=\"card text-white p-4 mx-auto reg-form-width\">\n");
      out.write("                    <h2 class=\"text-center\">Register</h2>\n");
      out.write("                    <form action=\"\" method=\"post\" class=\"mt-3\">\n");
      out.write("                        <div class=\"form-group mb-3 position-relative\">\n");
      out.write("                            <label class=\"form-label text-white\">Name</label>                    \n");
      out.write("                            <input type=\"text\" class=\"form-control bg-transparent text-white\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group mb-3 position-relative\">\n");
      out.write("                            <label class=\"form-label text-white\">Username</label>                    \n");
      out.write("                            <input type=\"text\" class=\"form-control bg-transparent text-white\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group mb-3 position-relative\">\n");
      out.write("                            <label class=\"form-label text-white\">Password</label>                    \n");
      out.write("                            <input type=\"password\" id=\"pass\" class=\"form-control bg-transparent text-white\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group mb-3 position-relative\">\n");
      out.write("                            <label class=\"form-label text-white\">Phone</label>                    \n");
      out.write("                            <input type=\"tel\" class=\"form-control bg-transparent text-white\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group mb-4 position-relative\">\n");
      out.write("                            <label class=\"form-label text-white\">Email</label>                    \n");
      out.write("                            <input type=\"email\" class=\"form-control bg-transparent text-white\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <input id=\"btn\" type=\"submit\" class=\"btn btn-light w-100 py-2\" value=\"Register\">\n");
      out.write("                        <p class=\"mt-3\">\n");
      out.write("                            Already have an account? <a href=\"login.jsp\">Login</a><br>                \n");
      out.write("                        </p>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Toast Container -->\n");
      out.write("        <div class=\"position-fixed bottom-0 end-0 p-3\" style=\"z-index: 11\">\n");
      out.write("            <div id=\"liveToast\" class=\"toast align-items-center text-bg-primary border-0\" role=\"alert\" aria-live=\"assertive\" aria-atomic=\"true\">\n");
      out.write("                <div class=\"d-flex\">\n");
      out.write("                    <div class=\"toast-body\">\n");
      out.write("                        Registration successful!\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"button\" class=\"btn-close btn-close-white me-2 m-auto\" data-bs-dismiss=\"toast\" aria-label=\"Close\"></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Js  -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("                integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <!-- Own Js -->\n");
      out.write("        <script src=\"Assets/JS/reg.js\"></script>\n");
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
