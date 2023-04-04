<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.js" integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
<script type = "text/javascript">
	$(function() {
		$('#b1').click(function(){
			$('#result').empty()
			$.ajax({
				url: "list5",
				success: function(x) {
					$('#result').append(x)
				}
			})
		})
		$('#b2').click(function(){
			$('#result').empty()
			$.ajax({
				url: "list6",
				data: {
					bbsno:1
				},
				success: function(x) {
					$('#result').append(x)
				}
			})
		})
	})
</script>
</head>
<body>
<button id="b1">bbs리스트 가지고 오기</button>
<button id="b2">bbs번호 1번 reply리스트 가지고 오기</button>
<hr color="blue">
<div id="result"></div>
</body>
</html>