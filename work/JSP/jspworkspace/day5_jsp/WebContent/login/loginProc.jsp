<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// login.jsp의 입력을 변수에 저장한다
	String uid = request.getParameter("userid");
	String pwd = request.getParameter("pwd");
	
	// 패스워드, 암호화&DB에 저장된 값과 비교. 암호 1212라 가정
	if(pwd.trim().equals("1212")) { // 암호 일치
		// session 정보 저장. 임의로 uid값 저장
		session.setAttribute("uid", uid);
		// 로그인 완료 -> 페이지 home.jsp로 이동
		response.sendRedirect("home.jsp");
	} else { // 암호 불일치
		out.print("<script>");
		out.print("alert('패스워드 틀림');");
		out.print("history.back();"); // 뒤로 가기
		out.print("</script>");
	}
	
	
%>