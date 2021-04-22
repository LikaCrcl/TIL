<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SessionTest</title>
</head>
<body>
<%
	// session 유효시간(timeout) 변경
	session.setMaxInactiveInterval(20);	// 20초가 지나면 새로운 세션으로 바뀜.
%>
<h4>생성된 session객체의 정보 몇 가지 확인</h4>
세션 ID : <%=session.getId() %> <br>
<!-- 시간과 관련된 값이 long 형식인 경우 1970/01/01 기준으로 ms단위의 시간경과 값 -->
세션 생성시간 : <%=session.getCreationTime() %> <br> <!-- 리턴타입은 long -->
세션 최근 접근 시간 : <%=session.getLastAccessedTime() %> <br>
</body>
</html>