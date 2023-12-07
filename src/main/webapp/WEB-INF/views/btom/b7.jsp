<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>b7.jsp</title>
  <jsp:include page="/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
	<h2>이곳은 btom 폴더 - b7.jsp</h2>
	<hr/>
	<div>
		<form method="post">
			<div>성명 : <input type="text" name="name" id="name" value="홍길동" class="form-control" /></div>
			<div>나이 : <input type="number" name="age" id="age" value="20" min="0" max="99" class="form-control mb-3" /></div>
			<div>아이디 : <input type="text" name="mid" value="hkd1234" class="form-control" /></div>
			<div>비밀번호 : <input type="password" name="pwd" value="1234" class="form-control" /></div>
			<div>성별 : 
				<input type="radio" name="gender" value="남자"/>남자 &nbsp;
				<input type="radio" name="gender" value="여자" checked/>여자
			</div>
			<div>주소 : <input type="text" name="address" value="청주" class="form-control" /></div>
			<input type="hidden" name="job" value="학생" />
			<input type="hidden" name="wDate" value="<%=new java.util.Date() %>" />
			<div><input type="submit" value="전송" class="btn btn-success"/></div>
		</form>
	</div>
	<hr/>
	<div>
		<%-- <c:if test="${!empty name && !empty age}"> --%>
		<!-- lombok사용할 경우 두번째 글짜만 대글자 -> 에러발생 | 두번째 글자가 대문자일경우 첫번째 글자도 대문자로 -->
			넘어온 값<br/>성명 : ${vo.name} | 나이 : ${vo.age} | 아이디 : ${vo.mid} | 비밀번호 : ${vo.pwd} | 성별 : ${vo.gender} | 주소 : ${vo.address} | 직업 : ${vo.job} | 날짜 : ${vo.WDate}
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