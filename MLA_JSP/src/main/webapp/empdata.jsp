<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empdata</title>
</head>
<body>
<center>
		<h1 align = "center"> :: Employee Data ::</h1>
		
		<jsp:useBean id = "emp" class ="com.test.Employee"></jsp:useBean> <!--  object creation -->
		
		<jsp:setProperty property="*" name="emp"/>  <!-- setting the value to the variables in the Employee class with the object emp -->
		
		ID: <jsp:getProperty property="id" name="emp" /><br><br>
		name: <jsp:getProperty property="name" name="emp"/><br><br>
		Company: <jsp:getProperty property="cmp" name="emp"/><br><br>
		Designation: <jsp:getProperty property="dsg" name="emp"/><br><br>
		</center>
		
</body>
</html>