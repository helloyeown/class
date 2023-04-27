<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
// application 객체의 속성에 cnt라는 속성 저장
// 숫자를 String 타입으로 저장해서 사용
String cntStr = (String)application.getAttribute("cnt");
int cnt = cntStr == null ? 0 : Integer.parseInt(cntStr);

// 접속 전까지의 카운트
out.print("방문자 수: " + cnt);

// 카운트 증가
cnt++;

// 속성에 cnt 데이터 저장
application.setAttribute("cnt", String.valueOf(cnt));
%>

</body>
</html>