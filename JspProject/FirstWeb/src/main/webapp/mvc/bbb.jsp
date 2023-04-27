<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String[] list = (String[])request.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>bbb.jsp에서 만들어진 view</h1>
<h1><%= request.getParameter("type") %></h1>
<h1><%= request.getAttribute("result") %></h1>
<%
for(String s : list){
	out.println(s + "<br>");
}
%>

</body>
</html>