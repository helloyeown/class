<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
</head>
<body>

	<!-- 
		action : form 내부에서 작성한 
		input 파라미터 데이터를 처리하는 경로
		생략 가능 (생략하면 자기 자신의 현재 URL로 보내짐)
	 -->
	<form action="#" method="get" %>
		<input type="text" name="num1">
		<input type="text" name="num2">
		<!-- name은 파라미터 이름 -->
		<input type="submit">
	</form>

</body>
</html>