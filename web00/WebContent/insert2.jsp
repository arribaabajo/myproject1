<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 만들어서 내장시켜놨다.
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");

//받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자. 
BbsVO bag = new BbsVO();
bag.setTitle(title);
bag.setContent(content);
bag.setWriter(writer);
//dao에게 가방을 전달하며 insert 해달라고 하가.
BbsDAO dao = new BbsDAO();
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
	회원가입 요청되었음.
	<hr color="red">
	작성한 title:
	<%=title%>
	작성한 contnet:
	<%=content%>
	작성한 writer:
	<%=writer%>

</body>
</html>