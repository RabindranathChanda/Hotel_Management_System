<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.util.*" %>
<%
    // Disable caching to prevent back button access after logout
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0
    response.setDateHeader("Expires", 0); // Proxies
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css"
              integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="Assets/Styles/dash.css">
        <link rel="shortcut icon" href="Assets/Styles/Img/logo.png" type="image/x-icon">
        <title>ITC - Royal Bengal</title>
    </head>

    <body>
        <div class="container-fluid">
            <div class="row">
                <!-- Sidebar -->
                <nav id="sidebar" class="col-md-3 col-lg-2 d-md-block sidebar collapse">
                    <h1 class="text-center text-white my-4"><%
                        String name = (String) session.getAttribute("name");
                        if (name == null) {
                            response.sendRedirect("login.jsp");
                        }
                        %>
                        <%= name%>
                        <hr>
                    </h1>
                    <div class="position-sticky">
                        <ul class="nav flex-column p-3">
                            <li class="nav-item">
                                <a class="nav-link active" data-target="profile" href="#">
                                    <i class="fa-solid fa-user"></i>
                                    Profile
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="dash.jsp" data-target="bookNow">
                                    <i class="fa-solid fa-house"></i>
                                    Dashboard
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="addrooms.jsp" data-target="bookNow">
                                    <i class="fa-solid fa-pen"></i>
                                    Add Rooms
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="bookroom.jsp" data-target="bookNow">
                                    <i class="fa-solid fa-calendar-check"></i>
                                    Book Now
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="bookings.jsp" data-target="bookings">
                                    <i class="fa-solid fa-list"></i>
                                    Bookings
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-danger" href="logoutServlet" data-target="logout">
                                    <i class="fa-solid fa-sign-out-alt"></i>
                                    Logout
                                </a>
                            </li>
                        </ul>
                    </div>
                </nav>

                <!-- Main Content -->
                <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4 my-3">
                    <div
                        class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                        <h1 class="h2">Your Bookings</h1>
                    </div>
                    <div class="container">
                        <div id="content">
                            <div class="content-section act" id="profile">
                                <%
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
                                        String sql = "SELECT * FROM bookings"; // Adjust table and column names
                                        stmt = conn.createStatement();
                                        rs = stmt.executeQuery(sql);

                                        // Loop through the result set
                                        while (rs.next()) {
                                            String id = rs.getString("id");
                                            String Name = (String) rs.getString("name");
                                            String phone = (String) rs.getString("phone");
                                            String email = (String) rs.getString("email");
                                            String roomName = (String) rs.getString("roomName");
                                            String roomType = (String) rs.getString("roomType");
                                            String chkInTime = (String) rs.getString("chkInTime");
                                            String chkInDate = (String) rs.getString("chkInDate");
                                            String chkOutTime = (String) rs.getString("chkOutTime");
                                            String chkOutDate = (String) rs.getString("chkOutDate");
                                            String noofroom = (String) rs.getString("noofrooms");
                                            String roomPrice = (String) rs.getString("totalPrice");
                                %>
                                <!--card-->
                                <div class="card mb-3" style="width: 40rem;">
                                    <div class="card-body">
                                        <p hidden><%=id%></p>
                                        <h4 class="card-title"><%= roomName%> <i class="fa-solid fa-minus"></i> <%=roomType%><hr></h4>
                                        <h5 class="card-text"><%= Name%></h5>
                                        <h6><%= phone%> | <%= email%></h6><hr>
                                        <p class="card-text"><b>Check-In:</b> <%= chkInTime%> <i class="fa-solid fa-minus"></i> <%= chkInDate%> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Check-Out:</b> <%= chkOutTime%> <i class="fa-solid fa-minus"></i> <%= chkOutDate%></p>
                                        <p class="card-text"><b><%= noofroom%> rooms &nbsp;&nbsp;&nbsp; | &nbsp;&nbsp;&nbsp; <%=roomPrice%> /- Paid</b></p>
                                        <form action="deleteBookingServlet" method="POST">
                                            <input type="hidden" name="bookingId" value="<%= id%>">
                                            <button type="submit" class="btn btn-danger">Cancel Booking</button>
                                        </form>
                                    </div>
                                </div>
                                <!--card end-->
                                <%
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
                                %>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
        </div>




        <div class="toast-container position-fixed bottom-0 end-0 p-3">
            <div id="successToast" class="toast align-items-center text-white bg-success border-0" role="alert" aria-live="assertive" aria-atomic="true">
                <div class="d-flex">
                    <div class="toast-body">
                        Room Booked successfully!
                    </div>
                    <button type="button" class="btn-close btn-close-white me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
                </div>
            </div> 
            <div id="delSuccess" class="toast align-items-center text-white bg-success border-0" role="alert" aria-live="assertive" aria-atomic="true">
                <div class="d-flex">
                    <div class="toast-body">
                        Booking Canceled successfully!
                    </div>
                    <button type="button" class="btn-close btn-close-white me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
                </div>
            </div>
            <div id="errorToast" class="toast align-items-center text-white bg-danger border-0" role="alert" aria-live="assertive" aria-atomic="true">
                <div class="d-flex">
                    <div class="toast-body">
                        Booking Cannot Be Deleted! Contact Us Via Mail..
                    </div>
                    <button type="button" class="btn-close btn-close-white me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
                </div>
            </div> 
        </div>

        <!-- Bootstrap Js  -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>

        <!-- Own Js -->
        <script src="Assets/JS/bookings.js"></script>
    </body>

</html>