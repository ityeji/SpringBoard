<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VISIT JAPAN</title>
<%@ include file="../common/bootstrap.jsp" %>
<!-- logo.jsp와 header.jsp를 화면 내에서 일직선 상에 놓기 위한 CSS 삽입 -->
<style>
	.horizontal-line {
		display: flex;
		justify-content: space-between;
		align-items: center;
	}
</style>
</head>
<body>
<div class="horizontal-line">
	<%@ include file="../common/logo.jsp" %>
	<%@ include file="../common/header.jsp" %>
</div>
<div class="dropdown-center">
  <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
    상세보기
  </button>
  <ul class="dropdown-menu">
    <li><a class="dropdown-item" href="${pageContext.request.contextPath}/article/list/${boardSeq}/1">이런저런</a></li>
    <li><a class="dropdown-item" href="${pageContext.request.contextPath}/article/list/${boardSeq}/2">이건 어때요?</a></li>
    <li><a class="dropdown-item" href="${pageContext.request.contextPath}/article/list/${boardSeq}/3">이거 좋아요!</a></li>
  </ul>
</div>
<table class="table">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">제목</th>
      <th scope="col">작성자</th>
      <th scope="col">조회수</th>
    </tr>
  </thead>
  <tbody class="table-group-divider">
  	<c:forEach items="${articleList}" var="article" varStatus="loop">
    <tr>
      <th scope="row">${loop.index + 1 }</th>
      <td><a href="#">${article.title }</a></td>
      <td>${article.writer }</td>
      <td>${article.viewCnt }</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</body>
</html>