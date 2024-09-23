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
                        if (name==null){
                            response.sendRedirect("login.jsp");
                        }
                        %>
                        <%= name %>
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
                        <h1 class="h2">Book Your Room Now!</h1>
                    </div>
                    <div class="container">
                        <div id="content">
                            <div class="content-section act" id="profile">
                                <div class="row">
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
                                            String User_Phone = (String) session.getAttribute("phone");
                                            String User_Email = (String) session.getAttribute("email");
                                            
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
                                    %>
                                    <div class="col-md-4 mb-4">
                                        <div class="card" style="width: 23rem;">
                                            <img src="Assets/uplRoomImg/<%= picName%>" class="card-img-top" alt="<%= roomName%>">
                                            <div class="card-body">
                                                <p class="card-text" hidden><%= id%></p>
                                                <h5 class="card-title"><%= roomName%></h5>
                                                <p class="card-text"><%= roomPrice%></p>                                                
                                                <p class="card-text"><%= roomDesc%></p>                                                
                                                <p class="card-text"><%= roomType%></p>
                                                <!--<a href="#" class="btn btn-primary">Book Now</a>-->
                                                <a href="#" class="btn btn-primary book-now-btn" data-user-name="<%= name %>" data-user-phone="<%= User_Phone %>" data-user-email="<%= User_Email %>" data-room-name="<%= roomName%>" data-room-type="<%= roomType%>" data-price="<%= roomPrice%>">Book Now</a>
                                            </div>
                                        </div>
                                    </div>
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
                    </div>
                </main>
            </div>
        </div>
        <!-- Book Now Modal -->
        <div class="modal fade" id="bookRoomModal" tabindex="-1" aria-labelledby="bookRoomModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="bookRoomModalLabel">Book Room</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form id="bookingForm" method="POST" action="bookroomServlet">
                            <!-- Fields to be filled by the user -->
                            <div class="mb-3">
                                <label for="name" class="form-label">Name</label>
                                <input type="text" class="form-control" id="name" name="name" required>
                            </div>
                            <div class="mb-3">
                                <label for="phone" class="form-label">Phone</label>
                                <input type="tel" class="form-control" id="phone" name="phone" required>
                            </div>
                            <div class="mb-3">
                                <label for="email" class="form-label">Email</label>
                                <input type="email" class="form-control" id="email" name="email" required>
                            </div>
                            <!-- Auto-filled fields -->
                            <div class="mb-3">
                                <label for="roomName" class="form-label">Room Name</label>
                                <input type="text" class="form-control" id="roomName" name="roomName" disabled>
                            </div>
                            <div class="mb-3">
                                <label for="roomType" class="form-label">Room Type</label>
                                <input type="text" class="form-control" id="roomType" name="roomType" disabled>
                            </div>
                            <div class="mb-3">
                                <label for="chkInDate" class="form-label">Check-in Date</label>
                                <input type="date" class="form-control" id="chkInDate" name="chkInDate" required>
                            </div>
                            <div class="mb-3">
                                <label for="chkInTime" class="form-label">Check-in Time</label>
                                <input type="time" class="form-control" id="chkInTime" name="chkInTime" required>
                            </div>
                            <div class="mb-3">
                                <label for="chkOutDate" class="form-label">Check-out Date</label>
                                <input type="date" class="form-control" id="chkOutDate" name="chkOutDate" required>
                            </div>
                            <div class="mb-3">
                                <label for="chkOutTime" class="form-label">Check-out Time</label>
                                <input type="time" class="form-control" id="chkOutTime" name="chkOutTime" required>
                            </div>
                            <div class="mb-3">
                                <label for="noOfRooms" class="form-label">Number of Rooms</label>
                                <input type="number" class="form-control" id="noOfRooms" name="noOfRooms" required>
                            </div>
                            <div class="mb-3">
                                <label for="totalPrice" class="form-label">Total Price</label>
                                <input type="text" class="form-control" id="totalPrice" name="totalPrice" disabled>
                            </div>
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        
        <div class="toast-container position-fixed bottom-0 end-0 p-3">            
            <div id="errorToast" class="toast align-items-center text-white bg-danger border-0" role="alert" aria-live="assertive" aria-atomic="true">
                <div class="d-flex">
                    <div class="toast-body">
                        Failed to add room. Please try again!
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
        <script src="Assets/JS/bookroom.js"></script>
    </body>

</html>