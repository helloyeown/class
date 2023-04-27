<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    // 로그아웃 처리
    // 세션 정보 삭제
    session.invalidate();
    
    response.sendRedirect("login_form.jsp");
    
    %>