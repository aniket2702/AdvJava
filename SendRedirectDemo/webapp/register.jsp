<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");

if(name.trim().length()==0){
	response.sendRedirect("index.jsp?status=Name Cannot Be Empty");
	return;
}
if(email.trim().length()==0){
	response.sendRedirect("index.jsp?status=Email Cannot Be Empty");
	return;
}
response.sendRedirect("success.html");
%>
</body>
</html>