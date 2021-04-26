<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> <!-- HTML 5 -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HOME</title>
</head>
<!--  vo 클래스 Vote.java 활용 -->
<body>
    <a href="form.jsp">설문 만들기</a><br>  <!-- 관리자 -->
    
<%
	if(application.getAttribute("title") == null) {
%>    
		<b style="color: red;"> 설문내용이 없습니다.</b>
<%
	}else {
%>
    	<a href="vote.jsp">설문 투표하기</a>
    	<a href="clear.jsp">설문 삭제하기</a>
<%
	}
%>    	
    <br> <!-- 일반 사용자 -->
</body>
</html>