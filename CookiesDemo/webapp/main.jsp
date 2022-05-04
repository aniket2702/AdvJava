<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<% 
Cookie name= new Cookie("username", request.getParameter("username"));
Cookie age= new Cookie("age", request.getParameter("age"));
Cookie sex= new Cookie("sex", request.getParameter("sex"));
Cookie phone= new Cookie("phone", request.getParameter("phone"));

name.setMaxAge(25);
age.setMaxAge(25);
sex.setMaxAge(25);
phone.setMaxAge(25);

response.addCookie(name);
response.addCookie(age);
response.addCookie(sex);
response.addCookie(phone);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying Cookie Values</title>
</head>
<body>
<h1>Displaying Cookie Values</h1>
<p align="center">
<b>UserName </b><%=request.getParameter("username") %><br>
<b>Age </b><%=request.getParameter("age") %><br>
<b>Sex </b><%=request.getParameter("sex") %><br>
<b>Phone </b><%=request.getParameter("phone") %><br>
</p>
</body>
</html>