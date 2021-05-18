<%@page import="com.korea.dao.FreeboardDao"%>
<%@page import="com.korea.vo.Freeboard"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    	request.setCharacterEncoding("UTF-8");
    %>
<jsp:useBean id="bean" class="com.korea.vo.Freeboard">
	<jsp:setProperty property="*" name="bean"/>
</jsp:useBean>
<%
	FreeboardDao freedao = FreeboardDao.getInstance();
	freedao.insert(bean);
	response.sendRedirect("listAction.jsp");   //페이지 수정
%>