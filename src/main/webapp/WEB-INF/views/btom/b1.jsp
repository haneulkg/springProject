<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>b1.jsp</title>
  <jsp:include page="/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>이곳은 btom 폴더 - b1.jsp</h2>
	<hr/>
	<p>
		<a href="${ctp}/" class="btn btn-secondary">Home</a>
	</p>
</div>
<p><br/></p>
</body>
</html>