<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점심메뉴 투표하기</title>
</head>
<body>
<h4>점심 메뉴 투표하기</h4>
<form action="save.jsp">
	<fieldset> <!-- 여러 입력요소들을 그룹으로 묶는다 -->
		<input type="radio" name="menu" value="삼겹살">삼겹살 <br>
		<input type="radio" name="menu" value="스파게티">스파게티 <br>
		<input type="radio" name="menu" value="김치찌개">김치찌개 <br>
		<input type="radio" name="menu" value="쌀국수">쌀국수 <br>
		<input type="radio" name="menu" value="안먹음">안먹음 <br>
		<br><br>
		<input type="submit" value="투표하기">
		<input type="button" value="결과보기" onclick="location.href='result.jsp;'"> <!-- result.jsp 페이지가 결과보기 -->		
	</fieldset>
	관리자 초기화 : <input type="button" value="실행" onclick="location.href='init.jsp';">
</form>
</body>
</html>