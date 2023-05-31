<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	String uid = request.getParameter("uid");
	
	if(uid!=null && uid.equals("test")){
		// 존재하는 아이디: 사용 불가 => N
		out.print("N");
	} else if(uid!=null && !uid.equals("test")) {
		out.print("Y");
	} else {
		out.print("N");
	}
%>