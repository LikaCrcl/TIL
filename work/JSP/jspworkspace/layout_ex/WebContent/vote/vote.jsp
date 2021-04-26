<%@page import="java.util.ArrayList"%>
<%@page import="com.korea.test.Vote"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//애트리뷰트 가져오기
	List<Vote> vlist = (ArrayList<Vote>)application.getAttribute("vlist");
	String title = (String)application.getAttribute("title");
%>
<form action="./vote/save.jsp" method="get">
	<fieldset>
		<legend><%= title %></legend>
<%
		for(int i=0;i<vlist.size();i++) {
%>		
		<!--  사용자가 선택한 radio의 i값을 서버에 전송(리스트의 인덱스) -->
		<input type="radio" name="menu" value="<%= i %>">
		<%= vlist.get(i).getContent() %><br>
		<br>
<%
		}
%>		
		<input type="submit" value="투표하기">
		<input type="button" value="결과보기" 
		onclick="location.href='index.jsp?file=./vote/result2';">
	</fieldset>
</form>
