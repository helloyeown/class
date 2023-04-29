<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modify</title>
</head>
<body>

<form action="modify" method="post">

<input type="text" name="count" value="${count}"><br>
<input type="text" name="title" value="${title}"><br>
<input type="date" name="date" value="${date}"><br>
<input type="submit" value="Modify"><br>
<input type="submit" value="Remove"><br>

</form>

</body>
</html>