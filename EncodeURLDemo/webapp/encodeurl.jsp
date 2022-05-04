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
String password=request.getParameter("password");
if(name.equals("MIT") && password.equals("1234")){
	session.setAttribute("username", name);
	String str=response.encodeURL("first.jsp?name="+name+"&password="+password);
	%>
	<p>Click to go ahead</p>
	<a href='<%=str%>'>Welcome to encode URL.jsp</a>
<%
}
else{
	String str=response.encodeURL("index.jsp?name="+name+"&password="+password);
	%>
	<p> Invalid Credentials</p>
	<a href='<%=str%>'>Click here to go back</a>
<%}

%>
</body>
</html>