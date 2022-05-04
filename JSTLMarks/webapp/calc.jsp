<%@ taglib prefix="c" uri='http://java.sun.com/jsp/jstl/core' %>
<html>
	<head>
		<title>Calc</title>
	</head>
	
	<body>

		<c:set var="val1" value="${param.op1}" />
		<c:set var="val2" value="${param.op2}" />
		<c:set var="val3" value="${param.op3}" />
		<c:set var="val4" value="${param.op4}" />
		<c:set var="val5" value="${param.op5}" />
		<c:set var="opr"  value="${param.cmd}" />
		<c:set var="res"  scope="session" value="${0}" />
		<c:set var="grade"  scope="session"/>

		<c:if test="${opr == 'Average'}">
			<c:set var="res" scope="session" value="${(val1+val2+val3+val4+val5)/5}" />
			<c:if test="${res>50} }">
			<c:set var="grade" scope="session" value="Pass"/>
			</c:if>
			<c:if test="${res<50} }">
			<c:set var="grade" scope="session" value="Fail"/>
			</c:if>
		</c:if>


		<c:redirect url="result.jsp" />
	</body>
</html>