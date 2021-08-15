<%-- 
    Document   : add
    Created on : Oct 7, 2020, 10:13:51 PM
    Author     : fsoft
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Add new account</h2>
        <form action="add" method="POST">
            Name: <input type="text" value="" name="name" />
            <br/>
            Password: <input type="text" value="" name="password" />
            <br/>
            Score: <input type="text" value="" name="score" />
            <br/>
            Level: <input type="text" value="" name="level" />
            <br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
