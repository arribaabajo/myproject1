<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String id = request.getParameter("id");
    String[] list = {"root", "admin", "hong"};
    
    String result = "중복이 되지 않아, 사용 가능";
    
    for(String s:list){
    	if(s.equals(id)){
    		result="중복된 id이므로, 사용 불가";
    		break;
    	}
    }
    %><%= result %>