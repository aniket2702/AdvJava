<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.Random" %>

<%@page ErrorPage="error_page.jsp" %>
<%@page session="false" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> This is first JSP Class for Division</h1>

<!--Declaration Tag-->
<%! 
int a=10;
int b=0;

public int doDiv(){
	return a/b;
}
%>


<!-- Expression Tag -->
<h1 style="color: blue">
<%= "First Number is: "+a+" Second Number is: "+b %>
</h1>

<!--Scriplet Tag- To write Java code; semicolon at last -->

<%
	Random rand = new Random();
	int rnum = rand.nextInt(100);
%>

<h1 style="color: red">

<% 
	out.println("Division is: "+doDiv()); 
%>
</h1>
<h1 style="color: green">
<% out.println("Random Number is: "+rnum); 
%>
</h1>

</body>
</html>