<%@ page import="entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: Sidang
  Date: 7/6/2019
  Time: 10:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Student student =(Student) request.getAttribute("student");
    if (student==null){
        student= new Student();
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create Student</h1>
<form action="/student/create" method="post">
    Username: <input type="text" name="username" value="<%=student.getUsername()%>">
    <br>
    Password: <input type="text" name="password" value="<%=student.getPassword()%>">
    <br>
    Emaii: <input type="text" name="email" value="<%=student.getEmail()%>">
    <br>
    <input type="submit" value="REGISTER">
</form>
</body>
</html>
