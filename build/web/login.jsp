<%-- 
    Document   : login
    Created on : Sep 22, 2024, 10:40:42 AM
    Author     : Rabindra
--%>

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
        <link rel="stylesheet" href="Assets/Styles/login.css">
        <link rel="shortcut icon" href="Assets/Styles/Img/logo.png" type="image/x-icon">
        <title>ITC - Royal Bengal | Login</title>
    </head>

    <body>

        <!-- Hero Section -->
        <section class="loginBack">
            <div class="container">
                <h2>Login</h2>
                <form action="loginServlet" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <input type="text" name="uname" required>
                        <label>Username</label>
                        <i class="fa-solid fa-user"></i>
                    </div>
                    <div class="form-group">
                        <input type="password" id="pass" name="pass" required>
                        <label>Password</label>
                        <i class="fa-solid fa-eye-slash" id="togglepass"></i>
                    </div>
                    <p>
                        <input type="checkbox"> Remember Me. <a href="#">Forget Password</a>
                    </p>
                    <input id="btn" type="submit" value="Login">
                    <p>
                        Don't have an account? <a href="register.jsp">Register</a><br>                
                        Are you an Admin? <a href="adminlogin.jsp">Login</a>
                    </p>
                </form>
            </div>

        </section>
        <!-- End -->

        <div class="toast-container position-fixed bottom-0 end-0 p-3"> 
            <div id="successToast" class="toast align-items-center text-white bg-success border-0" role="alert" aria-live="assertive" aria-atomic="true">
                <div class="d-flex">
                    <div class="toast-body">
                        Registration successfully! Login Now...
                    </div>
                    <button type="button" class="btn-close btn-close-white me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
                </div>
            </div>
            <div id="errorToast" class="toast align-items-center text-white bg-danger border-0" role="alert" aria-live="assertive" aria-atomic="true">
                <div class="d-flex">
                    <div class="toast-body">
                        Login Failed, Check Your Credentials!
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
        <script src="Assets/JS/login.js"></script>

    </body>

</html>
