<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>     
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 상세보기</title>

<script type="text/javascript">
	function resetOk() {
		var obj = document.frm;
		document.frm.func.value = 1;
		document.frm.cmd.value = '저장';
		document.frm.name.value = '';
		document.frm.content.value='';
		document.frm.password.value='';
		document.frm.name.disabled=false;
		document.frm.content.disabled=false;
	}
	//댓글 수정,삭제 - 데이터 전달
	function delSet(idx) {
		frm2.cmtidx.value=idx;	
		modal.style.display = "block";   //modal 화면에 보이기
	}
	
	//메인글 삭제 확인
	function deleteOk(idx,cpage){
		var yn= confirm( '글을 삭제하시겠습니까?');
		
		if(yn){
			alert('글 ' + idx +'를 삭제합니다.');
			location.href='deleteAction.jsp?func=2&idx='+idx+'&pno='+cpage;
		}
	}

</script>
<link rel="stylesheet" href="../css/freeboard.css">  <!-- 상대경로 ../ 한단계 위로 -->
</head>
<body>
<h3>동아리 커뮤니티</h3>
<hr>
 <table style="width:80%;margin:auto;">
 	<tr><td width="20%" class="td1">제목</td>
 		<td width="40%" class="input1">${bean.subject}</td>
 		<td width="20%" class="td1">조회수</td>
 		<td class="input1">${bean.readCount}</td>
 	</tr>
 	<tr><td class="td1">작성자</td>
 		<td class="input1">${bean.name} 
 		<span style="font-size:70%;padding-left: 30px;">(${bean.ip})</span></td>
 		<td class="td1">작성날짜</td>
 		<td class="input1">
 		<fmt:formatDate value="${bean.wdate }" pattern="yyyy-MM-dd"/>
 		</td>
 	</tr>
 	<tr><td class="td1">내용</td>
 		<td colspan="3" class="input1" style="text-align: left;">
 		<div  style="height: 300px;">
 		<pre>${bean.content }</pre></div></td>   <!-- 엔터,탭,기호 등 텍스트 그대로 출력할 때 사용 -->
 	</tr>
 	<tr><td colspan="4" align="center"><br>
 	<a class="button" href="updateAction.jsp?func=view&idx=${bean.idx }&pno=${pno}">수정</a>
 	<a class="button" onclick="javascript:deleteOk(${bean.idx },${pno });">삭제</a>
 	<a class="button" href="listAction.jsp?pno=${pno }">목록</a><br><br><br>
 	</td></tr>
 </table>
 <!-- 메인글 출력 끝 -->
 <!-- 댓글 시작 -->
 <form action="commentAction.jsp" method="post"><!-- 댓글 입력 -->
 
 <input type="hidden" name="mref" value="${bean.idx}">  <!-- 메인글의 idx -->
 <input type="hidden" name="pno" value="${pno}">   <!-- 현재글의 페이지번호 -->
 <table style="width:60%;margin: auto;">
 	<tr><td colspan="4">댓글 갯수 : ${bean.commentCount }    
 		<input type="button" onclick="history.go(0)" value="새로고침" >
 		<!--  또는 window.location.reload() 현재페이지로 url 재요청-->
 	</td>
 	</tr>
 	<tr><td colspan="4"><hr></td></tr>
 	<!-- 댓글 입력 -->
 	<tr>
 		<td width="25%" >작성자</td><td width="25%"><input type="text" name="name" class="input1"></td>
 		<td width="25%">글비밀번호</td><td><input type="password" name="password"  class="input1"></td>
 	</tr>
 	<tr>
 		<td colspan="3">
 			<textarea rows="5" cols="80" name="content"  placeholder="댓글을 작성하세요." class="input1"></textarea>
 		</td>
 		<td width="15%" style="text-align: left;"><input type="submit" value="저장"></td>
 	</tr>
 	<tr><td colspan="4"><hr></td></tr>
 	<!-- 댓글 출력  -->
 	<c:forEach var="cmt" items="${cmtlist}">
 		<tr>
 			<td colspan="4" style="text-align: left;">
 	<div id="comment">
 			<div>
			 <span class="name">${cmt.name} (${cmt.ip})</span>				
 			 <span class="now">
 			 	<fmt:formatDate value="${cmt.wdate }" pattern="yyyy-MM-dd a hh:mm"/>
 			 </span>
 			 </div>
 			 <div>  <!-- 댓글 내용 -->
 			 	<pre>${cmt.content}<br></pre>
 			 </div>
 	</div>
 			</td>
 		</tr>
 	</c:forEach>
 </table>
 </form>
</body>
</html>









