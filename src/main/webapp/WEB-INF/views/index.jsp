<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>VISIT JAPAN</title>
	<%@ include file="./common/bootstrap.jsp" %>
</head>
<body>
<%@ include file="./common/header.jsp" %>
<div class="d-flex justify-content-center align-items-center widthauto p-5 fw-bolder fs-1" style="height:60vh">
	<a href="${pageContext.request.contextPath}" class = "link-dark link-offset-2 link-underline link-underline-opacity-0">	
	VISIT JAPAN
	</a> 
</div>
<div class="d-flex">
	<c:forEach items="${boardList}" var="board">
		<a class="p-2 flex-fill text-center link-offset-2 link-underline link-underline-opacity-0 link-secondary" href="${pageContext.request.contextPath}/article/list/${board.seq}">${board.name}</a>
	</c:forEach>
</div>
</body>
</html>
