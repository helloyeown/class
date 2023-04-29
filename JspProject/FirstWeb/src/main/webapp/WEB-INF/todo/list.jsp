<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo List</title>
</head>
<body>

<h1>Todo List</h1>

<ul>
		<c:forEach var="todo" items="${list}" varStatus="stat">
			<li><a href="${pageContext.request.contextPath}/todo/read?count=${stat.count}&title=${todo.title}&date=${todo.date}">
			${stat.count}</a> / ${todo.title} / ${todo.date}</li>
		</c:forEach>
</ul><br>
<a href="register">HOME</a>

</body>
</html>