<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="bootstrap.jsp" %>
<title>reservation</title>
</head>
<body>

		<c:forEach items="${res}" var="r">
		
			<h1>${r.getReserve_id() }</h1>
			<h1>${r.getFilm_id() }</h1>
			<h1>${r.getUser_id() }</h1>
			<h1>${r.getReservation_date() }</h1>
			<h1>${r.getTicket() }</h1>
		</c:forEach>

</body>
</html>