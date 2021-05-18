<%@page import="com.korea.vo.Freeboard"%>
<%@page import="com.korea.dao.FreeboardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String func = request.getParameter("func");
	int idx = Integer.parseInt(request.getParameter("idx"));
	int pno = Integer.parseInt(request.getParameter("pno"));
	FreeboardDao freedao = FreeboardDao.getInstance();
	//func=view 이면 update.jsp 페이지 화면 보여주기.pageContext.forwd 는 애트리뷰트에 데이터 저장.
	if(func!=null && func.equals("view")){  //update.jsp 화면 표시(기존값 출력)
		 request.setAttribute("pno", pno);
		 request.setAttribute("bean", freedao.getOne(idx));
		 pageContext.forward("update.jsp");
	}else{  //func가 null 일때 실행하게 됩니다.
	//그렇지 않으면  , dao 메소드 실행  	//수정을 완료하면 detailAction.jsp로 요청 이동합니다. response.sendRedirect는 파라미터로 데이터전달
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		Freeboard bean = new Freeboard();  
		bean.setIdx(idx); bean.setSubject(subject); bean.setContent(content);
		freedao.update(bean);
		response.sendRedirect("detailAction.jsp?idx="+idx+"&pno="+pno);
	}
%>