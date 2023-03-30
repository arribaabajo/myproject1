<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>공항 검색 화면입니다. </h3>
<a href="list3">모든 공항 리스트 가지고 오기</a>
<hr color="red">
<form action="one4.multi" method="get">
	code : <input name="code" value="YVV"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
</body>
</html>