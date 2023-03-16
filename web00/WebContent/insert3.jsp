<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
	<jsp:setProperty property="*" name="bag"/>
<%
	//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 만들어서 내장시켜놨다.
/* String id = request.getParameter("id");
String name = request.getParameter("name");
String content = request.getParameter("content");
String price = request.getParameter("price");
String company = request.getParameter("company");
String img = request.getParameter("img"); */

//받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자. 
/* ProductVO bag = new ProductVO();
bag.setId(id);
bag.setName(name);
bag.setContent(content);
bag.setPrice(Integer.parseInt(price));
bag.setCompany(company);
bag.setImg(img); */


//dao에게 가방을 전달하며 insert 해달라고 하가.
ProductDAO dao = new ProductDAO();
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
	상품등록 요청되었음.
	<!-- img src=img/shoes1.jpg -->
	<img src="img" width=200 height=200>
	<hr color="red">
	상품명

</body>
</html>