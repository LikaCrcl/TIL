<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form 태그에서 요청 파라미터 전달 : form.jsp</title>
<script type="text/javascript">
	function validCheck1(){
		var frm = document.frmData1;
		var d1 = frm.data1.value;
		if(d1.length <5) {
			alert('데이터 길이는 5글자 이상입니다.');
			return false;   //form태그의 submit 취소
		}	
		return true;  //form태그의 submit 실행
	}
	function validCheck2(){
		var frm=document.frmData2;
		var d1=frm.data1.value;
		if(d1.length<5){
			alert('데이터 길이는 5글자 이상입니다.');
			return;
		}else {
			alert('데이터가 전송됩니다.');
			frm.submit();      //자바스크립트에서 form 태그 submit 실행
		}
		
	}
</script>
</head>
<body>
<h4>첫번째 폼</h4>
<form action="print.jsp" name="frmData1" onsubmit="return validCheck1()">
    <input type="text" name="data1">
    <input type="text" name="data2">
    <input type="submit" value="전송(저장,실행,...)">
</form>
<h4>두번째 폼</h4>
<form action="print.jsp" name="frmData2" >
    <input type="text" name="data1">
    <input type="text" name="data2">
    <input type="button" value="전송(저장,실행,...)" onclick="validCheck2()">
</form>
</body>
</html>