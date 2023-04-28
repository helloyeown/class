<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%
    request.setAttribute("now", new Date());
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${now} <br>

<fmt:formatDate value="${now}"/><br>
<!-- 2023. 4. 28. -->
<fmt:formatDate value="${now}" type="date"/><br>
<!-- 2023. 4. 28. -->
<fmt:formatDate value="${now}" type="date" dateStyle="full"/><br>
<!-- 2023년 4월 28일 금요일 -->
<fmt:formatDate value="${now}" type="date" dateStyle="short"/><br>
<!-- 23. 4. 28. -->
<fmt:formatDate value="${now}" type="time"/><br>
<!-- 오후 5:20:28 -->
<fmt:formatDate value="${now}" type="time" timeStyle="full"/><br>
<!-- 오후 5시 36분 49초 대한민국 표준시 -->
<fmt:formatDate value="${now}" type="time" timeStyle="short"/><br>
<!-- 오후 5:36 -->

<hr>
<fmt:formatDate value="${now}" type="both"/><br>
<!-- 2023. 4. 28. 오후 5:37:30 -->
<fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/><br>

<hr>
<fmt:formatDate value="${now}" pattern="yyyy. MM. dd. HH:mm:ss"/><br>


</body>
</html>