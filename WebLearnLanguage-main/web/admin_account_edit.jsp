<%-- 
    Document   : edit
    Created on : Oct 7, 2020, 10:00:27 PM
    Author     : fsoft
--%>

<%@page import="model.Account"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            Account s = (Account) request.getAttribute("account");
        %>
    </head>
    <body>
        <form action="edit" method="POST">
            ID: <%=s.getId()%> 
            <input type="hidden" value="<%=s.getId()%>" name="id"/>
            <br/>
            Name: <input type="text" value="<%=s.getName()%>" name="name" />
            <br/>
            Password: <input type="text" value="<%=s.getPassword()%>" name="password" />
            <br/>
            Score: <input type="text" value="<%=s.getScore()%>" name="score" />
            <br/>
            Level: <input type="text" value="<%=s.getLevel()%>" name="level" />
            <br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>

