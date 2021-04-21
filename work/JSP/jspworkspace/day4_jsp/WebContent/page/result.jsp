<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result 페이지</title>
</head>
<body>
<h3>Result</h3>
페이지가 result.jsp로 바뀌었는데, url을 보세요<br>
pageContext.forward('result.jsp') : http://localhost:8083/day4_jsp/page/pagecontext.jsp <br>
response.sendRedirect('result.jsp') : http://localhost:8083/day4_jsp/page/result.jsp <br>
2가지 실행결과가 차이점이 있음.
</body>
</html>