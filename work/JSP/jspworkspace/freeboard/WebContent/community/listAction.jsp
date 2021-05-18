<%@page import="com.korea.dao.FreeboardDao"%>
<%@page import="com.korea.vo.BoardList"%>
<%@page import="com.korea.vo.Freeboard"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	FreeboardDao fdao = FreeboardDao.getInstance();
	int totalcount = fdao.getCount();
	
	int currentPage = 1;  //기본값
	
	String temp = request.getParameter("pno");  //currentPage 결정하는 파라미터값.
	if(temp != null)  //url이 listAction.jsp 이면 파라미터 null
		currentPage = Integer.parseInt(temp);
	
	BoardList blists = new BoardList(currentPage,totalcount,20);   //세번쨰 20은 페이지크기
	//실행 순간 필요한 모든 값이 초기화 ->BoardList 객체에 저장.
	
	
	//**startNo ~ endNo 까지 글 리스트 선택한 것을 BoardList list 멤버로 설정한다.
	blists.setList(fdao.getList(blists.getStartNo(), blists.getEndNo()));
	
	request.setAttribute("blists", blists);
	pageContext.forward("list.jsp");
%>