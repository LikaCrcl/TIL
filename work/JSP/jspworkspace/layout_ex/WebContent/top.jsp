<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="header">
<div>
<h3>My TOP</h3>
<br>
<!-- 메뉴 nav 구성 -->
<div style=" float: left;display: inline-block;">
<a href="index.jsp?file=main">MAIN</a>
<a href="index.jsp?file=./vote/form">설문작성하기</a>
<%
	if(application.getAttribute("title") != null) {
%>
	<a href="index.jsp?file=./vote/vote">투표하기</a>
<%
	}
%>
</div>
<!-- 로그인 /로그아웃 -->
<div style=" float: right;display: inline-block;">
<%
			//세션 정보 가져오기
			String uid = (String) session.getAttribute("uid");
			if (uid == null) {
		%>
		<a href="./index.jsp?file=login">로그인</a>
		<%
			} else {
		%>
		<%= session.getAttribute("uid")%> 님 환영합니다. &nbsp;&nbsp;
		<a href="logout.jsp">로그아웃</a>
		<%
			}
		%>
	</div>	
</div>
</div>







