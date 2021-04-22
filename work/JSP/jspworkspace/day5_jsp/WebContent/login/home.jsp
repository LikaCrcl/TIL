<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<style type="text/css">
div{
	width: 200px;
	height: 200px;
	background-color: #888;
	padding: 50px;
	margin: 100px auto;
}
</style>
</head>
<body>
<div>
	<%
		// 세션 로그인 정보저장한 attribute 가져오기
		String uid =  (String) session.getAttribute("uid");
		if (uid == null) {
	%>
			<a href="login.jsp">로그인</a>&nbsp;&nbsp;&nbsp;
	<%
		} else {
	%>
			<h5 style="color: orange;"><%=uid %>%nbsp;님 환영합니다.</h5>
			<a href="logout.jsp">로그아웃</a>
	<%
		}
	%>
	
	<a href="vote.jsp">설문작성하기</a>
</div>
</body>
</html>