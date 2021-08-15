<!DOCTYPE html>

<html lang="en" dir="ltr">

  <head>

    <meta charset="utf-8">

    <title>?Animated Login Form</title>


   
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
        body{

    margin: 0;

    padding: 0;

    font-family: sans-serif;

    background-color:white;

}

.box{

    width: 300px;

    padding: 40px;

    position: absolute;

    top: 50%;

    left: 50%;

    transform: translate(-50%,-50%);

    background: #fba94b;

    text-align: center;
    
    border-radius: 20px;
}

.box h1{

    color: white;

    text-transform: uppercase;

    font-weight: 500;

}

.box input[type = "text"],.box input[type = "password"]{

    border:0;

    background: none;

    display: block;

    margin: 20px auto;

    text-align: center;

    border: 2px solid #3498db;

    padding: 14px 10px;

    width: 200px;

    outline: none;

    color: white;

    border-radius: 24px;

    transition: 0.25s;

}

.box input[type = "text"]:focus,.box input[type = "password"]:focus{

    width: 280px;

    border-color: #2ecc71;

}

.box input[type = "submit"]{

    border:0;

    background: none;

    display: block;

    margin: 20px auto;

    text-align: center;

    border: 2px solid #2ecc71;

    padding: 14px 40px;

    outline: none;

    color: white;

    border-radius: 24px;

    transition: 0.25s;

    cursor: pointer;

}

.box input[type = "submit"]:hover{

    background: #2ecc71;

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
        <a class="nav-link" href="signup.jsp">Get started</a>
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
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#">For University</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#">Contact</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#">Blog</a>
      </li>
    </ul>    
  </div>
  </div>
</nav>
<form class="box" action="Account_Insert" method="get">

  <h1>Sign up</h1>

  <input type="text" name="username" placeholder="Username">

  <input type="password" name="password" placeholder="Create a password">
  
  <input type="submit" name="" value="Sign up">
  
  <a href="login.jsp">I am already a member</a>
</form>

  </body>

</html>