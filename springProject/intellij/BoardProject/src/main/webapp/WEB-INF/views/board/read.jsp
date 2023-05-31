<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-25
  Time: 오후 7:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Read</title>
    <style>
        tr, td {
            padding: 10px;
        }
    </style>
</head>
<body>

<h1>게시글 보기</h1>
<hr>

<table border="1">
    <tr>
        <td>글번호</td>
        <td>${board.bno}</td>
    </tr>
    <tr>
        <td>제목</td>
        <td>${board.title}</td>
    </tr>
    <tr>
        <td>내용</td>
        <td>${board.content}</td>
    </tr>
    <tr>
        <td>첨부파일</td>
        <td></td>
    </tr>
    <tr>
        <td>등록일</td>
        <td>${board.regdate}</td>
    </tr>
    <tr>
        <td>수정일</td>
        <td>${board.updatedate}</td>
    </tr>
</table>

<a href="/board/modify?bno=${board.bno}">수정</a>
<a href="/board/delete?bno=${board.bno}">삭제</a>


</body>
</html>
