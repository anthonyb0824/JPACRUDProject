<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../bootstrap.jsp"/>
<jsp:include page="../bootstrapNav.jsp"/>
</head>
<body>
<form action="deleteById.do" method=POST>
<label>Id to be deleted</label>
<input type="text" name="id">
<input type="submit">
</form>
</body>
</html>