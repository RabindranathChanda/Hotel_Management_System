<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
    // Disable caching to prevent back button access after logout
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0
    response.setDateHeader("Expires", 0); // Proxies
%>
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
                        <h1 class="h2">Add Rooms</h1>
                    </div>
                    <div class="container">
                        <div id="content">
                            <div class="content-section act" id="profile">
                                <form action="addroomsServlet" method="POST" enctype="multipart/form-data">
                                    <!-- Room Picture Upload -->
                                    <div class="mb-3">
                                        <label for="roomPic" class="form-label">Room Picture</label>
                                        <input class="form-control" type="file" name="roomPic" id="roomPic" accept="image/*" required>
                                    </div>

                                    <!-- Room Name -->
                                    <div class="mb-3">
                                        <label for="roomName" class="form-label">Room Name</label>
                                        <input type="text" class="form-control" name="roomName" id="roomName" placeholder="Enter room name"
                                               required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="roomPricee" class="form-label">Room Price</label>
                                        <input type="text" class="form-control" name="roomPrice" id="roomPrice" placeholder="Enter Price per Night"
                                               required>
                                    </div>

                                    <!-- Room Description -->
                                    <div class="mb-3">
                                        <label for="roomDesc" class="form-label">Room Description</label>
                                        <textarea class="form-control" id="roomDesc" name="roomDesc" rows="4"
                                                  placeholder="Enter room description" required></textarea>
                                    </div>

                                    <!-- Room Type -->
                                    <div class="mb-3">
                                        <label for="roomType" class="form-label">Room Type</label>
                                        <select class="form-select" id="roomType" name="roomType" required>
                                            <option value="" disabled selected>Select room type</option>
                                            <option value="AC">A.C.</option>
                                            <option value="NAC">Non A.C.</option>
                                        </select>
                                    </div>

                                    <!-- Submit Button -->
                                    <button type="submit" class="btn btn-primary">Add Room</button>
                                </form>
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
                        Room added successfully!
                    </div>
                    <button type="button" class="btn-close btn-close-white me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
                </div>
            </div>
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
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

        <!-- Own Js -->
        <script src="Assets/JS/addrooms.js"></script>
    </body>

</html>