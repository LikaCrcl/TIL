<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> <!-- HTML 5 -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Layout</title>
<style>
	#header{
		width: 70%;
		height: 100px;
		background-color: #ccc;
		text-align: center;
		margin: auto;
	}
	#section{
		width: 70%;   /* 브라우저의 70% */
		background-color: #ddd;
		text-align: center;
		margin: auto;
	}
	#footer{
		width: 70%;
		height: 100px;
		background-color: #ccc;
		text-align: center;
		margin: auto;
	}
	.container{
		display:inline-block;
		width: 90%;   /*포함된 영역의 90% */
		border: 1px solid green;
		padding: 50px;
		margin: 20px auto;
		box-sizing: border-box; 
		/* 너비 높이 계산에 padding, margin 포함*/
	}
	
	input,select{
		margin-top :10px;
		padding: 8px;
	}
	
	
	
</style>
</head>
<body>
<%
	String file=request.getParameter("file");
	if(file == null) file="main";
%>
<%@ include file="top.jsp"%>
<div id="section">
	
	<jsp:include page='<%=file +".jsp" %>'/>
</div>
<%@ include file="bottom.jsp"%>
</body>
</html>