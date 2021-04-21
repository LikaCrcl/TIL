<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 연습 : request_parameter2.jsp(사용자 입력)</title>
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
<!-- action을 1)pagecontext.jsp 로 테스트 해보세요.   2)sendredirect.jsp 로 테스트 해보세요. 
	  1)번, 2)번 각각 result.jsp 결과를 비교해보세요. -->
<form action="sendredirect.jsp" onsubmit="return validateForm()" name="frmTest"> 
<!--  action 속성 : input 사용자 입력을 서버에 전송하고 처리할 파일 
			404오류 : 요청페이지(파일)이 존재하지 않을 때 발생한다.-->

테스트 메시지 : <input type="text" name="msg"><br>

테스트 정수 : 1번 값 <input type="text" name="num1"> &nbsp;&nbsp;&nbsp; 
		  2번값 <input type="text" name="num2"><br>
	<input type="submit" value="전송">
<!-- submit 을 하면 action으로 지정한 파일에서 처리하도록 이동한다.-->
</form>
<!-- 
	요청(request) 쉽게 url이라고 생각하세요.   pagecontext는 쉽게 .jsp (.html) 파일이라고 생각하세요.
	
	1) 사용자 입력   -> pagecontext.jsp (사용자입력 파라미터를 가져오기O) -> result.jsp (사용자입력 파라미터를 가져오기O)  : request 유지
    2) 사용자 입력   -> sendredirect.jsp (사용자입력 파라미터를 가져오기O) -> result.jsp (사용자입력 파라미터를 가져오기X)  :request 변경

 -->
</body>
</html>
<!-- 

	1)사용자 입력 -> 2)웹서버 db저장(조회) -> 3)저장(조회)완료 페이지   ((결론)) 2)에서 3)으로 변경시 위의 두가지 방법 중 하나로 합니다.   
     a.jsp           b.jsp               c.jsp 

 -->
 
 
 
 
 
 
