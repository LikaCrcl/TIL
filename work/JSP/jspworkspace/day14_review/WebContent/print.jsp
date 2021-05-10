<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 복습 : print.jsp</title>
</head>
<body>
<%
	String para1 = request.getParameter("value1");
%>
첫번째 테스트 :
<%=para1 %> , EL: ${param.value1 }(el 은 애트리뷰트 값 가져오기, param.xxx : 파라미터 가져오기)<br>
setUrl2() 자바스크립트로 전달된 파라미터 출력: <br>
grade : ${param.grade } , name : ${param.name } <br><br>

<a href="home.jsp">홈으로 가기</a>
</body>
</html>