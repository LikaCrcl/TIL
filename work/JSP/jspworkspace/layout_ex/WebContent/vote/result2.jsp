<%@page import="java.util.ArrayList"%>
<%@page import="com.korea.test.Vote"%>
<%@page import="java.util.List"%>
<%@page import="java.util.TreeMap"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container">
<table style="width: 100%;height: 300px;">
	<tr><td colspan="4">
	<h4><%=application.getAttribute("title")%></h4>
	</td></tr>
<%
	List<Vote> vlist 
	= (ArrayList<Vote>)application.getAttribute("vlist");
	DecimalFormat df = new DecimalFormat("0.0%");
	double rate=0;
	
	
		double total = 0;   //총 투표수
		for( Vote v : vlist){
	 total += v.getCount();
		}	
		
		for(Vote v : vlist){
	rate = v.getCount() / total;   //득표율
%>	
	<tr>
		<td style="width:20%;"><%= v.getContent() %></td>
		<td style="width:50%;">
		<hr color="green" size="20" align="left" 
					width="<%= rate * 200 %>"></td>
		<td style="width:15%;"><%= v.getCount() %> 표</td>
		<td style="text-align: right;" >
		<%= df.format(rate) %></td>	
	</tr>
<%
	}
	
%>		
	
</table>	
<% 
	if(total == 0) {
%>
<b style="color: red;">투표 참여가 없네요. 빨리하세요.!</b>
<%
	}
%>
</div>