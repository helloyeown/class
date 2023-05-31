<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	String price = request.getParameter("price");
	
	out.print(name + " : " + price);
%>