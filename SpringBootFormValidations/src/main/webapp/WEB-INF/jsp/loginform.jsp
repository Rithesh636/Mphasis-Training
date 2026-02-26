<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>

<style type="text/css">
	.error{
		color:red;
		font-style:italic;
	}
</style>

</head>
<body>
	<h1 align = "center">Login Page</h1>
	<form:form action="submituser" method="post" modelAttribute="info">
		<div> 
			<form:label path="username">Enter Username : </form:label>
			<form:input path="username"/>
			<form:errors path="username" cssClass="error"></form:errors>
		</div>
		
		<div>
			<form:label path="password">Enter Password : </form:label>
			<form:input path="password"/>
			<form:errors path="password" cssClass="error"></form:errors>
		</div>
		
		<input type = "submit" value ="Login"/>
	</form:form>
	
</body>
</html>