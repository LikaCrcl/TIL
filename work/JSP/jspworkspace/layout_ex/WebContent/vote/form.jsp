<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("uid") == null){
		out.print("<script>");
		out.print("alert('로그인을 해야합니다.');");
		out.print("location.href='./index.jsp?file=login'");
		out.print("</script>");
	}
%>
<div class="container">	
<form action="./vote/formSave.jsp" method="post">
<table style="width: 80% ">
	<tr><th style="width: 30%;">설문제목</th>
		<td style="width: 70%;"><input type="text" name="title" size="40"></td>
	</tr>
	
	<tr><th>번호</th>
		<th>설문 항목</th>
	</tr>
<%
	for(int i=0;i<5;i++){
%>	
	<tr><td><%=i+1 %></td>
		<td><input type="text" name="content"></td>
	</tr>		
<%
	}
%>
	<tr><td colspan="2">
		<input type="submit" value="설문 저장">
		<input type="reset" value="다시쓰기">
		</td>
	</tr>
</table>
</form>
</div>
