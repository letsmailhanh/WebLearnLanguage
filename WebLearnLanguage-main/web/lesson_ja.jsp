<%-- 
    Document   : lesson_ja
    Created on : Mar 29, 2021, 10:20:33 PM
    Author     : Hanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/gh/kenwheeler/slick@1.8.1/slick/slick-theme.css" />
        <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css" />
        <link href="https://cdn.lineicons.com/2.0/LineIcons.css" rel="stylesheet">

        <title>Learn language school</title>
        <style>
            #customers {
                font-family: Arial, Helvetica, sans-serif;
                border-collapse: collapse;
                width: 100%;
                text-align: center;
              
            }

            #customers td, #customers th {
                border: 1px solid #ddd;
                padding: 8px;
            }

            #customers tr:nth-child(even){background-color: #f2f2f2;}

            #customers tr:hover {background-color: #ddd;}

            #customers th {
                padding-top: 12px;
                padding-bottom: 12px;

                background-color: #4CAF50;
                color: white;
            }
            .topnav {
                overflow: hidden;
                background-color: #333;
                width: 100%;
                
            }

            .topnav a {
                float: left;
                color: #f2f2f2;
                text-align: center;
                padding: 14px 60px;
                text-decoration: none;
                font-size: 17px;
            }

            .topnav a:hover {
                background-color: #ddd;
                color: black;
            }

            .topnav a.active {
                background-color: #4CAF50;
                color: white;
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
                                <a class="dropdown-item" href="#">Chinese</a>
                                <a class="dropdown-item" href="#">English</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="lesson_ja.jsp">Japanese</a>
                            </div>

                        <li class="nav-item">
                            <a class="nav-link" href="#">Welcome ${name}</a>
                        </li>
                    </ul>    
                </div>
            </div>
        </nav>

        <div class="topnav">
            <a  href="Lesson_GetImages">Hiragana</a>
            <a href="Lesson_GetImages2">Katakana</a>
            <a  href="Lesson_ListVocab?id=1">Basic Greetings</a>
            <a class="active" href="lesson_ja.jsp">Do the quiz</a>
        </div>

         <h1>Quizzes</h1>               
        <table border="1" id="customers">            
            <tbody>
                <tr>
                    <th>Study new vocabularies</th>
                    <th>Do the quiz</th>
            <p>Let's do some quizzes to review your knowledge</p>
                </tr>
                <tr id = '2'>
                    <td><a href="Lesson_GetImages">Lesson 1 - Hiragana</a></td>
                    <td><a href="Lesson_ListQuestions?id=2">Hiragana 1</a></td>
                </tr>
                <tr id = '3'>
                    <td><a href="Lesson_GetImages2">Lesson 2 - Katakana</a></td>
                    <td><a href="Lesson_ListQuestions?id=3">Katakana 1</a></td>
                </tr>
                <tr id = '1'>
                    <td><a href="Lesson_ListVocab?id=1">Lesson 3 - Basic Greetings</a></td>
                    <td><a href="Lesson_ListQuestions?id=1">Basic Greetings 1</a></td>
                </tr>
                
            </tbody>
        </table>

    </body>
</html>
