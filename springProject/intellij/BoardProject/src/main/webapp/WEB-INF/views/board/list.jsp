<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-25
  Time: 오후 6:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Board List</title>
    <style>
        tr, td {
            padding: 10px;
        }
    </style>
</head>
<body>

<h1>게시판</h1>
<hr>

<table border="1">
    <tr>
        <th>글번호</th>
        <th>제목</th>
        <th>작성일</th>
    </tr>
    <c:forEach items="${list}" var="board">
        <tr>
            <td><a href="/board/read?bno=${board.bno}">${board.bno}</a></td>
            <td>${board.title}</td>
            <td>${board.updatedate}</td>
        </tr>
    </c:forEach>
</table>

<a href="/board/regist">글쓰기</a>

</body>
</html>
