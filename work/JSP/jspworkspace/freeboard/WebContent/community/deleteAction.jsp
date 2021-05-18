<%@page import="com.korea.dao.FreeboardDao"%>
<%@page import="com.korea.vo.Comment"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

		int idx=	Integer.parseInt(request.getParameter("idx"));	
		int currentPage = Integer.parseInt(request.getParameter("pno"));
			
		FreeboardDao freedao = FreeboardDao.getInstance();
		freedao.delete(idx);
		
		response.sendRedirect("listAction.jsp?pno="+currentPage);
		
		/* out.print("<script>");
		out.print("location.href='listAction.jsp?pno="+currentPage+"';");
		out.print("</script>"); */

%>