<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	for(Cookie c:cookies){
		out.print(c.getName()+" "+c.getValue()+"<br>");
	}
%>
<hr color="cyan">
쿠키의 개수는 : <%=cookies.length %>
<hr color="cyan">
<%
	for(Cookie c: cookies){
		if(!c.getName().equals("JSESSIONED")){
			out.print(c.getName()+":"+c.getValue()+"<br>");
		}
	}
%>
</body>
</html>