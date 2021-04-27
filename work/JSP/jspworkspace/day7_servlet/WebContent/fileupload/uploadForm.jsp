<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
<style type="text/css">
	table {
		border-collapse: collapse;
	}
	td {
		border: 1px solid gray;
	}
	input {
		padding: 4px;
		margin: 4px;
	}
</style>
</head>
<body>
<form action="upload.jsp" method="post" enctype="multipart/form-data">
<table>
	<tr>
		<td>작성자</td><td><input type="text" name="writer"></td>
	</tr>
	<tr>
		<td>파일선택</td>
		<td>이미지 파일 : <input type="file" name="img1" accept="image/*"></td>
		<!-- accept 속성 : 선택할 파일 형식 제한 -->
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="전송"></td>
	</tr>
</table>
</form>
</body>
</html>