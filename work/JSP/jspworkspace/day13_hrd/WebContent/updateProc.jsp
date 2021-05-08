<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="hrd.vo.Member" %>    
<%
	request.setCharacterEncoding("UTF-8");
%>
<%-- <jsp:useBean id="bean2" class="hrd.vo.Member" />   <%-- new Member() 생성자가 실행이 된다. --%>
<%-- <jsp:setProperty property="*" name="bean2"/> --%>
<!-- name="bean" 은 객체이름. 여기서는 useBean 의 id값 -->
<%
	int custno =Integer.parseInt(request.getParameter("custno"));
	String phone= request.getParameter("phone");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");   //문자열 -> 날짜로
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  //문자열 -> 날짜로
	
	Member member = new Member(custno,"",phone,address,df.parse(joindate),grade,city);
	
	out.print(member);

%>