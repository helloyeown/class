<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Todo 등록 ( ${loginInfo.uid} [${loginInfo.uname}] )</h1>

<form method="post">

	할일 : <input type="text" name="todo"> <br>
	날짜 : <input type="date" name="duedate"> <br>
	<input type="reset"> <input type="submit" value="제출">

</form>

</body>
</html>