<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>b6.jsp</title>
  <jsp:include page="/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>이곳은 btom 폴더 - b6.jsp</h2>
	<hr/>
	<div>
		<form method="post">
			<div>성명 : <input type="text" name="name" id="name" value="홍길동" class="form-control" /></div>
			<div>나이 : <input type="number" name="age" id="age" min="25" max="99" class="form-control mb-3" /></div>
			<div>아이디 : <input type="text" name="mid" value="hkd1234" class="form-control" /></div>
			<div>비밀번호 : <input type="password" name="pwd" value="1234" class="form-control" /></div>
			<div>성별 : 
				<input type="radio" name="gender" value="남자"/>남자 &nbsp;
				<input type="radio" name="gender" value="여자" checked/>여자
			</div>
			<div>주소 : <input type="text" name="address" value="청주" class="form-control" /></div>
			<div><input type="submit" value="전송" class="btn btn-success"/></div>
		</form>
	</div>
	<hr/>
	<div>
		<%-- <c:if test="${!empty name && !empty age}"> --%>
			넘어온 값<br/>성명 : ${vo.name} | 나이 : ${vo.age} | 아이디 : ${vo.mid} | 비밀번호 : ${vo.pwd} | 성별 : ${vo.gender} | 주소 : ${vo.address}
		<%-- </c:if> --%>
	</div>
	<hr/>
	<p>
		<a href="${ctp}/" class="btn btn-secondary">Home</a>
	</p>
</div>
<p><br/></p>
</body>
</html>