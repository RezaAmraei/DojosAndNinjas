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
<h1>New Dojo</h1>
<form:form action="/creating/dojo" method="post" modelAttribute="newDojo">
	<p>
		<form:label path="dojoName">Name :</form:label>
		<form:errors path="dojoName"/>
		<form:input path="dojoName"/>
	</p>
	<input type="submit" value="Submit" />
</form:form>
</body>
</html>