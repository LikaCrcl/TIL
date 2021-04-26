<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//request.setCharacterEncoding("UTF-8");	
	//uid 는 영문으로만 입력.
	String uid = request.getParameter("uid");
	String pwd = request.getParameter("pwd");  //1111
	
	//session 데이터 저장.session 정보 유지.
	if(pwd.trim().equals("1111")) {	//패스워드 일치
		//pwd 값의 앞뒤 공백 제거
		
		session.setAttribute("uid", uid);  //session 정보 저장
		
		response.sendRedirect("index.jsp");
		
	}else {		//패스워드 불일치
		out.print("<script>");
		out.print("alert('패스워드 정보가 틀립니다.');");
		out.print("history.back(-1);");
		out.print("</script>");
	}


%>