<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-16
  Time: 오후 3:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>부서 리스트</title>
    <style>
        th, td {
            padding: 10px;
        }
    </style>
</head>
<body>

<h1>부서 리스트</h1>
<hr>

<table border="1">
    <tr>
        <th>부서번호</th>
        <th>부서이름</th>
        <th>부서위치</th>
        <th>관리</th>
    </tr>

    <c:forEach items="${list}" var="dept">
        <tr>
            <td>${dept.deptno}</td>
            <td>${dept.dname}</td>
            <td>${dept.loc}</td>
            <td>
                <a href="/dept/modify?no=${dept.deptno}">수정</a>
                <a href="/dept/delete?no=${dept.deptno}">삭제</a>
            </td>
        </tr>
    </c:forEach>

</table>

<a href="/dept/regist">부서 등록</a>

</body>
</html>
