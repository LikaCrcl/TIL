<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>동아리 커뮤니티</title>
<link rel="stylesheet" href="../css/freeboard.css">
</head>
<body>
<h3>동아리 커뮤니티</h3>
<hr>
<div style="margin:auto;">
 <table>
 	<tr><th width="10%">번호</th>
 		<th width="45%">제목</th>
 		<th width="15%">작성자</th>
 		<th width="10%">조회수</th>
 		<th width="20%">작성일</th></tr>
 	<c:forEach var="vo" items="${blists.list}"> <!-- vo가 Freeboard타입  blists.getList() 실행-->
<tr>
		<td>${vo.idx }</td> 	
 		<td><a href="detailAction.jsp?idx=${vo.idx}&pno=${blists.currentPage}" class="title">${vo.subject }</a>
 		...<span style="color:orange;font-size: 80%;">(${vo.commentCount })
 		</span></td>
 		<td>${vo.name }</td>
 		<td>${vo.readCount }</td>
 		<td>
 		<fmt:formatDate value="${vo.wdate }" pattern="yyyy-MM-dd"/>
 		</td>
 	</tr>
 	</c:forEach>
 	<tr><td colspan="4">Go!<a class="button" href="insert.jsp">글쓰기</a><a class="button" href="${pageContext.request.contextPath }">홈</a></td>
 	<td>작성글 총 개수 : ${blists.totalCount}</td>
 	</tr>
 </table>
</div>
 <!-- 페이지 이동 -->
 <div style="text-align: center;">
	<a class="pagenum" href="?pno=1">&lt;&lt;</a>   <!-- 요청url은 동일하고 파라미터만 변경됩니다. -->
	<a class="pagenum" href="?pno=${blists.startPage-1 }">&lt;</a>  
	<!-- 현재페이지값을 변경 : blists.getStartPage() -1 -->
	
	<c:forEach var="i" begin="${blists.startPage }" end="${blists.endPage }">  <!-- 페이지목록의 범위  -->
		<a class="pagenum" href="?pno=${i}">${i}</a>     <!-- 현재페이지 i값으로 변경  -->
	</c:forEach>
	
	<!-- 현재페이지값을 변경 : blists.getEndPage() +1 -->
	<a class="pagenum" href="?pno=${blists.endPage+1 }">&gt;</a> 
	<a class="pagenum" href="?pno=${blists.totalPage }">&gt;&gt;</a>
</div>
</body>
</html>








