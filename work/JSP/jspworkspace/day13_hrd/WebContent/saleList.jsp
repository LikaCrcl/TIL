<%@page import="hrd.vo.Sale"%>
<%@page import="java.util.List"%>
<%@page import="hrd.dao.SaleDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sale List</title>
<link rel="stylesheet" href="day13.css">
</head>
<body>
<%@ include file="top.jsp" %>
<%
	//ContextLoaderListener 에서 저장한 애트리뷰트 
	//   sc.setAttribute("saleDao", saleDao); 를 가져와서 dao 메소드 실행한다.
	SaleDao saleDao = (SaleDao)application.getAttribute("saleDao");
	List<Sale> sales = saleDao.getSales();
	//System.out.print(sales);   //데이터 확인
	pageContext.setAttribute("list", sales);   //현재페이지 pageContext 객체에 애트리뷰트를 저장한다.
%>
<section>
	<table>
		<tr><td colspan="4" style="font-size: 1.2em;">회원매출조회</td></tr>
		<tr>
			<th width="20%">회원번호</th>
			<th width="20%">회원성명</th>
			<th width="20%">고객등급</th>
			<th width="20%">매출</th>
		</tr>
		<c:forEach var="sale" items="${list}">   <!-- pageContext 애트리뷰트에서 가져온다.  -->
		<tr>
			<td>${sale.custno }</td>
			<td>${sale.custname }</td>
			<td>${sale.grade2 }</td>
			<td>${sale.total }</td>
		</tr>
		</c:forEach>
	</table>
</section>
<%@ include file="bottom.jsp" %>
</body>
</html>