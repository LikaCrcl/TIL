<%@page import="com.korea.test.Vote"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");	

	String title= request.getParameter("title");
	String[] content = request.getParameterValues("content");

	//out.print(Arrays.toString(content));
	
	//Vote 객체 리스트 생성하여 애트리뷰트로 저장하기
	List<Vote> vlist = new ArrayList<>();	
	
	for(int i=0;i<5;i++)
		vlist.add(new Vote(content[i],0));
	
	application.setAttribute("title", title);  //String 저장
	application.setAttribute("vlist", vlist);  //List 
	
	response.sendRedirect("../index.jsp");
%>





