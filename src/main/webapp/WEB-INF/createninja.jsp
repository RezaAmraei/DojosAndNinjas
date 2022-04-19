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
<title>Create a Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form action="/creating/ninja" method="post" modelAttribute="newNinja">
	<input type="hidden" name="_method" value="post">
		<p>
			<form:label path="firstName"></form:label>
			<form:errors path="firstName"/>
			<form:input path ="firstName"/>
		</p>
		
		<p>
			<form:label path="lastName"></form:label>
			<form:errors path="lastName"/>
			<form:input path ="lastName"/>
		</p>
		
		<p>
			<form:label path="age"></form:label>
			<form:errors path="age"/>
			<form:input type="number"  path ="age"/>
		</p>
		
		<p>
			<form:select path = "dojo">
				<c:forEach var="dojo" items="${allDojos}">
					<form:option value="${dojo.id}" path="dojo">
						<c:out value="${dojo.dojoName}"/>
					</form:option>
				</c:forEach>
			</form:select>
		</p>
		
		<input type="submit" />
	</form:form>
</body>
</html>