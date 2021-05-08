<%@page import="hrd.vo.Member"%>
<%@page import="java.util.List"%>
<%@page import="hrd.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List</title>
<link rel="stylesheet" href="day13.css">
</head>
<body>
<%@ include file="top.jsp" %>
<%
	MemberDao memberDao = (MemberDao)application.getAttribute("memberDao");
	List<Member> members = memberDao.getMembers();
	pageContext.setAttribute("list", members);
%>
<section>
	<table>
		<tr><td colspan="7" style="font-size: 1.2em;">회원목록조회/수정</td></tr>
		<tr>
			<th width="10%">회원번호</th>
			<th width="10%">회원성명</th>
			<th width="15%">전화번호</th>
			<th width="30%">주소</th>
			<th width="15%">가입일자</th>
			<th width="10%">고객등급</th>
			<th>거주지역</th>
		</tr>
		<c:forEach var="member" items="${list}">   <!-- pageContext 애트리뷰트에서 가져온다.  -->
		<tr>
			<td><a href="memberUpdateForm.jsp?custno=${member.custno }">${member.custno }</a></td>
									<!-- 회원수정페이지에 파라미터값 가져가기 -> select 검색조건으로 쓰일값. -->
			<td>${member.custname }</td>
			<td>${member.phone }</td>
			<td>${member.address }</td>
			<td>${member.joindate }</td>
			<td>
				<c:if test="${member.grade =='A' }">VIP</c:if>
				<c:if test="${member.grade =='B' }">일반</c:if>
				<c:if test="${member.grade =='C' }">직원</c:if>
			</td>
			<td>${member.city }</td>
		</tr>
		</c:forEach>
	</table>



</section>
</body>
</html>