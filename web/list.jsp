<%@ page import="java.util.ArrayList" %>
<%@ page import="entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: Sidang
  Date: 7/6/2019
  Time: 10:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    ArrayList<Student> list =(ArrayList<Student>) request.getAttribute("list");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Student</h1>
<ul>
    <% for(int i = 0; i < list.size(); i++){%>
    <li><%= list.get(i).getUsername()%></li>
    <%}%>
</ul>
</body>
</html>
