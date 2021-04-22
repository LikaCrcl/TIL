<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>attrResult.jsp : attribute 저장 확인 페이지</title>
</head>
<body> <!-- 실행은 각각 pagecontext.jsp, sendredirect.jsp에서 하여 비교 -->
<!-- Attribute는 request, session, application에 Object타입의 데이터를 저장하도록 제공됨 -->
request객체 test1 attribute : <%= request.getAttribute("test1") %><br>
session 객체 session1 attribute : <%= session.getAttribute("session1") %><br>
application 객체 app1 attribute : <%= application.getAttribute("app1") %><br>
<a href="attrTest.jsp">attribute attrTest.jsp에서 확인해보기</a>
</body>
</html>