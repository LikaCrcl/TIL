<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 회원가입 </title>
<script type="text/javascript">
	function validForm(){
		var frm = document.frmUser;
		var i;
		
		//a.
		if(frm.name.value=="") {
			alert("이름은 필수 입력입니다.");
			frm.name.focus();
			return false;
		}
		
		//b.
		if(frm.pwd.value.length < 8) {
			alert("패스워드는 8글자 이상입니다.");
			frm.pwd.focus();
			return false;
		}
		
		//c.
		if(frm.age.value < 20 || frm.age.value > 70) {
			alert("나이는 20세 이상 70세 미만으로만 가능합니다.");
			frm.age.focus();
			return false;
		}
		
		//d.
		for(i=0;i<frm.hobby.length;i++) {  /* frm.hobby 는 배열. 배열의 크기만큼 반복  */
			//alert(frm.hobby.length);
			if(frm.hobby[i].checked) {  //체크선택된 취미이면 바로 submit 되도록 return true;
				//alert(frm.hobby[i].value);
				return true;
			}	
		}	
		if(i==frm.hobby.length) {
			alert("취미 선택을 안하셨군요!취미 하나 선택해주세요.!");
			//document.getElementById('hobby1').focus();
			frm.hobby[0].focus();
			return false;
		}
		
		
	}
</script>
<link rel="stylesheet" href="mytable.css">
</head>
<body>
<div style="width: 70%; margin: auto;">
		<h3>회원 등록</h3>
		<!-- onsubmit 은 입력값 유효성 검증을 위한 것이다.submit 전에 실행된다. -->
		<form name="frmUser" onsubmit="return validForm()" 
			method="post" action="./join">
			<table style="width: 100%">
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" ></td>
				</tr>
				<tr>
					<th>패스워드</th>
					<td><input type="password" name="pwd"></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<th>나이</th>
					<td><input type="number" name="age" min="10" max="99"
						value="30"></td>
				</tr>
				<tr>
					<th>거주지</th>
					<td><select name="addr">
							<!-- value 속성은 서버에 전달시킬 값 -->
							<option value="서울">서울</option>
							<option value="인천" selected>인천</option>
							<option value="대전">대전</option>
							<option value="광주">광주</option>
							<option value="부산">부산</option>
					</select></td>
				</tr>
				<tr>
					<th>성별</th> 
					<td><input type="radio" value="male" name="gender" id="male">
						<label for="male">남자</label> 
						<!-- 텍스트를 클릭해도 선택이된다. label 태그의 for는 어떤 input과 연결인지 표시
						     태그의 구별은 id속성 값으로 한다. -->
						<input type="radio" value="female" name="gender" checked id="female">
						<label for="female">여자</label>
					</td>
				</tr>
				<tr>
					<th>취미</th> <!--*** name속성은 값을 위한 변수명, id속성은 태그구별을 위한 변수명 -->
					<td>
						<!-- 복수 선택이 가능 --> 
						<input type="checkbox" name="hobby" value="축구" id="hobby1">
						<label for="hobby1">축구</label>
						<input type="checkbox" name="hobby" value="농구" id="hobby2">
						<label for="hobby2">농구</label> 
						<input type="checkbox" name="hobby" value="스키" id="hobby3">
						<label for="hobby3">스키</label>
						<input type="checkbox" name="hobby" value="달리기" id="hobby4">
						<label for="hobby4">달리기</label>
					</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center"><input
						type="submit" value="가입하기"> <input type="reset"
						value="다시쓰기"></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>

<!-- 
		form method 방식
		1) get : default. url 확인했을 때  userInfo.jsp?name=김소희&pwd=121212121&email=koreaitgnj%40koreaedugroup.com&age=30&addr=인천&gender=female&hobby=농구&hobby=달리기
			         주로 조회 에서 사용하는 방식. url에서 ?뒤에 질의(query string) 내용이 포함된다.
				 
				 
		2) post : 사용자 입력값을 request객체의 데이터로 전달하는 방식. 저장할 떄 사용한다.데이터크기 제한이 없음.
				  url 확인하면  ... /userInfo.jsp

 -->


















