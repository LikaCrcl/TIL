<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style type="text/css">
div{
	width: 200px;
	height: 200px;
	background-color: #888;
	padding: 50px;
	margin: 100px auto;
}
input[type=text], input[type=password], input[type=email] {
	width: 80%;
}
input[type=submit], input[type=button] {
	padding: 7px 15px;
	margin: 7px 15px;
	background: #c69;
	font-size: 1.1em;
	color: white;
	border: none;
	cursor: pointer;
}
input[type=submit]:hover, input[type=button]:hover {
	/* :hover 는 mouseover 스타일 */
	background: #c39;
}
</style>
<script type="text/javascript">
	function goHome() {
		location.href='home.jsp';
	}
</script>
</head>
<body>
<div>
	<!-- action : 입력을 처리할 페이지, method : query string(get) or form data(post) -->
	<form action="loginProc.jsp" method="post">
		<label>아이디</label><br>
		<input type="text" name="userid" id="userid"><br><br>
		<label>패스워드</label><br>
		<input type="password" name="pwd" id="userid"><br><br>
		<input type="submit" value="로그인">
		<input type="button" value="홈" onclick="goHome()">
	</form>
</div>
</body>
</html>