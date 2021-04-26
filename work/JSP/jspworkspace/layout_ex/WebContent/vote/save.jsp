<%@page import="java.util.ArrayList"%>
<%@page import="com.korea.test.Vote"%>
<%@page import="java.util.List"%>
<%@page import="java.util.TreeMap"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String menu = request.getParameter("menu");
	int idx = Integer.parseInt(menu);
	//out.print(menu);
	//menu 가 선택된 인덱스 
	//- 선택 인덱스의 Vote 객체 가져와 count +1 저장
	List<Vote> vlist =
	(ArrayList<Vote>)application.getAttribute("vlist");
	
	Vote v = vlist.get(idx);   //선택한 Vote 객체 저장 
	
	int cnt = v.getCount() + 1;	   //count 변수 1증가
	v.setCount(cnt);			   //   "
	
	vlist.set(idx, v);			//idx 인덱스 위치값 수정
	
	System.out.println("cnt : " + cnt);
	//변경된 vlist를 애트리뷰트에 저장하기
	application.setAttribute("vlist",vlist);
	
	//결과페이지 result.jsp 로 이동하기 
	response.sendRedirect("../index.jsp?file=./vote/result2");
%>
