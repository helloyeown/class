<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오후 12:17
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

<h1>게시글 수정</h1>
<hr>

<form method="post" enctype="multipart/form-data">
  <input type="hidden" name="bno" value="${board.bno}">
  <%--
  새로운 파일을 업로드 할 수 있음
  이전에 업로드한 파일이 있을 수 있음
  --%>
  <table border="1">
    <tr>
      <td>글제목</td>
      <td><input type="text" name="title" value="${board.title}"></td>
    </tr>
    <tr>
      <td>내용</td>
      <td>
        <textarea name="content" rows="4" cols="20">${board.content}</textarea>
      </td>
    </tr>


    <tr>
      <td>첨부된 파일</td>
      <td>
        <c:if test="${board.file ne null}">
          <input type="hidden" name="oldfile" value="${board.file}">
          ${board.file}
        </c:if>
      </td>
    </tr>

    <tr>
      <td>첨부파일</td>
      <td><input type="file" name="file"></td>
    </tr>
    <tr>
      <td></td>
      <td>
        <input type="reset">
        <input type="submit">
      </td>
    </tr>
  </table>
</form>


</body>
</html>
