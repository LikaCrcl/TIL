<%@page import="com.korea.test.MyUser"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>attrSave : attribute 저장만 합니다</title>
</head>
<body>
<h3>request 객체에 List 타입 attribute 저장 테스트</h3>
	<%
		List<String> names = new ArrayList<>();
		names.add("도봉순");
		names.add("박보영");
		names.add("안정환");
		names.add("존슨");
		names.add("Tom");
		
		request.setAttribute("names", names); // List 객체를 names attribute에 저장
		
// 		pageContext.forward("attrTest.jsp");
		
		// MyUser type으로 List 생성 및 myuser로 attribute 저장
		MyUser james = new MyUser("james", 19, "LA");
		MyUser king = new MyUser("king", 28, "NY");
		MyUser alan = new MyUser("alan", 27, "Las Vegas");
		List<MyUser> myuser = new ArrayList<>();
		myuser.add(james);
		myuser.add(king);
		myuser.add(alan);
		
		request.setAttribute("myuser", myuser);
		
		pageContext.forward("attrTest.jsp");
	%>
</body>
</html>