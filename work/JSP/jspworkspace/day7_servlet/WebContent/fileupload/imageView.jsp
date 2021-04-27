<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 확인하기</title>
</head>
<body>
<h4>1. WebContent의 이미지 표시하기</h4>
<!-- <img src="../i015333897561.gif" width="400px;"> --> <!-- servlet으로 url mapping은 적절한 방식이 아님. 정적 리소스를 위한 별도 경로 필요 -->
<h4>2. WebContent/img 폴더의 이미지 표시하기</h4>
<!-- <img src="../img/i015388316300.gif"> -->
<h4>3. WebContent/fileupload 폴더의 이미지 표시하기</h4>
<!-- <img src="1.jpg"> -->
<h4>이미지 표시</h4>
<img src="/image/1.jpg">
<img src="/image/i015333897561.gif">
<img src="/image/i015388316300.gif">
<h4>4. c:\\upload 폴더의 이미지 표시하기</h4>
서버의 경로 c:\\upload 에 대해 url을 지정해야 함.
<img src="/img_path/2.jpg">
</body>
</html>