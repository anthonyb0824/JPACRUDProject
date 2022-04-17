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
<h1>Search the video game library by id</h1>

<form action="results.do" method=GET>
<label>Search</label>
<input type="text" name="id">
<input type="submit">

</form>

</body>
</html>