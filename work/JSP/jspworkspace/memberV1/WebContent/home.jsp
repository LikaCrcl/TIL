<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login_jstl 프로젝트</title>
<style type="text/css">
div{
	width:200px;height: 200px;
	background-color: #888;
	padding:50px;
	margin: 100px auto;
}
</style>
</head>
<body>
<div>
<!-- 객체가 null 인지 비교 : 같다(==)는 eq , 같지않다(!=)  ne  -->
<c:choose>
	<c:when test="${member == null}">
		<a href="login">로그인</a>&nbsp;&nbsp;&nbsp;&nbsp;
	</c:when>
	<c:otherwise>
		<h5 style="color:orange;">${member.email}&nbsp;님 환영합니다.</h5>
		<a href="">프로필 설정하기</a>
		<a href="logout">로그아웃</a>
	</c:otherwise>
</c:choose>


</div>
</body>
</html>








