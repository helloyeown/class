<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오후 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo Modify</title>
</head>
<body>

  <h1>Todo 수정</h1>
  <hr>

    <h3>${todo}</h3>

  <form method="post">
      tno <input type="text" name="tno" readonly><br>
      todo <input type="text" name="todo"><br>
      duedate <input type="date" name="duedate"><br>
      <input type="checkbox" name="complete"><br>
      <input type="reset"> <input type="submit" value="등록">
  </form>

</body>
</html>
