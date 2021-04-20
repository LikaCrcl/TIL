<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%> <!-- jsp 지시자. 컴파일과 관련된 정보 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제 #1 시작</title>
</head>
<body> <!-- 코드 수정 후에는 브라우저 새로고침. 서버 -->
<% /* 스크립트릿 : jsp 웹페이지 안에 자바코드 작성 가능 */
	String msg = "jsp start test";
	Calendar now = Calendar.getInstance();
%>
message : <h3>받은 메시지는 <%= msg %></h3> <!-- 표현식 : 변수 값, 연산 결과 등 출력 -->
현재 시간 : <h3><%= now.getTime() %></h3>
<hr>
<!-- 자바코드 table에 써보기 -->
<table style="width: 70%">
	<tr><td>번호</td><td>이름</td></tr>
<%
	String[] name = {"홍길동", "도봉순", "김길순", "박세리", "허재"};
	for (int i = 0; i < 5; i++) {
%>
	<tr>
		<td><%= i+1 %></td> <!-- 번호 값 -->
		<td><% if (name[i].equals("박세리")) {
			out.print("<b style='color: blue'>");
			out.print(name[i]);
			out.print("</b>");
			} else {
			%>
			<%= name[i] %>
			<%
			}
			%>
		</td> <!-- 이름 -->
	</tr>
<%
	}
%>
</body>
</html>