<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 연습 : request_parameter.jsp(사용자 입력)</title>
<script type="text/javascript">
	function validateForm(){
		var frm = document.frmTest;
		if (frm.num1.value==""){
			alert("정수값을 입력해주세요.");
			frm.num1.focus();
			return false;
		}
		if (frm.num2.value==""){
			alert("정수값을 입력해주세요.");
			frm.num2.focus();
			return false;
		}
		/* 정규식 : 입력한 값이 숫자,자리수 갯수등을 검사하는 식  ~~~~  번외로!*/
	}
</script>
</head>
<body>
<form action="request_result.jsp" onsubmit="return validateForm()" name="frmTest"> 
<!--  action 속성 : input 사용자 입력을 서버에 전송하고 처리할 파일 
			404오류 : 요청페이지(파일)이 존재하지 않을 때 발생한다.-->

테스트 메시지 : <input type="text" name="msg"><br>

테스트 정수 : 1번 값 <input type="text" name="num1"> &nbsp;&nbsp;&nbsp; 
		  2번값 <input type="text" name="num2"><br>
	<input type="submit" value="전송">
<!-- submit 을 하면 action으로 지정한 파일에서 처리하도록 이동한다.-->
</form>

</body>
</html>