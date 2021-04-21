<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response.sendRedirect test</title>
</head>
<body>
	<%
		response.sendRedirect("result.jsp"); // 응답으로 보여주는 url을 변경. request객체의 요청내용이 바뀜
	%>
</body>
</html>