<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//애트리뷰트 삭제 - 세션 정보 애트리뷰트 삭제
	//session.removeAttribute("uid");

	//세션 무효화-세션의 모든 정보를 제거
	session.invalidate();
	
	out.print("<script>");
	out.print("alert('로그아웃 되었습니다.');");
	out.print("location.href='index.jsp';");
	out.print("</script>");
%>