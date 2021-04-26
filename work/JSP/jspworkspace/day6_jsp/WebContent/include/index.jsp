<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp include 테스트</title>
</head>
<body>
<%@include file="top.jsp" %>
<h4>jsp include 방법</h4>
1. include 지시자로 한다. html 코딩 소스를 포함시켜 컴파일한다. 실행하면서 include 된 파일은 변경 못함.<br>
2. jsp:include 태그로 한다.  컴파일된 파일을 실행하기 위해 제어가 이동되는 형식이다. 실행하면서 include된 파일 변경 가능.
<%@include file="bottom.jsp" %>
</body>
</html>