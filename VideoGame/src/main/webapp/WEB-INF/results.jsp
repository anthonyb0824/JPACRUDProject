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

	<div class="container">
		<div class="col">
			<img alt="" src="${game.imgUrl} ">

		</div>
		<div class="col">${game}</div>
	</div>
	
	<div class="container">
		<div class="col">
			<img alt="" src="${updatedGame.imgUrl} ">

		</div>
		<div class="col">${updatedGame}</div>
	</div>




</body>
</html>