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
<body class="container">
<h1 class='text-center'>Update a Video Game by Id</h1>
<form action="updateById.do" method="POST">
		<label>Id</label> <input type="text" name="id">
		<label>Title</label> <input type="text" name="title" placeholder="Title"> 
		<label>co-op</label> <!-- <input type="text" name="coOp" value="co-op">  -->
		<select name="coOp">
  			<option value="True">Yes</option>
  			<option value="False">No</option>
  			</select>
		<label>Multiplayer</label><!-- <input type="text" name="multiPlayer" value="MultiPlayer">  -->
		<select name="multiPlayer">
  			<option value="True">Yes</option>
  			<option value="False">No</option>
  			</select>
		
		<label>ESRB Rating</label><!-- <input type="text" name="esrbRating" Value="ESRB Rating"> -->
		<select name="esrbRating">
  			<option value="E">Everyone(E)</option>
  			<option value="T">Teen(T)</option>
  			<option value="M">Mature 17+(M)</option>
  			<option value="A">Adult Only(A)</option>
  			</select>
		

		<label>Platform</label><input type="text" name="platform" value="Platform"> 
		<label>Release Date</label><input type="date"name="releaseDate" value="releaseDate"> 
		<label>Developer</label><input type="text" name="developer" value="developer">
		<label>Image URL</label><input type="text" name="imgUrl" value="imgUrl">
		
		<input type="submit" value="Submit">

	</form>
	
</body>
</html>