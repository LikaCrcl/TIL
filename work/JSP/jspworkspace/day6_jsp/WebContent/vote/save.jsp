<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- vote.jsp의 입력 파라미터를 저장하고 비지니스 로직을 처리함.

	선택한 메뉴의 count를 증가시키고 변경된 데이터를 attribute에 저장한다 -->
<%
	// application 객체 attribute에 메뉴 이름과 카운트를 저장하는 Map 객체를 저장
	Map<String, Integer> map = (HashMap<String, Integer>) application.getAttribute("vote");
	
	// 맨 처음 실행했을 때 attribute = null. -> 초기화 필요
	if (map == null) {
		map = new HashMap<String, Integer>();
		map.put("삼겹살", 0);
		map.put("스파게티", 0);
		map.put("김치찌개", 0);
		map.put("쌀국수", 0);
		map.put("안먹음", 0);
	}
	
	// 선택한 메뉴 파라미터로 가져와 카운트 증가시키기
	String menu = request.getParameter("menu");
	int cnt = map.get(menu);
	cnt++;
	map.put(menu, cnt); // 선택메뉴 카운트 증가값으로 변경
	
// 	out.print(menu + ":" + cnt); // 확인값 출력
	
	application.setAttribute("vote", map);
	response.sendRedirect("result.jsp"); // 결과보기 페이지로 이동
%>