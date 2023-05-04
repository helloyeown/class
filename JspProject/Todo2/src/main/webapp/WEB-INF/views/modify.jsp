<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Todo 수정 (${loginInfo.uid})</h1>

<form method="post">

번호 : <input type="text" name="no" value="${todo.tno}"><br>
할일 : <input tupe="text" name="todo" value="${todo.todo}"><br>
날짜 : <input type="date" name="duedate" value="${todo.duedate}"><br>
완료 : <input type="checkbox" name="finished" value="${todo.finished ? 'checked' : ''}"><br>
<input type="reset" value="초기화"><input type="submit" value="수정">

</form>

</body>
</html>