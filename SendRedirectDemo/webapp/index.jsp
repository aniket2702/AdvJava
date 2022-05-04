<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SendRedirect</title>
</head>
<body>
<%
String msg = request.getParameter("status");
if(msg==null){
	msg="";
}
%>
<p>URL Rewriting Eg(SendRedirect)</p>
<form action="register.jsp" method="post">
Name <input type="text" name="name"><br/>
Email <input type="text" name="email"><br/>
<input type="submit" value="Submit">

</form>
</body>
</html>