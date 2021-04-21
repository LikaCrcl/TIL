<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userInfo.jsp : 회원 입력 정보 확인</title>
<style type="text/css">
table {
	width: 100%;
	border-collapse: collapse; /* 6번 */
}

th, td {
	border: 1px solid gray;
	padding: 10px 0px; /* 위 아래 10px, 왼/오른쪽 0px */
}

td {
	text-align: center;   
}

th {
	background-color: tomato;
	color: white;
}

div.box1 {
	width: 70%;
	margin: auto; /* 3번 */
}
</style>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	String email = request.getParameter("email");
	int age = Integer.parseInt(request.getParameter("age"));
	String addr = request.getParameter("addr");
	String gender = request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");  //파라미터가 배열처리된 경우 사용하는 메소드

%>
	<div class="box1">
		<!-- div 태그는 부모태그로서 h3,table 태그를 종속시킨다. -->
		<h3>회원 정보</h3>
		<hr style="background-color: red; height: 2px;">
		<table>
			<!-- 표 시작 : 5줄 2칸의 테이블 작성.-->
			<tr>
				<!-- 행(줄) 추가 -->
				<th width="30%">이름</th>
				<!-- gender 파라미터값이 male 이면 (M) , female이면 (F) 표시해보세요. -->
				<td><%= name %> (<%= gender.toUpperCase().charAt(0) %>)
				<%-- <%
					if(gender.equals("male")) out.print("(M)");				
					else out.print("(F)");
				
				%> --%>
				</td>
				<!-- 열(칸) 추가 -->
			</tr>
			<tr>  
				<th>이메일</th>
				<td><%= email %></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><%= age %>
					<!-- 30세이하이면 파란색으로 (청년) ,30세 초과이면 녹색으로 (성인) <b style='color:green;'>-->
					<%
						if(age<=30) out.print("<b style='color:blue;'>(청년)</b>");					
						else out.print("<b style='color:green;'>(성인)</b>");
					%>
				</td>
			</tr>
			<tr>
				<th>거주지</th>
				<td><%= addr %></td>
			</tr>
			<tr>
				<th>취미</th>
				<td><%= Arrays.toString(hobby)  %></td> <!--  Arrays 클래스 메소드로 배열값을 나열하여 출력하기 -->
			
			</tr>
			<tr>

				<td colspan="2">환영합니다.</td>
				<!-- colspan 속성은 칸합치기  -->
			</tr>

		</table>
	</div>
</body>
</html>





















