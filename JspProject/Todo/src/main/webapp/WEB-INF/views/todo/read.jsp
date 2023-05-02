<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Todo 상세보기</h1>

	번호 : <input type="text" name="no" value="${todo.tno}" readonly> <br>
	<!-- todo는 저장된 속성 이름 -->
	할일 : <input type="text" name="todo" value="${todo.todo}" readonly> <br>
	날짜 : <input type="date" name="duedate" value="${todo.duedate}" readonly> <br>
	완료 : <input type="checkbox" name="complete" ${todo.finished ? 'checked' : ''}> <br>
	<!-- checkbox value => "on" -->
	<a href="modify?no=${todo.tno}">수정</a>
	<%-- <a href="delete?no=${no}">삭제</a> --%>
	
	<form action="delete" method="post">
		<input type="hidden" name="no" value="${todo.tno}">
		<input type="submit" value="삭제">
	</form>

</body>
</html>