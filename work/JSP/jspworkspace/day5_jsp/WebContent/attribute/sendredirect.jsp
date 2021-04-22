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
		request.setAttribute("test1", 123); // test1은 attribute 이름, 123은 해당값
		session.setAttribute("session1", "good"); // session 객체에 session1 attribute값 good 저장
		application.setAttribute("app1", 3.14);
		response.sendRedirect("attrResult.jsp"); // 응답으로 보여주는 url을 변경. request객체의 요청내용이 바뀜
	%>
</body>
</html>