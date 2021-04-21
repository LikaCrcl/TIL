<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제 #3 request 연습.</title>

</head>
<body>
<%
	//request 객체에 문자인코딩 저장
	request.setCharacterEncoding("UTF-8");
%>
<h2>request 객체에 저장된 정보 확인하기</h2>
<hr>
<p>브라우저 url ? http://localhost:8083/day4_jsp/request_test.jsp</p>
<!--  
		http://127.0.0.1:8083/day4_jsp/request_test.jsp
		http://192.168.2.254:8083/day4_jsp/request_test.jsp
		www.oracle.com 도메인 주소
-->
<hr>
문자 인코딩 형식 : <%= request.getCharacterEncoding() %><br>
브라우저의 요청 url : <%= request.getRequestURL() %><br>
<!-- port : 서비스를 요청하고 다시 응답을 받기 위해 필요한 길(비유) -->
서비스요청포트(서버) : <%=request.getLocalPort() %><br>  <!-- 위 url 서비스 요청의 목적지 포트 -->
서비스요청포트(사용자) : <%=request.getRemotePort() %><br> 
<!--서버에서 응답을 전해줄 사용자의 포트. 실행할때 즉각적으로 결정되는 변동값.  -->
서버 IP(ipv4) : <%= request.getLocalAddr() %><br> 
<!-- 결과 : 0:0:0:0:0:0:0:1 (ipv6) 127.0.0.1(ipv4) 는 localhost의 ip. 
		   localhost 컴퓨터의 실제 ip 인  192.168.2.254 로도 실행된다.(ipconfig로 각자 확인합니다.)
	 실습중인 서버는 ip가 현재 사용중인 로컬컴퓨터이고 그것을 localhost라고 부른다. -->
클라이언트 IP(ipv4) : <%= request.getRemoteAddr() %><br> <!-- 클라이언트도 로컬컴퓨터 ip값. -->
URI: <%= request.getRequestURI() %><br> <!-- 실행결과 : /day4_jsp/request_test.jsp -->
컨텍스트(context) : 프로젝트 이름. <%= request.getContextPath() %><br> <!-- /day4_jsp -->
</body>
</html>
<!-- 출력 IPv4 설정 : Run -> Run Configurations -> tomcat -> Arguments -> VM Arg 에 입력
								-Djava.net.preferIPv4Stack=true -->





