<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 입력 처리 페이지 : request_result.jsp(비지니스로직 처리)</title>
</head>
<body>
<!-- 실행하면서 브라우저의 url을 꼭 확인해서 함께 분석 합니다. 
	아무입력안했을 때 : request_result.jsp?msg=&num1=&num2=
	입력한 내용 : request_result.jsp?msg=이제부터입니다.~&num1=23&num2=45
	msg,num1,num2 를 요청 파라미터라고 한다.
-->
<!-- request_parameter.jsp 사용자 입력이 처리되는 페이지 : 예를들면 db저장/조회,비지니스로직 처리   -->
<!-- 이번예제에서는 출력만 해봅시다. -->

<%
	String msg = request.getParameter("msg");  //request객체의 파라미터값 가져오기
	//파라미터 num1,num2 은 정수로 변환해서 저장합시다.
	int num1 = 0;  //Integer.parseInt(request.getParameter("num1"));
	int num2 = 0;  //Integer.parseInt(request.getParameter("num2"));
	
	try{
		num1=Integer.parseInt(request.getParameter("num1"));
		num2=Integer.parseInt(request.getParameter("num2"));
	}catch(NumberFormatException e){
		//자바스크립트 alert 을 jsp의 out 객체로 처리해봅니다.
		out.print("<script>");
		out.print("alert('정수는 숫자만 입력하세요.');");
		out.print("history.back();");   //자바스크립트에서 이전페이지로 이동(history는 기록)
		out.print("</script>");
	}
%>
<h3>request_parameter.jsp 입력값 출력</h3>
테스트 메시지 : <%= msg %>  <br>
2개 정수 곱셈 결과 : num1= <%=num1 %>, num2=<%=num2 %> , num1*num2= <%=num1*num2 %> <br>
</body>
</html>





