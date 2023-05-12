<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오후 6:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>검색</title>
</head>
<body>

<h1>검색</h1>
<h4>
  인기 검색어 :
  <c:forEach items="${keywords}" var="str">
    ${str}
  </c:forEach>
</h4>

<form>
  검색
  <select>
    <c:forEach items="${searchType}" var="type">
      <option>${type}</option>
    </c:forEach>
  </select>
  <input type="text" name="" id=""> <input type="submit">
</form>

</body>
</html>
