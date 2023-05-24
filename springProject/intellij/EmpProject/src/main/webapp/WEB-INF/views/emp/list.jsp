<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오후 8:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
    <style>
        td, th {
            padding: 10px 20px;
        }
    </style>
</head>
<body>

<h1>사원 리스트</h1>
<hr>

${loginInfo}

<table border="1">


    <tr>
        <th>사원번호</th>
        <th>사원이름</th>
        <th>직무</th>
        <th>매니저</th>
        <th>입사일</th>
        <th>월급</th>
        <th>커미션</th>
        <th>부서번호</th>
    </tr>

    <c:forEach items="${list}" var="emp">
        <tr>
            <td><a href="/emp/read?empno=${emp.empno}">${emp.empno}</a></td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.mgr}</td>
            <td>${emp.hiredate}</td>
            <td>${emp.sal}</td>
            <td>${emp.comm}</td>
            <td>${emp.deptno}</td>
        </tr>
    </c:forEach>
</table>

<a href="/emp/regist">등록</a>
<a href="/logout">로그아웃</a>

<c:if test="${loginInfo eq null}">
<a href="/login">로그인</a>
<a href="/login/regist">회원가입</a>
</c:if>

</body>
</html>
