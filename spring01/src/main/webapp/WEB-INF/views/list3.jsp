<%@page import="com.multi.mvc02.AirportVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}

td {
	width: 100px;
	text-align: center;
}

.top {
	background: black;
	color: white;
}

.down {
	background: lime;
}
</style>
</head>
<body>
	<table>
		<tr>
			<td class="top">code</td>
			<td class="top">name</td>
			<td class="top">latitude</td>
			<td class="top">longitude</td>
		</tr>

		<c:forEach items="${list}" var="bag"> 

<tr>
				<td class="down"><a href="one4.multi?code=${bag.code}">${bag.code}</a></td>
				<td class="down">${bag.name}</td>
				<td class="down">${bag.latitude}</td>
				<td class="down">${bag.longitude}</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>