<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 만들어서 내장시켜놨다.
String id = request.getParameter("id");
String tel = request.getParameter("tel"); 

MemberVO bag = new MemberVO();
bag.setId(id);
bag.setTel(tel);

MemberDAO3 dao = new MemberDAO3();
dao.update(bag);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 정보 수정 요청되었음
<hr color="blue">
변경을 원하는 아이디는 <%= id %>, 비밀번호는 <%= tel %>
</body>
</html>