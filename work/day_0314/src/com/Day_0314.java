package com;

public class Day_0314 {
	
	static int a;

	public static void main(String[] args) {
		
		// 스터디카페 와서 공부한거 정리
		// method : 함수. (ex. public static void asdf() { 라고 만들었다 가정하면 asdf 부분이 메소드인 것)
		
		test();
		System.out.println(test2(1));
		
		// 접근제한자
		// public : 전체 공개, protected : 동일 패키지 이내, 상속받은 클래스 까지 허용, default : 동일 패키지 이내만 허용, private : 해당 클래스 내에서만 허용
	}
	
	// 급 궁금해진 void : return값이 없음을 의미한다는데
	static void test() {
		System.out.println("ㅎㅇ"); // 로 출력되는 값과
	}
	
	static int test2(int n) {
		return n; // 에서 출력되는건 다른것인가? 왜 출력안되지 시발?
		// return은 애초에 print라는 명령과 다르고 test2()라는 메소드를 하나의 변수로 보고 그 변수에 대입해주는 느낌.
		// 해서 test2(1)을 '출력'하기 위해서는 그냥 test2(1); 을 쓸게 아니고 syso로 출력해줘야 한다.
	}

}
