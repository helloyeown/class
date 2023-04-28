<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    request.setAttribute("totalPageNum", 5);
    request.setAttribute("msg", "1|문예원|010-9999-7777|런던");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 1|문예원|010-9999-7777|런던 -->
<c:forTokens items="${msg}" delims="|" var="str" varStatus="stat">
	<c:if test="${stat.index==1}">
	이름 : ${str}
	</c:if>
</c:forTokens>


<hr>


<h2>1~5까지 반복 (페이징 넘버)</h2>
<c:forEach var="num" begin="1" end="${totalPageNum}" step="1">
 [${num}] 
</c:forEach>


<hr>


<table border="1">

<tr>
	<th>index</th>
	<th>count</th>
	<th>아이디</th>
	<th>이름</th>
	<th>비밀번호</th>
</tr>

<c:forEach items="${members}" var="member" varStatus="stat">

<tr>
	<td>${stat.index}</td>
	<td>${stat.count}</td>
	<td>${member.id}</td>
	<td>
		<c:out value="${member.name}" default="noname"/>
	</td>
	<td>${member.pw}</td>
</tr>
</c:forEach>


</table>


</body>
</html>