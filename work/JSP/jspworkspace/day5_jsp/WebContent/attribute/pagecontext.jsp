<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext.forward() test</title>
</head>
<body>
	<%
	request.setAttribute("test1", 123);	
	session.setAttribute("session1", "good");
	application.setAttribute("app1", 3.14);
	pageContext.forward("attrResult.jsp"); // 페이지를 보여주는 파일만 변경, url 그대로. request객체의 정보 유지.
	%>
</body>
</html>