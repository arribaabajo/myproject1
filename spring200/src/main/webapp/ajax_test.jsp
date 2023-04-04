<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script>
		$(function() {
			$.ajax({
				url:"list2",
				success: function(x) {
					$('#result').append(x);
				}//success
			})//ajax
		}); //function
	</script>
</head>
<body>
현재 게시물 조회수 ${count}

<% if(session.getAttribute("id") != null){ %>
<h3>게시물등록 화면입니다. </h3>
<hr color="red">
<form action="insert2.multi" method="get">
	no : <input name="no" value="11"><br>
	title : <input name="title" value="오늘은~"><br>
	content : <input name="content" value="화요일~"><br>
	writer : <input name="writer" value="${id}"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<% }else{ %>
<a href="login.jsp">
	<button style="background: pink;" >로그인 화면으로 go</button>
</a>
<%} %>
<h3>게시물수정 화면입니다. </h3>
<hr color="red">
<form action="update2.multi" method="get">
	no : <input name="no" value="11"><br>
	content : <input name="content" value="오늘은~"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>게시물삭제 화면입니다. </h3>
<hr color="red">
<form action="delete2.multi" method="get">
	no : <input name="no" value="11"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<div id="result"></div>
</body>
</html>