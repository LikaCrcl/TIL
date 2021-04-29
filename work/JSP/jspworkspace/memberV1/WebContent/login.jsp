<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 (login.jsp)</title>
<style type="text/css">
div {
	width: 200px;
	height: 200px;
	background-color: #888;color:white;
	padding: 50px;
	margin: 100px auto;
}
input{ 	padding: 7px; }
input[type=text],input[type=password]{
	border-radius: 4px; border: 2px solid #ccc;
}
input[type=submit], input[type=button] {
	padding: 7px 15px;
	margin: 7px 10px;
	background: #c69;
	color: white;
	border: none;
	cursor: pointer;
	width:35%;
}
</style>
<script type="text/javascript">
	function goHome() {
		location.href='./home';		/* 요청 url 변경 */
	}
</script>
</head>
<body>
<div>
	<!-- action :입력을 처리할 페이지, 
		 method : query string(GET) or form data(POST) -->
	<form action="login" method="post" >
		<label for="userid">아이디</label><br>
		<input type="text" name="userid" id="userid" placeholder="이메일"><br><br>
		<label for="pwd">패스워드</label><br>
		<input type="password" name="pwd" id="pwd" placeholder="패스워드"><br><br>
		<input type="submit" value="로그인">
		<input type="button" value="홈" onclick="goHome()">
	</form>
</div>
</body>
</html>