<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
    <%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:set var="cdate" value="<%= new Date()%>"></c:set>
		<c:out value="${cdate}"></c:out>
		
		<h2> Date Time Format</h2>
		<h3>
		Time: <fmt:formatDate type="time" value="${cdate}"/>
		</h3>
		<h4>
		Date:<fmt:formatDate type="date" value="${cdate}"/>
		
			Date and Time:<fmt:formatDate type="both" value="${cdate}"/><br><br>
			
			Date and Time Short:<fmt:formatDate type="both" dateStyle="short" value="${cdate}"/><br><br>
			
			Date and Time Medium:<fmt:formatDate type="both" dateStyle="medium" value="${cdate}"/><br><br>
			
			Date and Time Long:<fmt:formatDate type="both" dateStyle="long" value="${cdate}"/><br><br>
			
			Date pattern:<fmt:formatDate pattern="yyyy-MM-DD" value="${cdate}"/>
	
		</h4>
	
</body>
</html>