<%-- 
    Document   : register
    Created on : Sep 22, 2024, 10:43:44 AM
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
        <link rel="stylesheet" href="Assets/Styles/reg.css">
        <link rel="shortcut icon" href="Assets/Styles/Img/logo.png" type="image/x-icon">
        <title>ITC - Royal Bengal | Register</title>
    </head>

    <body>

        <!-- Hero Section -->
        <section class="loginBack">
            <div class="container py-5">
                <div class="card text-white p-4 mx-auto reg-form-width">
                    <h2 class="text-center">Register</h2>
                    <form action="regUserServlet" method="post" enctype="multipart/form-data">
                        <div class="form-group mb-3 position-relative">                
                            <input type="text" class="form-control bg-transparent text-white" placeholder="Name" name="Name" required>
                        </div>
                        <div class="form-group mb-3 position-relative">
                            <input type="text" class="form-control bg-transparent text-white" placeholder="Username" name="Username" required>
                        </div>
                        <div class="form-group mb-3 position-relative">                    
                            <input type="password" id="pass" class="form-control bg-transparent text-white" placeholder="Password" name="Password" required>
                            <i class="fa-solid fa-eye-slash" id="togglepass"></i>
                        </div>
                        <div class="form-group mb-3 position-relative">                    
                            <input type="text" class="form-control bg-transparent text-white" placeholder="Phone" name="Phone" required>
                        </div>
                        <div class="form-group mb-4 position-relative">
                            <input type="email" class="form-control bg-transparent text-white" placeholder="Email" name="Email" required>
                        </div>
                        <input id="btn" type="submit" class="btn btn-light w-100 py-2" value="Register">
                        <p class="mt-3">
                            Already have an account? <a href="login.jsp">Login</a><br>                
                        </p>
                    </form>
                </div>
            </div>
        </section>
        
        
        <div class="toast-container position-fixed bottom-0 end-0 p-3">             
            <div id="errorToast" class="toast align-items-center text-white bg-danger border-0" role="alert" aria-live="assertive" aria-atomic="true">
                <div class="d-flex">
                    <div class="toast-body">
                        Registration Failed! Try Again..
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
        <script src="Assets/JS/reg.js"></script>

    </body>

</html>
