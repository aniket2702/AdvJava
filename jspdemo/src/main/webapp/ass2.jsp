<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<%@page import="java.util.Random" %>
<%@ page info = "value" %>
<%@ page buffer="16kb" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp</title>
</head>
<body>


<%out.println("Today's Date: "+new Date().toString());%>
<br>
<!--Declaration Tag-->
<%!
int i=10;
int j=20;
int k=i+j;
%>
<!--Declaration Tag-->

<!-- Expression Tag -->
<%
out.println("Sum is "+k);
%>

<!--Scriplet Tag- To write Java code; semicolon at last -->
<br>
<%
	Random rand = new Random();
	int rnum = rand.nextInt(100);
%>
<%-- use of expression tag --%>
<% out.println("Random Number is: "+rnum); 
%><br>

<%
out.println("Multiplication is ");
%>
<%=i*j
%><br>


</body>
</html>