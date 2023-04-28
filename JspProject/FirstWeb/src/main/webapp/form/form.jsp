<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>Form Test</h1>
	<form action="<%=request.getContextPath() %>/form/input.jsp" method="post">
		<!-- 서블릿 경로 -->
		내용 입력<br>
		<textarea name="content" rows="5" cols="20">안녕하세요</textarea>
		<br> 
		성별 : <input type="radio" name="gender" value="male">남성
		<input type="radio" name="gender" value="female" checked>여성 
		<br>

		관심사 : <input type="checkbox" name="lang" value="java" checked>java
		<input type="checkbox" name="lang" value="jsp">jsp 
		<input type="checkbox" name="lang" value="sql">sql 
		<input type="checkbox" name="lang" value="html">html <br> 
		태어난 년도 : <select name="birthyear">
			<option value="2002">2002</option>
			<option>2001</option>
			<!-- 밸류 생략하면 2001 반환 -->
			<option>2000</option>
			<option>1999</option>
			<option>1998</option>
		</select> <br> 나이 : <input type="number" name="age"> <br> 생일
		: <input type="date" name="birth"> <br> <br> <input
			type="submit">

	</form>

</body>
</html>