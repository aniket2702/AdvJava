<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reading Cookies</title>
</head>
<body>
<h1>Reading Cookies</h1>
<%
Cookie my_cookie=null;
Cookie [] my_cookies=null;
my_cookies=request.getCookies();
if(my_cookies != null){
	out.println("<h2>Cookies Found</h2>");
	for(int i=0;i<my_cookies.length;i++){
		my_cookie = my_cookies[i];
		out.println("Name: "+my_cookie.getName()+"<br/>");
		out.println("Value "+my_cookie.getValue()+"<br/>");
	}
}
else{
	out.println("<h2>No cookies found</h2>");
}

%>
</body>
</html>