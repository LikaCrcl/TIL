<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp include 테스트</title>
</head>
<body>
<%
	String file = request.getParameter("file");
	if (file == null) {
		file = "home";
	}
%>
<%@include file="top.jsp" %> <!-- top.jsp 코드 복붙한거랑 같은 기능 -->
<h4>jsp include 방법 2</h4>
<!-- page 속성에 include 될 파일을 지정하며 변경할 수 있도록 변수 사용 -->
<jsp:include page='<%= file + ".jsp" %>'></jsp:include>
<%@include file="bottom.jsp" %>
</body>
</html>