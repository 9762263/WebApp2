<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
    <head>
    <meta charset="UTF-8">
        <title>
            Hello World Sample
        </title>
    </head>
 
    <body>

        <h1>
            <%
        String name = request.getParameter("name");
        if (name == null || name.length() == 0) {
            %>
            Привет, world !
            <%            } else {
            %>
            Hello, world ! I'm <%= name%>
            <%
        }
        
            %>
        </h1>
        Имя вашего хоста: <%= request.getRemoteHost() %>
        <br>
        <h3>Этот пример показывает, как работать с выражениями JSP</h3>
        <br>
    Текущая дата: <%= new java.util.Date()%>
    <br>
       <h1>JSP Страница с декларациями и скриптлетами</h1>
<h3> Этот пример показывает, как работать с декларациями и скриптлетами</h3>
<!-- Декларируем переменную count-->
   <%! private int count = 0; %>
    Страница была показана <%= ++count %> раз.
    <br>
     <br>
<form name="forma1" action="Hello.jsp" method="GET">
		 Имя: <input type="text" name="name">
		 		 <p>
			<input type="submit" value="далее">
		</p>
		 </form>
    </body>
</html>