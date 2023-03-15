<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 만들어서 내장시켜놨다.
String id = request.getParameter("id");

MemberDAO3 dao = new MemberDAO3();
dao.delete(id);
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
	회원탈퇴 요청되었음.
	<hr color="red">
	탈퇴 요청한 id:
	<%=id%><br>
</body>
</html>