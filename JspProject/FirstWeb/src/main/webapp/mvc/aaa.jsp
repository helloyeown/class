<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <% 
    // 데이터 처리만
    
    String type = request.getParameter("type");
    request.setAttribute("result", type);
    
    String[] str = {"aaa", "bbb", "ccc"};
    request.setAttribute("list", str);
    
    // forward 처리 -> bbb.jsp
    %>
    <jsp:forward page="bbb.jsp"/>