<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../bootstrap.jsp" />
<jsp:include page="../bootstrapNav.jsp" />
</head>
<body class = "container">

	<h1>Add a video game to the library</h1>

	<form action="new.do" method="POST">
		<label>title</label> <input type="text" name="title" value="Title"> 
		<label>co-op</label> <input type="text" name="coOp" value="co-op"> 
		<label>Multiplayer</label><input type="text" name="multiPlayer" value="MultiPlayer"> 
		<label>esrbRating</label><input type="text" name="esrbRating" Value="ESRB Rating">
		<label>Platform</label><input type="text" name="platform" value="Platform"> 
		<label>Release Date</label><input type="text"name="releaseDate" value="releaseDate"> 
		<label>Developer</label><input type="text" name="developer" value="developer">
		<label>Image URL</label><input type="text" name="imgUrl" value="imgUrl">
		
		<input type="submit" value="Submit">

	</form>

</body>
</html>