<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--  Declaration Tag for creation of custom method not for using inbuilt method-->
	
	<%! 
		int x= 200;
		int y = 300;
		
		public int add(){
			return x+y;
		}
	%>
	
	<!--  Expresssion Tag for printing-->
	
	<%= add() %>
	
	<!--  Scriplet Tag for pure java code -->
	<br>
	
	<%
		out.println("Current Date : "+ new Date());
	%>

</body>
</html>