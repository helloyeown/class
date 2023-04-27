<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 로그인 여부 확인 후 리디렉션 처리
String userid = (String)session.getAttribute("loginInfo");
if(userid==null){
	response.sendRedirect("login_form.jsp");
}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>My Page</h1>
	<%= application.getAttribute("cnt") %>
	
	<a href="logout.jsp">로그아웃</a>

</body>
</html>