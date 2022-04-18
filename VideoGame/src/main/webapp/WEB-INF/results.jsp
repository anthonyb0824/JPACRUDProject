<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../bootstrap.jsp" />
<jsp:include page="../bootstrapNav.jsp" />
</head>
<body class="container">

	<div class="container row">
		<div class="col">
		
			<img alt="" src="${game.imgUrl} ">

		</div>
		<div class="col">
		<ul>
			<li>${game.title}</li>
			<li>${game.coOp}</li>
			<li>${game.multiplayer}</li>
			<li>${game.esrbRating}</li>
			<li>${game.platform}</li>
			<li>${game.releaseDate}</li>
			<li>${game.developer}</li>
		</ul>
		<a class="btn btn-primary" href="update.do" role="button">Update</a>
		<form action="delete.do"><button class="btn btn-danger" type="submit">Delete</button></form>
		
		
		</div>
	</div>
	
	<c:if test="${updatedGame} ! null">
	
	<div class="container">
		<div class="col">
			<img alt="" src="${updatedGame.imgUrl} ">

		</div>
		<div class="col">${updatedGame}</div>
	</div>
	</c:if>
	




</body>
</html>