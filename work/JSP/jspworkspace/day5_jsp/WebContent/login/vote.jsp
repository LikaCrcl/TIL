<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표하기. 로그인 했을 때만 접근할 수 있음</title>
</head>
<body>
<%
	if (session.getAttribute("uid") == null) { // 로그인 안돼있음
		out.print("<script>");
		out.print("alert('로그인 안됨');");
		out.print("location.href='login.jsp';"); // login으로 url 이동
		out.print("</script>");
	}
%>
</body>
</html>