<%@page import="com.multi.mvc20.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.js" integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
<script type = "text/javascript">
$(function() {
	$('#b1').click(function() {
		content = $('#reply').val()
		writer = "apple"
		$.ajax({
			url: "insert4",
			data: {
				bbsno: ${bag.no},
				content: content,
				writer: writer
			},
			success:function(){
				alert('성공')
				$('#result').append("- "+content+"- "+writer+"<br>")
				$('#reply').val('')
			}
		})
	})
})
</script>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a>
<a href="list2">게시물 전체 목록페이지</a>
<hr color="red">

게시물검색 처리 요청이 완료되었습니다.
<br>
${bag.no}, ${bag.title}, 
${bag.content}, ${bag.writer}
<hr color="red">
댓글달기 <input id="reply"> <button id="b1">댓글달기</button><br>

<hr color="blue">
<div id="result">
<!-- for-each를 이용해 댓글 목록을 프린트!! -->
	<c:forEach items="${list}" var="bag"> 
	- ${bag.no}, ${bag.bbsno}, ${bag.content}, ${bag.writer} <br>
	</c:forEach>
	<c:forEach items="${list}" var="bag"> 
	- ${bag.content}, ${bag.writer} <br>
	</c:forEach>
</div>
</body>
</html>