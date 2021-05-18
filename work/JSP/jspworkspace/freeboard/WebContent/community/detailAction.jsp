<%@page import="com.korea.dao.CommentDao"%>
<%@page import="com.korea.dao.FreeboardDao"%>
<%@page import="com.korea.vo.Comment"%>
<%@page import="java.util.List"%>
<%@page import="com.korea.vo.Freeboard"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	FreeboardDao freedao = FreeboardDao.getInstance();
//*댓글 dao
	CommentDao cmtdao = CommentDao.getInstance();	

	//1개의 pno 파라미터가 없으면? 1)기본값을 준다.  2) 오류페이지로 이동한다.(O)
	int idx = Integer.parseInt(request.getParameter("idx"));
	//글 상세보기 -> 글목록으로 돌아가기(보던 페이지)
	int currentPage = Integer.parseInt(request.getParameter("pno"));

	//*comment 에서 필드 mref로 검색한 결과의 리스트가 필요합니다. 검색값은 idx
	List<Comment> cmtlist = cmtdao.getCmtList(idx);
	
	//freeboard에서 필드 readcount 업데이트 (1증가)
	if(request.getParameter("nocnt")==null)   //댓글 입력 후 detailAction.jsp 실행할 때는 조회수 증가 안함.
		freedao.updateCount(idx);
	
	Freeboard bean = freedao.getOne(idx);
	request.setAttribute("pno", currentPage);
	request.setAttribute("bean", bean);  //상세보기페이지로 detail.jsp
	//*댓글리스트 바인딩 필요
	request.setAttribute("cmtlist", cmtlist);
	pageContext.forward("detail.jsp");
%>

