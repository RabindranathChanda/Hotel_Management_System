package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addrooms_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"Assets/Styles/dash.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Assets/Styles/Img/logo.png\" type=\"image/x-icon\">\n");
      out.write("        <title>ITC - Royal Bengal</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- Sidebar -->\n");
      out.write("                <nav id=\"sidebar\" class=\"col-md-3 col-lg-2 d-md-block sidebar collapse\">\n");
      out.write("                    <h1 class=\"text-center text-white my-4\">Name\n");
      out.write("                        <hr>\n");
      out.write("                    </h1>\n");
      out.write("                    <div class=\"position-sticky\">\n");
      out.write("                        <ul class=\"nav flex-column p-3\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active\" data-target=\"profile\" href=\"#\">\n");
      out.write("                                    <i class=\"fa-solid fa-user\"></i>\n");
      out.write("                                    Profile\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"dash.jsp\" data-target=\"bookNow\">\n");
      out.write("                                    <i class=\"fa-solid fa-house\"></i>\n");
      out.write("                                    Dashboard\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"addrooms.jsp\" data-target=\"bookNow\">\n");
      out.write("                                    <i class=\"fa-solid fa-pen\"></i>\n");
      out.write("                                    Add Rooms\n");
      out.write("                                </a>\n");
      out.write("                            </li>                            \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"bookroom.jsp\" data-target=\"bookNow\">\n");
      out.write("                                    <i class=\"fa-solid fa-calendar-check\"></i>\n");
      out.write("                                    Book Now\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"bookings.jsp\" data-target=\"bookings\">\n");
      out.write("                                    <i class=\"fa-solid fa-list\"></i>\n");
      out.write("                                    Bookings\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link text-danger\" href=\"#\" data-target=\"logout\">\n");
      out.write("                                    <i class=\"fa-solid fa-sign-out-alt\"></i>\n");
      out.write("                                    Logout\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <main class=\"col-md-9 ms-sm-auto col-lg-10 px-md-4 my-3\">\n");
      out.write("                    <div\n");
      out.write("                        class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom\">\n");
      out.write("                        <h1 class=\"h2\">Add Rooms</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div id=\"content\">\n");
      out.write("                            <div class=\"content-section act\" id=\"profile\">\n");
      out.write("                                <form action=\"addroomsServlet\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                                    <!-- Room Picture Upload -->\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"roomPic\" class=\"form-label\">Room Picture</label>\n");
      out.write("                                        <input class=\"form-control\" type=\"file\" name=\"roomPic\" id=\"roomPic\" accept=\"image/*\" required>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!-- Room Name -->\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"roomName\" class=\"form-label\">Room Name</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"roomName\" id=\"roomName\" placeholder=\"Enter room name\"\n");
      out.write("                                               required>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!-- Room Description -->\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"roomDesc\" class=\"form-label\">Room Description</label>\n");
      out.write("                                        <textarea class=\"form-control\" id=\"roomDesc\" name=\"roomDesc\" rows=\"4\"\n");
      out.write("                                                  placeholder=\"Enter room description\" required></textarea>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!-- Room Type -->\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <label for=\"roomType\" class=\"form-label\">Room Type</label>\n");
      out.write("                                        <select class=\"form-select\" id=\"roomType\" name=\"roomType\" required>\n");
      out.write("                                            <option value=\"\" disabled selected>Select room type</option>\n");
      out.write("                                            <option value=\"AC\">A.C.</option>\n");
      out.write("                                            <option value=\"NAC\">Non A.C.</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!-- Submit Button -->\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\">Add Room</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Add this toast HTML anywhere inside your JSP page -->\n");
      out.write("        <div class=\"toast-container position-fixed bottom-0 end-0 p-3\">\n");
      out.write("            <div id=\"successToast\" class=\"toast align-items-center text-white bg-success border-0\" role=\"alert\" aria-live=\"assertive\" aria-atomic=\"true\">\n");
      out.write("                <div class=\"d-flex\">\n");
      out.write("                    <div class=\"toast-body\">\n");
      out.write("                        Room added successfully!\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"button\" class=\"btn-close btn-close-white me-2 m-auto\" data-bs-dismiss=\"toast\" aria-label=\"Close\"></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"errorToast\" class=\"toast align-items-center text-white bg-danger border-0\" role=\"alert\" aria-live=\"assertive\" aria-atomic=\"true\">\n");
      out.write("                <div class=\"d-flex\">\n");
      out.write("                    <div class=\"toast-body\">\n");
      out.write("                        Failed to add room. Please try again!\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"button\" class=\"btn-close btn-close-white me-2 m-auto\" data-bs-dismiss=\"toast\" aria-label=\"Close\"></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Js  -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Own Js -->\n");
      out.write("        <script src=\"Assets/JS/addrooms.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
