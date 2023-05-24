<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-24
  Time: 오후 6:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Regist</title>
</head>
<body>

<h1>회원가입</h1>
<hr>

<form method="post">
  <table>
    <tr>
      <td>ID</td>
      <td><input type="text" name="uid"></td>
    </tr>
    <tr>
      <td>PW</td>
      <td><input type="password" name="pw"></td>
    </tr>
    <tr>
      <td>이름</td>
      <td><input type="text" name="uname"></td>
    </tr>
    <tr>
      <td></td>
      <td><input type="reset"><input type="submit"></td>
    </tr>
  </table>
</form>

</body>
</html>
