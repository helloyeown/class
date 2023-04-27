<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
   request.setCharacterEncoding("utf-8");
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체</title>
</head>
<body>


<h1>request : 사용자의 요청 내용을 저장하고 있는 객체</h1>
<%=request.getRemoteAddr() %> <br>
URL : <%=request.getRequestURL() %> <br>
URI : <%=request.getRequestURI() %> <br>
ContextPath : <%=request.getContextPath() %> <br>



<h3>쿠키 정보</h3>
<%
	Cookie[] cookies = request.getCookies();

/* 쿠키는 name과 value로 이루어짐 */
	for(Cookie c : cookies){
		out.print(c.getName() + "=" + c.getValue() + "<br>");
	}
%>



<h3>파라미터 데이터</h3>
<%
	Enumeration<String> paramNames = request.getParameterNames();

	while(paramNames.hasMoreElements()){
		String paramName = paramNames.nextElement();
		String value = request.getParameter(paramName);
		
		out.print("<h5>");		
		out.print(paramName + " = " + value);
		out.print("</h5>");
	}
%>



<h3>header 정보</h3>
<%
	Enumeration<String> list = request.getHeaderNames();

	while(list.hasMoreElements()){
		String headerName = list.nextElement();
		String headerValue = request.getHeader(headerName);
		
		out.print("<h5>");
		out.print(headerName + "=" + headerValue);
		out.print("</h5>\n");
	}
%>

</body>
</html>