<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("uid") != null) {
		out.print("<script>");
		out.print("alert('로그인이 되어 있습니다.');");
		out.print("history.back(-1);");
		out.print("</script>");
	}else {
%>
<div class="container">
	<h4>로그인</h4>
	<form action="loginProc.jsp" method="POST" style=" height: 300px;">
		<input type="text" name="uid" 
			placeholder="아이디 입력하세요." required><br>
		<input type="password" name="pwd"
			placeholder="패스워드를 입력하세요." required><br><br>
		<input type="submit" value="Login">
		<input type="button" value="Join" 
			onclick="location.href='?file=./member/userForm'">
	</form>
</div>
<%
	}
%>