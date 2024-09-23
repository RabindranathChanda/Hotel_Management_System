package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class bookroom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                            </li>\n");
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
      out.write("                        <h1 class=\"h2\">Book Your Room Now!</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div id=\"content\">\n");
      out.write("                            <div class=\"content-section act\" id=\"profile\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");

                                        // Database connection parameters
                                        String url = "jdbc:mysql://localhost:3306/online";
                                        String user = "root";
                                        String password = "";

                                        // Initialize database connection and query
                                        Connection conn = null;
                                        Statement stmt = null;
                                        ResultSet rs = null;

                                        try {
                                            Class.forName("com.mysql.jdbc.Driver"); // Load MySQL JDBC Driver
                                            conn = DriverManager.getConnection(url, user, password); // Establish connection

                                            // Query to fetch room details
                                            String sql = "SELECT * FROM roomcard"; // Adjust table and column names
                                            stmt = conn.createStatement();
                                            rs = stmt.executeQuery(sql);

                                            // Loop through the result set
                                            while (rs.next()) {
                                                String id = rs.getString("id");
                                                String picName = (String) rs.getString("roomPic");
                                                String roomName = (String) rs.getString("roomName");
                                                String roomPrice = (String) rs.getString("roomPrice");
                                                String roomDesc = (String) rs.getString("roomDesc");
                                                String roomType = (String) rs.getString("roomType");
                                    
      out.write("\n");
      out.write("                                    <div class=\"col-md-4 mb-4\">\n");
      out.write("                                        <div class=\"card\" style=\"width: 23rem;\">\n");
      out.write("                                            <img src=\"Assets/uplRoomImg/");
      out.print( picName);
      out.write("\" class=\"card-img-top\" alt=\"");
      out.print( roomName);
      out.write("\">\n");
      out.write("                                            <div class=\"card-body\">\n");
      out.write("                                                <p class=\"card-text\" hidden>");
      out.print( id);
      out.write("</p>\n");
      out.write("                                                <h5 class=\"card-title\">");
      out.print( roomName);
      out.write("</h5>\n");
      out.write("                                                <p class=\"card-text\">");
      out.print( roomPrice);
      out.write("</p>                                                \n");
      out.write("                                                <p class=\"card-text\">");
      out.print( roomDesc);
      out.write("</p>                                                \n");
      out.write("                                                <p class=\"card-text\">");
      out.print( roomType);
      out.write("</p>\n");
      out.write("                                                <!--<a href=\"#\" class=\"btn btn-primary\">Book Now</a>-->\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-primary book-now-btn\" data-room-name=\"");
      out.print( roomName);
      out.write("\" data-room-type=\"");
      out.print( roomType);
      out.write("\" data-price=\"");
      out.print( roomPrice);
      out.write("\">Book Now</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");

                                            }
                                        } catch (SQLException e) {
                                            e.printStackTrace();
                                        } catch (ClassNotFoundException e) {
                                            e.printStackTrace();
                                        } finally {
                                            // Close resources
                                            if (rs != null) {
                                                try {
                                                    rs.close();
                                                } catch (SQLException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                            if (stmt != null) {
                                                try {
                                                    stmt.close();
                                                } catch (SQLException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                            if (conn != null) {
                                                try {
                                                    conn.close();
                                                } catch (SQLException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        }
                                    
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Book Now Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"bookRoomModal\" tabindex=\"-1\" aria-labelledby=\"bookRoomModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"bookRoomModalLabel\">Book Room</h5>\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form id=\"bookingForm\" method=\"POST\" action=\"bookroomServlet\">\n");
      out.write("                            <!-- Fields to be filled by the user -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"name\" class=\"form-label\">Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"phone\" class=\"form-label\">Phone</label>\n");
      out.write("                                <input type=\"tel\" class=\"form-control\" id=\"phone\" name=\"phone\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"email\" class=\"form-label\">Email</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Auto-filled fields -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"roomName\" class=\"form-label\">Room Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"roomName\" name=\"roomName\" disabled>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"roomType\" class=\"form-label\">Room Type</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"roomType\" name=\"roomType\" disabled>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"chkInDate\" class=\"form-label\">Check-in Date</label>\n");
      out.write("                                <input type=\"date\" class=\"form-control\" id=\"chkInDate\" name=\"chkInDate\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"chkInTime\" class=\"form-label\">Check-in Time</label>\n");
      out.write("                                <input type=\"time\" class=\"form-control\" id=\"chkInTime\" name=\"chkInTime\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"chkOutDate\" class=\"form-label\">Check-out Date</label>\n");
      out.write("                                <input type=\"date\" class=\"form-control\" id=\"chkOutDate\" name=\"chkOutDate\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"chkOutTime\" class=\"form-label\">Check-out Time</label>\n");
      out.write("                                <input type=\"time\" class=\"form-control\" id=\"chkOutTime\" name=\"chkOutTime\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"noOfRooms\" class=\"form-label\">Number of Rooms</label>\n");
      out.write("                                <input type=\"number\" class=\"form-control\" id=\"noOfRooms\" name=\"noOfRooms\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"totalPrice\" class=\"form-label\">Total Price</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"totalPrice\" name=\"totalPrice\" disabled>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"toast-container position-fixed bottom-0 end-0 p-3\">\n");
      out.write("            <div id=\"successToast\" class=\"toast align-items-center text-white bg-success border-0\" role=\"alert\" aria-live=\"assertive\" aria-atomic=\"true\">\n");
      out.write("                <div class=\"d-flex\">\n");
      out.write("                    <div class=\"toast-body\">\n");
      out.write("                        Room Booked successfully! Redirecting to Bookings\n");
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
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- Bootstrap Js  -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("                integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <!-- Own Js -->\n");
      out.write("        <script src=\"Assets/JS/bookroom.js\"></script>\n");
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
