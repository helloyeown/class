<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%
    request.setAttribute("number", 100000000);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 숫자 : <fmt:formatNumber value="${number}"/> <br>
 통화 : <fmt:formatNumber value="${number}" type="currency" currencySymbol="$"/> <br>
 퍼센트 : <fmt:formatNumber value="${number/400000000}" type="percent"/> <br>
 패턴 : <fmt:formatNumber value="${number}" pattern="000,000,000.00"/> <br>


</body>
</html>