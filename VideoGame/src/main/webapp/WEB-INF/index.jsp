<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Video Game Library</title>
<jsp:include page="../bootstrap.jsp"/>
<jsp:include page="../bootstrapNav.jsp"/>
</head>
<body class="container">

<a class="btn btn-primary" href="findVideoGameById.html" role="button">Find a Video Game By Id</a>
<a class="btn btn-primary" href="create.do" role="button">Create New Film</a>


<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>