<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// session 무효화 - 세션 정보 삭제
	session.invalidate();
	out.print("<script>");
	out.print("alert('로그아웃됨');");
	out.print("location.href='home.jsp';"); // home으로 url 이동
	out.print("</script>");
%>