<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 복습 : home.jsp</title>
<script type="text/javascript">  /* 클라이언트 브라우저에서 해석하고 실행. */
	function setUrl() {
		//이전에 필요한 처리 후에 url 요청 변경
		location.href="print.jsp";
	}
	function setUrl2(i,name){
		var grade;
		if(i>510) grade='A';
		else grade='B';
		location.href="print.jsp?grade="+grade+"&name="+name+"&i="+i;  //파라미터 여러개일때 구분기호는 &
		
	}  /* 자바스크립트 함수의 인자는 갯수만 맞게 하면됩니다. 변수도 선언할 때 모든 타입 var 로 합니다.*/
	function setData(i,name){
		var frm=document.frmData;
		frm.data1.value=i;           //form 태그 안의 input 값을 수정하기.  
		frm.data2.value=name;
	}  //스케쥴 예제에서 스케쥴 수정할때. 기존값을 input 태그로 넘기고 수정하도록 하는 방법.
</script>
</head>
<body>
<c:if test="${param.logout=='y' }">
	<script>
		alert('로그아웃되었습니다.');
	</script>
</c:if>
<h4>파라미터 사용 예제</h4>
<a href="print.jsp">print.jsp로 파라미터 보내기1</a>
<input type="button" value="go print" onclick="location.href='print.jsp'"><!-- onclick 의 실행내용은 자바스크립트 명령 -->
<br><br>
<a href="print.jsp?value1=hwang">print.jsp로 파라미터 보내기2</a><br><br>
* 파라미터값을 전달할때 표현식 변수 또는 el을 사용할 수 있다.<br><br>
<a href="?logout=y">현재 요청에게 파라미터를 전달하면서 다시 페이지요청한다.</a><br>
*?앞에 home.jsp가 생략된것이다.<br><br>
<a href="javascript:setUrl()">자바스크립트함수로 요청바꾸기</a>
<br><br>
<c:forEach var="i" begin="500" end="520">
<a href="javascript:setUrl2('${i }','홍길동')">${i }:</a>자바스크립트 함수로 인자값 전달하며 요청바꾸기
<input type="button" value="실행(go print.jsp)" onclick="setUrl2('${i }','홍길동')"><br>
</c:forEach>
<hr>
<h4>현재 페이지 안에서 데이터 전달하는 예제</h4>
<form name="frmData">
	<input type="text" name="data1"> <input type="text" name="data2">
	
</form><br><br>
<c:forEach var="i" begin="1000" end="1020">
	<a href="javascript:setData('${i }','박보영')">${i }:</a>자바스크립트 함수로 인자값 전달하여 input 태그에 표시하기<br>
</c:forEach>

</body>
</html>

















