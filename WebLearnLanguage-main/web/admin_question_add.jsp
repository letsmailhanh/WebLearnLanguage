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
        <h2>Add new question</h2>
        <form action="addq" method="POST">
            Lesson: <input type="text" value="" name="lesson" />
            <br/>
            Question: <input type="text" value="" name="question" />
            <br/>
            Answer 1: <input type="text" value="" name="ans1" />
            <br/>
            Answer 2: <input type="text" value="" name="ans2" />
            <br/>
            Answer 3: <input type="text" value="" name="ans3" />
            <br/>
            Answer 4: <input type="text" value="" name="ans4" />
            <br/>
            Correct answer: <input type="text" value="" name="correct" />
            <br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
