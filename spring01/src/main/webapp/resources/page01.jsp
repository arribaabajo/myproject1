<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie c1 = new Cookie("category", "book");
	Cookie c2 = new Cookie("ex", "run");
	
	response.addCookie(c1);
	response.addCookie(c2);
	
	%>
</body>
</html>