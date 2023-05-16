<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-16
  Time: 오후 5:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>부서 정보 수정</title>
</head>
<body>

<h1>부서 정보 수정</h1>
<hr>

<form method="post">
    <table>
        <tr>
            <td>부서번호</td>
            <td><input type="number" name="deptno" value="${dept.deptno}" readonly></td>
        </tr>
        <tr>
            <td>부서이름</td>
            <td><input type="text" name="dname" value="${dept.dname}"></td>
        </tr>
        <tr>
            <td>부서위치</td>
            <td><input type="text" name="loc" value="${dept.loc}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="수정"></td>
        </tr>
    </table>
</form>

</body>
</html>
