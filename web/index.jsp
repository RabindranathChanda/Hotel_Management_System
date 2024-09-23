<%-- 
    Document   : index
    Created on : Sep 22, 2024, 10:37:56 AM
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
        <link rel="stylesheet" href="Assets/Styles/index.css">
        <link rel="shortcut icon" href="Assets/Styles/Img/logo.png" type="image/x-icon">
        <title>ITC - Royal Bengal</title>
    </head>

    <body>
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg fixed-top">
            <div class="container-fluid">
                <a class="navbar-brand me-auto">ITC Royal Bengal <br />
                    <h6 class="text-secondary">A Luxury Hotel in Your City Kolkata</h6>
                </a>

                <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar"
                     aria-labelledby="offcanvasNavbarLabel">
                    <div class="offcanvas-header">
                        <h5 class="offcanvas-title" id="offcanvasNavbarLabel">ITC Royal Bengal</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div class="offcanvas-body">
                        <ul class="navbar-nav justify-content-center flex-grow-1 pe-3">
                            <li class="nav-item">
                                <a class="nav-link mx-lg-2 active" href="#hero-section">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link mx-lg-2" href="#service">Services</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link mx-lg-2" href="#rooms">Rooms</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link mx-lg-2" href="#overview">Contact</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link mx-lg-2" href="#footer">About</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <a href="login.jsp" class="Login-button">Login</a>
                <button class="navbar-toggler pe-0" type="button" data-bs-toggle="offcanvas"
                        data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </div>
        </nav>
        <!-- End -->

        <!-- Hero Section -->
        <section class="hero-section" id="hero-section">
            <div class="container d-flex align-items-center justify-content-center fs-1 text-white flex-column">
                <h1><br><br><br><br><br><br><br><br><br><br><br><br>ITC Royal Bengal is a 5-star luxury hotel in Kolkata, India. Located along the Eastern Metropolitan Bypass.</h1>

                <h3> <br>itis the 14th luxury hotel of ITC Hotels. Built on an area of 4.16 lakh square feet, the construction cost of
                    this hotel is ₹1400 crore. The ITC Royal Bengal has a 61,000 sq. ft. grand banquette, and 16,400 sq. ft.
                    pillarless banquette. The hotel was opened in June 2019.                
                </h3>
            </div>
        </section>
        <!-- End -->


        <!-- Services -->
        <section class="service" id="service">

            <div class="card mb-3 border-0" style="max-width: 1200px; margin: 0 auto;">
                <div class="row g-0 align-items-center">
                    <div class="col-md-4">
                        <img src="Assets/Styles/Img/Rooms/design-detailing.png" class="img-fluid rounded-start" alt="...">
                    </div>
                    <div class="col-md-8 d-flex flex-column justify-content-center text-center">
                        <div class="card-body"> <!-- Added mt-3 here -->
                            <h3 class="card-title">DESIGNING & DETAILING
                                <hr />
                            </h3>
                            <p class="card-text">The hotel is an exquisite ode to Bengal’s timeless architecture and design.
                                It celebrates distinctive architectural elements and nuances visible in many iconic
                                buildings of Kolkata and the region. Clusters of ionic pillars, small pediments, arches,
                                blind arcades, colonnades and terraces distribute the building’s enormous mass to graceful
                                proportions. The interior décor, art and artefacts celebrate the past and present of
                                bountiful Bengal.</p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="card mb-3 border-0" style="max-width: 1200px; margin: 0 auto;">
                <div class="row g-0 align-items-center">
                    <div class="col-md-8  d-flex flex-column justify-content-center text-center">
                        <div class="card-body">
                            <h3 class="card-title">SUSTAINABILITY
                                <hr />
                            </h3>
                            <p class="card-text">This LEED Platinum certified hotel, ensures that the promise of luxury is
                                upheld while the planet is protected with sensitivity. The hotel operations are conducted in
                                a manner to have a positive impact on the planet and the community while delivering
                                authentic indigenous experiences.</p>
                        </div>

                    </div>
                    <div class="col-md-4">
                        <img src="Assets/Styles/Img/Rooms/sustainability.png" class="img-fluid rounded-start" alt="...">
                    </div>
                </div>
            </div>

            <div class="card mb-3 border-0" style="max-width: 1200px; margin: 0 auto;">
                <div class="row g-0 align-items-center">
                    <div class="col-md-4">
                        <img src="Assets/Styles/Img/Rooms/dining.png" class="img-fluid rounded-start" alt="...">
                    </div>
                    <div class="col-md-8 d-flex flex-column justify-content-center text-center">
                        <div class="card-body">
                            <h3 class="card-title">CUISINE
                                <hr />
                            </h3>
                            <p class="card-text">Bengal has been the melting pot of cultures from across India & overseas
                                and offers a wealth of cuisines. The hotel celebrates the culinary heritage of the region
                                while also offering delectable global cuisines to gourmet connoisseurs. From celebrating the
                                exuberance of the variety of cuisines from the bazaars of Kolkata to menus adapted from the
                                ancient philosophies of Ayurveda, a truly extraordinary culinary journey awaits.</p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="card mb-3 border-0 " style="max-width: 1200px; margin: 0 auto;">
                <div class="row g-0  align-items-center">
                    <div class="col-md-8  d-flex flex-column justify-content-center text-center">
                        <div class="card-body">
                            <h3 class="card-title">
                                WELLBEING
                                <hr />
                            </h3>
                            <p class="card-text">Inviting and expansive, Kaya Kalp – The Royal Spa promotes health,
                                relaxation and inner peace through a wide selection of Ayurvedic, international and
                                indigenous therapies. Promoting holistic wellbeing & fitness the hotel offers healthy
                                cuisine offerings, personalized fitness regimes, a conducive sleep environment and exclusive
                                amenities & facilities.</p>
                        </div>

                    </div>
                    <div class="col-md-4">
                        <img src="Assets/Styles/Img/Rooms/wellness.png" class="img-fluid rounded-start" alt="...">
                    </div>
                </div>
            </div>

        </section>
        <!-- End -->


        <!-- Rooms -->
        <section class="rooms" id="rooms">
            <div class="container">
                <!-- Section Heading -->
                <h1 class="text-center my-5 py-4">Rooms
                    <hr>
                </h1>

                <div class="row">
                    <!-- First Card -->
                    <div class="col-md-6 col-lg-4">
                        <div class="card cardshadow h-100 d-flex flex-column">
                            <img src="Assets/Styles/Img/Rooms/a.jpg" class="card-img-top img-fluid" alt="...">
                            <div class="card-body d-flex flex-column justify-content-between">
                                <div>
                                    <p class="card-text h4">Towers Exclusive</p>
                                    <p class="card-text text-secondary">
                                        Elegantly appointed spacious rooms with smart entertainment & room
                                        features controllable from a mobile device.<br>
                                        Room size: 49 m²<br>
                                        iPad interface to control in-room features.
                                    </p>
                                </div>
                                <a href="#" class="btn btn-success mt-3 align-self-center anibtn">Book Now</a>
                            </div>
                        </div>
                    </div>

                    <!-- Second Card -->
                    <div class="col-md-6 col-lg-4">
                        <div class="card cardshadow h-100 d-flex flex-column">
                            <img src="Assets/Styles/Img/Rooms/e.png" class="card-img-top img-fluid" alt="...">
                            <div class="card-body d-flex flex-column justify-content-between">
                                <div>
                                    <p class="card-text h4">ITC One</p>
                                    <p class="card-text text-secondary">
                                        Spacious smart suites with breath-taking views of the East Kolkata Wetlands.
                                        Efficient butler services & the Lavendria Valet Cabinet for seamless & prompt
                                        attention to your laundry needs.
                                        Room size: 68 m²
                                        Luxury hours
                                        iPad interface to control in-room features.
                                    </p>
                                </div>
                                <a href="#" class="btn btn-success mt-3 align-self-center anibtn">Book Now</a>
                            </div>
                        </div>
                    </div>

                    <!-- Third Card -->
                    <div class="col-md-6 col-lg-4">
                        <div class="card cardshadow h-100 d-flex flex-column">
                            <img src="Assets/Styles/Img/Rooms/f.jpg" class="card-img-top img-fluid" alt="...">
                            <div class="card-body d-flex flex-column justify-content-between">
                                <div>
                                    <p class="card-text h4">Luxury Suite</p>
                                    <p class="card-text text-secondary">
                                        Experience the privacy of a separate bedroom with living & dining areas to entertain
                                        guests. A four-fixture bathroom, separate powder room & efficient butler services
                                        make for a luxurious stay.
                                        Room size: 98 m²
                                        Luxury hours
                                        iPad interface to control in-room features.
                                    </p>
                                </div>
                                <a href="#" class="btn btn-success mt-3 align-self-center anibtn">Book Now</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="text-center">
                    <a href="#" class="btn btn-success anibtn">View All Rooms</a>
                    <hr>
                </div>
            </div>
        </section>



        <!-- End -->

        <!-- Contact -->
        <section class="overview" id="overview">
            <h1>ONE OF A KIND
                <hr />
            </h1>
            <div class="card mb-3 cardshadow" style="max-width: 1100px;height: 390px;">
                <div class="row g-0">
                    <div class="col-md-4">
                        <img src="Assets/Styles/Img/Hotel/a.jpg" style="height: 388px;" class="img-fluid rounded-start"
                             alt="...">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Indulge In The Art Of Luxury Living ...
                                <hr />
                            </h5>
                            <p class="card-text">Located in the heart of the city, the magnificent LEED Platinum certified
                                ITC Royal Bengal rises tall over the skyscape as an exemplar of refinement and luxury. An
                                ode to the region’s heritage, its 456 rooms and suites include 82 serviced apartments. Its 7
                                dining destinations offer a wide and eclectic selection of local and global gourmet. From
                                corporate events at Kolkata’s largest pillar-less banquet hall, to indulgences at our luxury
                                spa, we’ll make every moment memorable.</p>
                            <div class="row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <div class="card-body">
                                        <h5 class="card-title">Location
                                            <hr />
                                        </h5>
                                        <p class="card-text location"><i class="fa-solid fa-location-dot"></i>&nbsp;&nbsp;1
                                            JBS, Haldane Avenue, Kolkata - 700046.</p>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="card-body">
                                        <h5 class="card-title">Hotel Contact Details
                                            <hr />
                                        </h5>
                                        <p class="card-text location"><i class="fa-solid fa-phone"></i>&nbsp;&nbsp;+91 33
                                            44464646<br><i
                                                class="fa-solid fa-envelope"></i>&nbsp;&nbsp;&nbsp;&nbsp;reservations@itchotels.in
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- End -->


        <!-- Footer -->
        <section id="footer">
            <footer>
                <div class="footer-container">
                    <div class="footer-column">
                        <h3>EXPLORE</h3>
                        <ul>
                            <li>Our Story</li>
                            <li>Responsible Luxury</li>
                            <li>Hotels & Resorts</li>
                            <li>Offers & Experiences</li>
                            <li>Dining</li>
                            <li>Meetings & Socials</li>
                            <li>Weddings</li>
                            <li>Wellness</li>
                            <li>Gift Cards</li>
                            <li>New & Upcoming Hotels</li>
                            <li>ITC Limited</li>
                            <li>The Luxury Collection</li>
                        </ul>
                    </div>
                    <div class="footer-column">
                        <h3>MEMBERSHIP</h3>
                        <ul>
                            <li>Club ITC</li>
                            <li>Club ITC Culinaire</li>
                            <li>Welcomlink</li>
                        </ul>
                    </div>
                    <div class="footer-column">
                        <h3>CONNECT WITH US</h3>
                        <ul>
                            <li>Assistance</li>
                            <li>Feedback</li>
                            <li>Twitter Concierge</li>
                            <li>Contact Us</li>
                            <li>Hotel Development</li>
                        </ul>
                    </div>
                    <div class="footer-column">
                        <h3>TOP DESTINATIONS</h3>
                        <ul>
                            <li>New Delhi Hotels</li>
                            <li>Mumbai Hotels</li>
                            <li>Chennai Hotels</li>
                            <li>Bengaluru Hotels</li>
                            <li>Goa Hotels & Resorts</li>
                            <li>Hyderabad Hotels</li>
                            <li>Kolkata Hotels</li>
                            <li>Jaipur Hotels</li>
                            <li>Agra Hotels</li>
                            <li>Amritsar Hotels</li>
                            <li>Coimbatore Hotels</li>
                            <li>Port Blair Hotels</li>
                            <li>All Destinations</li>
                        </ul>
                    </div>
                    <div class="footer-column">
                        <h3>DISCOVER</h3>
                        <ul>
                            <li>WelcomZest Epicurean</li>
                            <li>SLEEEP Boutique</li>
                            <li>ITC's Hotel Group GDS Codes</li>
                        </ul>
                    </div>
                </div>
            </footer>
        </section>
        <!-- End -->



        <!-- Bootstrap Js  -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>



        <!-- Own Js -->
        <script src="Assets/JS/index.js"></script>

    </body>

</html>