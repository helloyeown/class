<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read</title>
</head>
<body>

<form action="list" method="post">

<input type="text" name="count" value="${count}"><br>
<input type="text" name="title" value="${title}"><br>
<input type="date" name="date" value="${date}"><br>
<a href="${pageContext.request.contextPath}/todo/modify?count=${stat.count}&title=${todo.title}&date=${todo.date}">
Modify/Remove</a> <a href="#">List</a>

</form>

</body>
</html>