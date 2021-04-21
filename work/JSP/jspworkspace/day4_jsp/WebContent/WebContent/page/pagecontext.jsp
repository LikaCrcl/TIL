<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext.forward() 테스트</title>
</head>
<body>
	<%
		pageContext.forward("result.jsp");   //페이지를 보여주는 파일만 변경.url은 그대로.request객체의 정보가 유지.
											 //result.jsp에서 동일하게 request객체의 정보를 사용할수 있음.
		//context : 문맥
		//pageContext : jsp 내장 객체
		
	%>
</body>
</html>