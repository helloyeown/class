<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Todo List (${loginInfo.uid})</h1>

<ul>
	<c:forEach items="${todo}" var="todo">
	<li>
	<a href="${pageContext.request.contextPath}/todo/read?no=${todo.tno}">
		${todo.tno}.</a> ${todo.todo}
		${todo.duedate} ${todo.finished? 'DONE' : 'NOT YET'}
	</li>
	</c:forEach>
</ul>

<a href="${pageContext.request.contextPath}/todo/register">Todo Register</a>

<c:if test="${loginInfo eq null}">
<a href="${pageContext.request.contextPath}/todo/login">로그인</a>
</c:if>

<c:if test="${loginInfo ne null}">
<a href="${pageContext.request.contextPath}/todo/logout">로그아웃</a>
</c:if>

</body>
</html>