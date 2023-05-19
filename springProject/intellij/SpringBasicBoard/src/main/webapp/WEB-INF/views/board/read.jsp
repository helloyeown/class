<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오전 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        td {
            padding: 10px 20px;
        }
    </style>
</head>
<body>

<h1>게시글 보기</h1>
<hr>
<table border="1">
    <tr>
        <td>게시글 번호</td>
        <td>${article.bno}</td>
    </tr>
    <tr>
        <td>글 제목</td>
        <td>${article.title}</td>
    </tr>
    <tr>
        <td>내용</td>
        <td>${article.content}</td>
    </tr>
    <tr>
        <td>작성자</td>
        <td>${article.writer}</td>
    </tr>
    <c:if test="${article.file ne null}">
        <tr>
            <td>첨부파일<br>(img)</td>
            <td>
                <img src="/uploadfile/board/${article.file}" width="300">
            </td>
        </tr>
    </c:if>
    <tr>
        <td>등록일</td>
        <td>${article.regdate}</td>
    </tr>
    <tr>
        <td>수정일</td>
        <td>${article.updatedate}</td>
    </tr>
</table>

<a href="/board/list">LIST</a>
<a href="/board/modify?bno=${article.bno}">수정</a>
<a href="/board/delete?bno=${article.bno}">삭제</a>

</body>
</html>
