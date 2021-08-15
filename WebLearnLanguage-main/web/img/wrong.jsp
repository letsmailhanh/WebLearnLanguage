<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : correct
    Created on : Apr 1, 2021, 11:40:21 PM
    Author     : Hanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
                        a, button, input[type=button], input[type=submit], input[type=reset] {
                background-color: #4CAF50;
                border: none;
                color: white;
                padding: 16px 32px;
                text-decoration: none;
                margin: 4px 2px;
                cursor: pointer;
            }
        </style>
    </head>
    
    <body>
        <h1>You got it wrong</h1>
       <h1> The correct answer is "${answer}"</h1>
       <input type="button" value="Continue" onclick="history.back()"/>
    </body>
</html>