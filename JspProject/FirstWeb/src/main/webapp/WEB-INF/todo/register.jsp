<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo</title>
</head>
<body>


<form action="list" method="post">
    <input type="text" name="title" value="INSERT TITLE" 
        onfocus="if(this.value=='INSERT TITLE') this.value='';" style="color:grey"><br>
    <input type="date" name="date"><br>
    <input type="button" value="reset" onclick="resetForm()"> 
    <input type="submit" value="register">
</form>

<%-- 	<c:if test="${not empty errorMessage}">
		<p style="color: red">${errorMessage}</p>
	</c:if> --%>

<script>
function resetForm() {
    document.getElementById("todo-form").reset();
}
</script>

</body>
</html>