<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
$(function() {
	$("#b2").click(function() {
		$.ajax({
		url:"movie",
			data:{
				title: $('#title').val(),
				price: $('#price').val()
			},
			success: function(x){
				alert("성공")
				$('#result').append(x +'<br>')
			},
			error: function(){
				alert("실패")
			}
		})
	})
})
</script>
</head>
<body>
영화 이름:
<input id = "title"><br>
가격:
<input id = "price">
<input id="b2" type="button" value="영화 예매 항목 확인">
<br>
<div id="result"></div>
</body>
</html>