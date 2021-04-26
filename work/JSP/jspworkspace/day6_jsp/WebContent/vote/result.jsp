<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표결과 보기</title>
</head>
<body>
<%
	Map<String, Integer> map = (HashMap<String, Integer>) application.getAttribute("vote");
%>
<table style="width: 90%;">
	<tr>
		<td colspan="4"><h4>점심메뉴 투표결과</h4>
		<a href="vote.jsp">홈으로</a><br>
		</td>
	</tr>
	<tr>
		<td style="width: 30%;">삼겹살</td>
		<td style="width: 50%;">
			<hr color="green" size="20px" align="left" width="<%= map.get("삼겹살") * 20 %>px">
		</td>
		<td><%=map.get("삼겹살") %> 표</td> <!-- key값 삼겹살로 value 가져오기 -->
	</tr>
	<tr>
		<td style="width: 30%;">스파게티</td>
		<td style="width: 50%;">
			<hr color="green" size="20px" align="left" width="<%= map.get("스파게티") * 20 %>px">
		</td>
		<td><%=map.get("스파게티") %> 표</td>
	</tr>
	<tr>
		<td style="width: 30%;">김치찌개</td>
		<td style="width: 50%;">
			<hr color="green" size="20px" align="left" width="<%= map.get("김치찌개") * 20 %>px">
		</td>
		<td><%=map.get("김치찌개") %> 표</td>
	</tr>
	<tr>
		<td style="width: 30%;">쌀국수</td>
		<td style="width: 50%;">
			<hr color="green" size="20px" align="left" width="<%= map.get("쌀국수") * 20 %>px">
		</td>
		<td><%=map.get("쌀국수") %> 표</td>
	</tr>
	<tr>
		<td style="width: 30%;">안먹음</td>
		<td style="width: 50%;">
			<hr color="green" size="20px" align="left" width="<%= map.get("안먹음") * 20 %>px">
		</td>
		<td><%=map.get("안먹음") %> 표</td>
	</tr>
</table>
</body>
</html>