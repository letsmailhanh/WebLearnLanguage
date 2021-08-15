<%-- 
    Document   : chooseLanguage.jsp
    Created on : Mar 25, 2021, 10:24:09 PM
    Author     : Hanh
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/gh/kenwheeler/slick@1.8.1/slick/slick-theme.css" />
        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css" />
        <link href="https://cdn.lineicons.com/2.0/LineIcons.css" rel="stylesheet">

        <title>Learn language school</title>
        <style>
            .button {
                background-color: white;
                border: 1px solid #4CAF50;
                color: #4CAF50;
                padding: 30px 50px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 25px;
                margin: auto;
                cursor: pointer;
                margin-right: 30px;
                margin-left: 70px;
                margin-top: 30px;
                border-radius: 10px;
            }
            .button:hover{
                background-color:#4CAF50;
                color:white
            }
            body{
                font-family: 'Montserrat', sans-serif;	
            }
            .medium-500{
                font-weight:500;	
            }
            .semi-bold{
                font-weight:600;	
            }
            .btn {
                padding: 13.5px 36px;
                font-weight: 700;
                border-radius: 30px;
                font-size: 13px;
                letter-spacing: 1px;
                text-transform: uppercase;
            }
            .btn-warning{
                color:#fff;	
            }
            .flags a img{
                width:70px;
                height:70px;
                margin-right:30px;	
            }
            .box-feature{
                background-color:#fba94b;	
            }
            .img-100{
                width:100%;
                height:auto;	
            }
            .card {
                border: 0;
                margin: 10px;
                outline: none;
                cursor: pointer;
            }
            .tt img{
                width:80px;
                height:80px;	
            }
            .slick-prev:before, .slick-next:before {
                color:#fba94b;;
            }
            .bb li{
                margin-bottom:5px;
            }
            .bb li a{
                font-size:13px;
                font-weight:600;
                color:#666;	
                transition:all 0.3s ease;
                text-decoration:none;
            }
            .bb li a:hover{
                color:#fba94b;	
            }
            .social-icons a {
                margin-right: 15px;
                color: #999;
            }
            .social-icons a:hover {
                color: #333;
            }
            @media(max-width:668px){
                .slick-prev, .slick-next{
                    display:none !important;	
                }
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand font-weight-bold" href="home2.html">Minna no Nihongo</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto medium-500">
                        <li class="nav-item active">
                            <a class="nav-link" href="home2.html">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Account_LogOut">Log out</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Courses
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Hiragana</a>
                                <a class="dropdown-item" href="#">Katakana</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="lesson_ja.jsp">Basic Greetings</a>
                            </div>

                        <li class="nav-item">
                            <a class="nav-link" href="#">Welcome ${name}</a>
                        </li>
                    </ul>    
                </div>
            </div>
        </nav>

                        <h2 style="margin-left:20%; margin-top: 10%">Choose your path!</h2>

        <div class="flags d-flex py-4">

            <a href="Lesson_GetImages" class="button">I am a beginner</a>
            <a href="lesson_ja.jsp" class="button">Do the quiz now</a>
            <input type="hidden" name="name" value="${name}"/>
        </div>
    </body>
</html>
