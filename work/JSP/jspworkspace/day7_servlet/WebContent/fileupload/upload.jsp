<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/html");
	
	// 1. 업로드 파일 저장할 폴더 경로 - 폴더 만들기
	String path = "c:\\upload";
	
	// 2. 업로드 파일 크기 제한
	int size = 10*1024*1024; // 10MB
	
	// 3. 파일 업로드에 필요한 request 객체 (이전에는 request.getParameter())
	MultipartRequest multi_request = new MultipartRequest(request,
						path,	// 1
						size,	// 2
						"UTF-8",// 파일명 인코딩 방식
						new DefaultFileRenamePolicy()); // 파일명 중복시 rename 방식
						
	// 4. 입력 파라미터 가져오기
	String writer = multi_request.getParameter("writer");
	String file = multi_request.getFilesystemName("img1"); // 파일이 서버로 저장
	
	// 5. 저장된 데이터 확인
	out.print("작성자 : " + writer + "<br>");
	out.print("업로드 파일 : " + file + "<br>");
	out.print("업로드 파일 형식 : " + multi_request.getContentType("img1") + "<br>");
%>