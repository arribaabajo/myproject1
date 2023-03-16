<%@page import="multi.MovieDAO"%>
<%@page import="multi.MovieVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
	<jsp:setProperty property="*" name="bag"/>
<%
MovieDAO dao = new MovieDAO();
dao.insert(bag);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: lime;
}
</style>
</head>
<body>
<%=bag.getTitle()%>

</body>
</html>