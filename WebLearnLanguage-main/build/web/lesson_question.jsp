<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : test.jsp
    Created on : Mar 30, 2021, 11:09:00 AM
    Author     : Hanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            /* The container */
            .container {
                display: block;
                position: relative;
                padding-left: 35px;
                margin-bottom: 12px;
                cursor: pointer;
                font-size: 22px;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                user-select: none;
            }

            /* Hide the browser's default radio button */
            .container input {
                position: absolute;
                opacity: 0;
                cursor: pointer;
            }

            /* Create a custom radio button */
            .checkmark {
                position: absolute;
                top: 0;
                left: 0;
                height: 25px;
                width: 25px;
                background-color: #eee;
                border-radius: 50%;
            }

            /* On mouse-over, add a grey background color */
            .container:hover input ~ .checkmark {
                background-color: #ccc;
            }

            /* When the radio button is checked, add a blue background */
            .container input:checked ~ .checkmark {
                background-color: #2196F3;
            }

            /* Create the indicator (the dot/circle - hidden when not checked) */
            .checkmark:after {
                content: "";
                position: absolute;
                display: none;
            }

            /* Show the indicator (dot/circle) when checked */
            .container input:checked ~ .checkmark:after {
                display: block;
            }

            /* Style the indicator (dot/circle) */
            .container .checkmark:after {
                top: 9px;
                left: 9px;
                width: 8px;
                height: 8px;
                border-radius: 50%;
                background: white;
            }
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
        <input type="hidden" name="Lesson" value="${lesson}" />
        <% int count = 0;%>
        <c:forEach var="q" items="${questions}">
            <form action="Lesson_ListQuestions" method="POST">


                <%count++;%>


                <h2><%=count%>) ${q.ques}</h2>

                <label class="container">${q.ans1}

                    <input type="radio" name="ans" value="${q.ans1}" />
                    <span class="checkmark"></span>
                </label>
                <label class="container">${q.ans2}

                    <input type="radio" name="ans" value="${q.ans2}" />
                    <span class="checkmark"></span>
                </label>
                <label class="container">${q.ans3}

                    <input type="radio" name="ans" value="${q.ans3}" />
                    <span class="checkmark"></span>
                </label>
                <label class="container">${q.ans4}

                    <input type="radio" name="ans" value="${q.ans4}" />
                    <span class="checkmark"></span>
                </label>
                <input type="hidden" name="quesid" value="${q.id}" />
                <input type="submit" value="Submit" />              
            </form>
        </c:forEach>

        <br>

        <a href="lesson_ja.jsp">Finish quiz</a>
    </body>

</html>
