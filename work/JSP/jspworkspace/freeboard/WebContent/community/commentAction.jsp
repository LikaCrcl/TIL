<%@page import="com.korea.dao.FreeboardDao"%>
<%@page import="com.korea.dao.CommentDao"%>
<%@page import="com.korea.vo.Comment"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("UTF-8");
	
	int idx = Integer.parseInt(request.getParameter("mref"));    //댓글 입력 완료 후 detailAction.jsp로 url 변경할 때 필요한 파라미터 : 메인글 idx
	int mref = Integer.parseInt(request.getParameter("mref"));
	int pno = Integer.parseInt(request.getParameter("pno"));
	
	String name= request.getParameter("name");
	String password= request.getParameter("password");
	String content= request.getParameter("content");

	Comment bean = new Comment();  bean.setMref(mref);  bean.setName(name); bean.setPassword(password);bean.setContent(content);
	bean.setIp(request.getRemoteAddr());   /* 댓글 입력 클라이언트의 ip */
	
	//dao 객체 생성하고 insert
	CommentDao cmtdao = CommentDao.getInstance();
	cmtdao.insert(bean);
	
	//FreeboardDao freedao=FreeboardDao.getInstance();
	int cmtcnt = cmtdao.getCmtCnt(mref);  //현재 글의 댓글 개수 구함.
	cmtdao.updateCmtCnt(cmtcnt, idx);     //위 실행결과로 업데이트
	
	
	//댓글 입력 완료 후 돌아가야할 url
	response.sendRedirect("detailAction.jsp?nocnt=&idx="+idx+"&pno="+pno);

%>





