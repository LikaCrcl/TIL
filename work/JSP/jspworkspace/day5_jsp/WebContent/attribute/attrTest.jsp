<%@page import="com.korea.test.MyUser"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>attrTest : attribute 확인하기</title>
</head>
<body>
session attribute : <%= session.getAttribute("session1") %><br>
application attribute : <%= application.getAttribute("app1") %><br>
<hr>
<h4>attrSave에서 저장한 List type attribute 출력</h4>
<ul> <!-- list 작성해주는 html tag. <li>내용</li> -->
<!-- attrSave에서 실행 -->
<%
	List<String> names = (List<String>) request.getAttribute("names");
	for (int i = 0; i < names.size(); i++) {
%>
		<li><%= names.get(i) %></li>
<%
	}
%>
</ul>
<hr>
<h4>MyUser List type attribute</h4>
<ul>
<%
	List<MyUser> myuser = (List<MyUser>) request.getAttribute("myuser");
	for (int i = 0; i < myuser.size(); i++) {
%>
		<li> 
		Name : <%= myuser.get(i).getName() %> 
		Age : <%= myuser.get(i).getAge() %>
		Addr : <%= myuser.get(i).getAddr() %>
		</li>
<%	
	}
%>
</ul>
</body>
</html>