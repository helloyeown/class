<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오후 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Regist</title>
</head>
<body>

<h1>사원 등록</h1>
<hr>

<form method="post">

<table>
    <tr>
        <td>이름</td>
        <td><input type="text" name="ename" required></td>
    </tr>
    <tr>
        <td>직무</td>
        <td><input type="text" name="job"></td>
    </tr>
    <tr>
        <td>상사</td>
        <td><input type="text" name="mgr"></td>
    </tr>
    <tr>
        <td>hiredate</td>
        <td><input type="date" name="hiredate"></td>
    </tr>
    <tr>
        <td>월급</td>
        <td><input type="text" name="sal"></td>
    </tr>
    <tr>
        <td>커미션</td>
        <td><input type="text" name="comm"></td>
    </tr>
    <tr>
        <td>부서</td>
        <td><input type="text" name="deptno"></td>
    </tr>
    <tr>
        <td></td>
        <td><input type="reset"> <input type="submit"></td>
    </tr>
</table>

</form>

</body>
</html>
