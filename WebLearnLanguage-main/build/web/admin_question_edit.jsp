<%-- 
    Document   : edit
    Created on : Oct 7, 2020, 10:00:27 PM
    Author     : fsoft
--%>

<%@page import="model.Question"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            Question s = (Question) request.getAttribute("question");
        %>
    </head>
    <body>
        <form action="editq" method="POST">
            ID: <%=s.getId()%> 
            <input type="hidden" value="<%=s.getId()%>" name="id"/>
            <br/>
            Language Code: <input type="hidden" value="<%=s.getLangCode()%>" name="name" />
            <br/>
            Lesson: <input type="text" value="<%=s.getLesson()%>" name="password" />
            <br/>
            Question: <input type="text" value="<%=s.getQues()%>" name="score" />
            <br/>
            Answer 1: <input type="text" value="<%=s.getAns1()%>" name="ans1" />
            <br/>
            Answer 2: <input type="text" value="<%=s.getAns2()%>" name="ans2" />
            <br/>
            Answer 3: <input type="text" value="<%=s.getAns3()%>" name="ans3" />
            <br/>
            Answer 4: <input type="text" value="<%=s.getAns4()%>" name="ans3" />
            <br/>
            Correct answer: <input type="text" value="<%=s.getCorrect()%>" name="correct" />
            <br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>

