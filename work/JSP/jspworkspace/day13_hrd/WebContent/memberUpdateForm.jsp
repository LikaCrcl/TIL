<%@page import="hrd.vo.Member"%>
<%@page import="hrd.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
<link rel="stylesheet" href="day13.css">
<script type="text/javascript">
	function validCheck() {
		var grd = document.frm1.grade.value;
		var city = document.frm1.city.value.length;   /*글자 갯수  */
		if(grd!="A" && grd!="B" && grd!="C"){
			alert("고객등급 A,B,C 중에서 입력하세요.!");
			frm1.grade.focus();
			frm1.grade.select();
			return false;
		}
		if(city != 2){
			alert("도시코드는 2자리 숫자입니다.!");
			frm1.city.focus();
			frm1.city.select();
			return false;
		}
		return true;
	}


</script>
</head>
<body>
<%@ include file="top.jsp" %>
<%
	//MemberDao 에 selectOne 메소드 작성.	
	MemberDao memberDao = (MemberDao)application.getAttribute("memberDao");
	int custno = Integer.parseInt(request.getParameter("custno"));
	Member member = memberDao.selectOne(custno);

	pageContext.setAttribute("member", member);	
%>
<section>
	<form action="updateProc.jsp" method="post" name="frm1" onsubmit="return validCheck()">
		<input type="hidden" value="${member.custno}" name="custno">
		<table>
			<tr><td colspan="2">회원 정보 수정</td></tr>
			<tr><td style="width:30%;">회원번호</td>
				<td class="tleft">
				<input type="text" value="${member.custno}" name="custno0" size="20" disabled="disabled"></td></tr>
			<tr><td>회원성명</td>
				<td class="tleft">
				<input type="text" name="custname" value="${member.custname}" size="20" disabled="disabled"></td></tr>
			<tr><td>회원전화</td>
				<td class="tleft"><input type="text" name="phone" value="${member.phone}" size="30"></td></tr>
			<tr><td>회원주소</td>
				<td class="tleft"><input type="text" name="address" value="${member.address}" size="50"></td></tr>
			<tr><td>가입일자</td>
				<td class="tleft"><input type="text" name="joindate" value="${member.joindate }" size="20"></td></tr>
			<tr><td>고객등급[A:VIP,B:일반,C:직원]</td>
				<td class="tleft"><input type="text" name="grade" value="${member.grade}" size="20"></td></tr>
			<tr><td>도시코드</td>
				<td class="tleft"><input type="text" name="city" value="${member.city}" size="20"></td></tr>
			<tr><td colspan="2">
				<input type="submit" value="수정">
				<input type="reset" value="다시쓰기">
				<input type="button" value="조회" onclick="location.href='memberList.jsp';">
				</td></tr>
					
		</table>
	
	</form>

</section>
<%@ include file="bottom.jsp" %>
</body>
</html>