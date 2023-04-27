<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
</head>
<body>

	<h1>로그인</h1>
	<hr>
	<!-- 
		절대경로(서버 루트 경로 기준): "/web/auth/login.jsp"
		상대경로(현재 파일 기준): "login.jsp"
	 -->
	<form action="login.jsp" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userid"></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="로그인"></td>
			</tr>
		</table>
	</form>

</body>
</html>