<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<center>
	<form action = "LoginServlet" method="post">
		<h1>Login Page</h1>
		
		Enter UserName: <input type = "text" name="username"><br><br>
		Enter Password: <input type = "password" name="password"><br><br>
		<input type="submit" value="submit"><br><br>
		</form>
		</center>
</body>
</html>