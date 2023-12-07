<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>b4.jsp</title>
  <jsp:include page="/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>이곳은 btom 폴더 - b4.jsp</h2>
	<!-- <div><a href="b4Path/btom/23" class="btn btn-info">b4호출</a></div> -->
	<!-- <div><a href="b4Path/btom/23/test" class="btn btn-info">b4호출</a></div> -->
	<div><a href="b4Path/btom-23/test" class="btn btn-info">b4호출</a></div>
	<hr/>
	<div>
		<c:if test="${!empty name && !empty age}"> 넘어온 값 : ${name} , ${age}</c:if>
	</div>
	<div>
		<hr/>
			
		<hr/>
	</div>
	<p>
		<a href="${ctp}/" class="btn btn-secondary">Home</a>
	</p>
</div>
<p><br/></p>
</body>
</html>