<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
<!-- 스크립트릿	 -->
<%
Date now = new Date();

// 내장객체
request.getParameter("age");
out.println(111);

LocalDateTime time = LocalDateTime.now();
// request
// response
// session
// out
// application
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

	<h1>안녕하세요</h1>
	<h3><%=now%></h3>
	<h3><%= time %></h3>
	<h3><%= "time" %></h3>	<!-- 문자열 -->

</body>
</html>