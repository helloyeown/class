<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%
        request.setAttribute("year", 2001);
        request.setAttribute("gender", "F");
        request.setAttribute("userid", "cool");
        %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


id <input name="userid" value="${userid}">

남성<input type="radio" name="gender" value="M" ${gender=='M' ? 'checked' : ''}> 
여성<input type="radio" name="gender" value="F" ${gender=='F' ? 'checked' : ''}>

<select>
<option ${year==1999 ? 'selected' : ''}>1999</option>
<option ${year==2000 ? 'selected' : ''}>2000</option>
<option ${year==2001 ? 'selected' : ''}>2001</option>
</select>


<c:choose>
	<c:when test="${param.sel == 'a'}">
		<h3>a를 선택했습니다.</h3>
	</c:when>
	
	<c:when test="${param.sel == 'b'}">
		<h3>b를 선택했습니다.</h3>
	</c:when>
	
	<c:when test="${param.sel == 'c'}">
		<h3>c를 선택했습니다.</h3>
	</c:when>
	
	<c:otherwise>
		<h3>잘못된 데이터가 선택되었습니다.</h3>
	</c:otherwise>
</c:choose>

</body>
</html>