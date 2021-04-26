<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//애트리뷰트 삭제
	application.removeAttribute("title");
	application.removeAttribute("vlist");

	response.sendRedirect("home.jsp");
%>