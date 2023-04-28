<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
.red{
	color: red;
}
</style>

</head>
<body>

<!-- 컬렉션 객체를 반복 -->
<c:forEach var="member" items="${members}">

<c:out value="${member.name}" escapeXml="false" default="noname"/>
이름없음
</c:out>

<br>
</c:forEach>

<hr>

${members[0]} <br>
${members[1]} / ${members[1].name} <br>

<c:out value="${members[0].name}"></c:out> <br>
<c:out value="${members[1].name}" escapeXml="false">
<span class="red">이름 입력값 없음</span>
</c:out> <br>

<c:out value="${members[2].name}" escapeXml="false">
<span class="red">이름 입력값 없음</span>
<!-- null일 때만 입력값 없음 출력 됨, 태그 사용 가능 -->
</c:out> <br>


<hr>
${members}

</body>
</html>