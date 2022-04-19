<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            		<%@ page isErrorPage="true" %>
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
		<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><c:out value="${dojo.dojoName}"/> Location Ninjas</h1>
<c:forEach var="oneNinja" items="${dojo.ninjas}">
<p>First Name:<c:out value="${oneNinja.firstName }"/></p>
<p>Last Name:<c:out value="${oneNinja.lastName }"/></p>
<p>Age:<c:out value="${oneNinja.age }"/></p>
</c:forEach>
</body>
</html>