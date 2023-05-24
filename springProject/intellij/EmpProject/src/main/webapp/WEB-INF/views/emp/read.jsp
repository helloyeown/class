<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오후 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Read</title>
</head>
<body>

<h1>사원 정보</h1>
<hr>

<table border="1">
    <tr>
        <td>이름</td>
        <td><input type="text" name="ename" value="${emp.ename}" readonly></td>
    </tr>
    <tr>
        <td>직무</td>
        <td><input type="text" name="job" value="${emp.job}" readonly></td>
    </tr>
    <tr>
        <td>상사</td>
        <td><input type="text" name="mgr" value="${emp.mgr}" readonly></td>
    </tr>
    <tr>
        <td>hiredate</td>
        <td><input type="date" name="hiredate" value="${emp.hiredate}" readonly></td>
    </tr>
    <tr>
        <td>월급</td>
        <td><input type="text" name="sal" value="${emp.sal}" readonly></td>
    </tr>
    <tr>
        <td>커미션</td>
        <td><input type="text" name="comm" value="${emp.comm}" readonly></td>
    </tr>
    <tr>
        <td>부서</td>
        <td><input type="text" name="deptno" value="${emp.deptno}" readonly></td>
    </tr>

    <c:if test="${emp.file ne null}">
    <tr>
        <td>첨부파일</td>
        <td>
            <img src="/uploadfile/emp/${emp.file}" width="300">
        </td>
    </tr>
    </c:if>

    <tr>
        <td></td>
        <td>
            <a href="/emp/modify?empno=${emp.empno}">수정</a>
            <a href="/emp/delete?empno=${emp.empno}">삭제</a>
        </td>
    </tr>
</table>


</body>
</html>
