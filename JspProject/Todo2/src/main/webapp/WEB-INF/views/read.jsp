<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Todo 상세보기 (${loginInfo.uid})</h1>

번호 : <input type="text" name="no" value="${todo.tno}" readonly><br>
할일 : <input type="text" name="todo" value="${todo.todo}" readonly><br>
날짜 : <input type="date" name="duedate" value="${todo.duedate}" readonly><br>
완료 : <input type="checkbox" name="finished" value="${todo.finished ? 'DONE' : 'YET'}"><br>
<a href="modify?no=${todo.tno}">수정</a>

<form action="delete" method="post">
	<input type="hidden" name="no" value="${todo.tno}">
	<input type="submit" value="삭제">
</form>

</body>
</html>