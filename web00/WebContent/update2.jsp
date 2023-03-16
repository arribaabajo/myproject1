<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    String no = request.getParameter("no");
    String content = request.getParameter("content");
    
	BbsVO bag = new BbsVO();
	bag.setNo(Integer.parseInt(no));
	bag.setContent(content);
	
	BbsDAO dao = new BbsDAO();
	dao.update(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
변경을 원하는 번호는 <%= no %>, 전화 번호는 <%= content %>
</body>
</html>