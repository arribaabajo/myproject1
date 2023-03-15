<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    String no = request.getParameter("no");
    String tel = request.getParameter("tel");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
변경을 원하는 번호는 <%= no %>, 전화 번호는 <%= tel %>
</body>
</html>