<%@page import="product.Product"%>
<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setAttribute("name", "문예원");
    session.setAttribute("name", "손흥민");
    
    Member member = new Member();
    member.setId("Cool");
    member.setPw("1234");
    member.setName("COOL");
    
    session.setAttribute("member", member);
    
    session.setAttribute("product", new Product());
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h4>
가격 : ${product.price} <br>
첫 번째 제품 : ${product.list[0]} / ${product.list}
</h4>


<h4>
${sessionScope.member} <br>
${member}
</h4>

<h4>
${member.id} / ${member.pw} / ${member.name} / ${member.info}<!-- getter 호출 -->
</h4>


<h4>
${100+10} / ${10 mod 3} / ${10 eq 10} / ${'aaa' == 'aaa' and 1==1}
</h4>


<h4>
${true} / ${false} / ${100} / ${3.14} / ${'예원'} / ${null}
<!-- null은 출력X -->
</h4>

<h4>
표현식 : <%= request.getAttribute("name") %>
<!-- 값이 없으면 null 출력 -->
</h4>

<h4>
표현언어EL : ${requestScope.name} / ${name}
<!-- 생략하면 Scope의 맵에서 찾음 -->
<!-- null이면 출력 X -->
</h4>

<h4>
<a href="${pageContext.request.requestURL}?code=100">link</a><br>
${pageContext.request.requestURL} <br>
${pageContext.request.requestURI} <br>
${pageContext.request.contextPath} <br>
<%= request.getContextPath() %>
</h4>


</body>
</html>