<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>VISIT JAPAN</title>
	<%@ include file="./common/bootstrap.jsp" %>
</head>
<body>
<h1>
	VISIT JAPAN 
</h1>
<div class="container">
	<c:forEach items="${boardList}" var="board">
		<a href="#">${board.name}</a>
	</c:forEach>
</div>
</body>
</html>
