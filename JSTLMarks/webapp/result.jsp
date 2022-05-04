<%@ taglib prefix="c" uri='http://java.sun.com/jsp/jstl/core' %>
<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>Result</title>
	</head>

	<body>
		<p>Ans is </p>
		<c:out value="${res}" />
		<c:out value="${grade}"/>
	</body>
</html>