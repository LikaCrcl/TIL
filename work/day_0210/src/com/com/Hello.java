package com.com; // com 폴더 안에 com 폴더 하나 더 만들어줌(Package Explorer 확인)
// 이클립스 화면 좌측 Package Explorer 우측 상단 점 세개 클릭 후 Package Presentation 옵션 바꾸면
// 패키지 익스플로러 보기 방식 변경 가능

public class Hello {

	public static void main(String[] args) {
		
		System.out.println(); // syso 치고 Ctrl + Space
		System.out.println(3+3); // +, -, *, / <- 연산자
		System.out.println(3-3);
		System.out.println(3*3);
		System.out.println(3/3); // 결과 보기(Run) 하고싶으면 위 초록 재생버튼 클릭 or Ctrl + F11
		// 산술연산자 : + - * / 등
		// 대입연산자 : =
		// 논리연산자 : >, <, >=, <=, != (비교연산자. ?)
		// 관계연산자 : &&, ||, &|
		
		int num_0 = 3; // 여기서 num_0과 num_1은 변수(Variable).
		int num_1 = 3;
		
		System.out.println(num_0+num_1);
		
		num_0 = 6; // 변수는 언제든 바뀔 수 있음
		
		System.out.println(num_0+num_1);
		
		final int COUNT_NUM = 300; // COUNT_NUM 은 앞에 final로 인해 상수로 선언됨. 상수는 대문자로만 써야함(개발자 간의 약속)
		// 이 이후로 COUNT_NUM = 200; 은 할 수 없음
		
		System.out.println("10%2 : " + 10%2); // % : 나머지 연산자(산술 연산자에 포함됨). 앞을 뒤로 나누고 난 나머지를 표시해줌
		
		// 증감연산자 : ++, -- <- 변수에 1을 더하거나 빼고 그 상태로 유지. ex) n=1; n++=2; n=2; 
		// 연산자가 앞에 오면 전위, 뒤에 오면 후위. ex) ++m : 전위
		int m = 3;
		int n = m++; // 이 때 m은 4가 됐지만 후위로 오는 경우엔 m을 n에 먼저 대입하고 증감이 이루어짐
		int l = ++m; // 4가 됐던 m은 다시 5가 됐고 연산자가 전위로 와서 증감 시킨 후 대입되기 때문에 l은 5가 됨
		
		System.out.println("n : " + n);
		System.out.println("l : " + l);
		
		
	}

}
