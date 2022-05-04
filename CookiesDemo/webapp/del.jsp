<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deleting Cookies</title>
</head>
<body>
<h1>Deleting Cookies</h1>
<%
Cookie my_cookie=null;
Cookie [] my_cookies=null;
my_cookies=request.getCookies();
if(my_cookies != null){
	out.println("<h2>Cookies Found</h2>");
	for(int i=0;i<my_cookies.length;i++){
		my_cookie = my_cookies[i];
		my_cookie.setMaxAge(0);
		response.addCookie(my_cookie);
		out.println("Deleted cookie is "+my_cookie.getName()+"<br/>");
		out.println("Value of deleted cookie "+my_cookie.getValue()+"<br/>");
	}
}
else{
	out.println("<h2>No cookies found</h2>");
}
%>
</body>
</html>