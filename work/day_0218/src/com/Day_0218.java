package com;

public class Day_0218 {

	public static void main(String[] args) {
		
		// 상수 누락된게 있는데 상수 선언할 때 변수는 대문자로만 써야함
		// ex) final int NUM = 1;
		// 어제 switch에서 배운 default 보충
		// default는 if에서의 else와 비슷한 특성을 가지고 있음. (모두 false면 출력함)
		// 어제 전역, 지역, 매개변수 보충
		// 전역 : class 바로 안에서 선언한 것
		// 지역 : class 안의 method 안에서 선언한 것
		// 매개 : method 선언 때 () 안에 선언한 것 ex) for (int i, i < 0, i++) 에서의 i 등
		
		// switch 보충
		int key_v = 0; 
		switch (key_v) {
		case 1-1: // case에 연산자가 올 수도 있다.
			
			break;

		default:
			break;
		}
		
		// for문과 method를 이용한 간단한 계산기
//		calculator(10);
		
		// 구구단 2단~9단 출력 예제
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println((i+"*"+j+"="+(i*j)));
//			}
//		}
		
		// method 이용 구구단 출력 예제
		for (int i = 2; i < 10; i++) {
				calculator(i);
		}
		
		// swap 이용 x에 60, y에 30 넣기
		int x = 30;
		int y = 60;
		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x : "+x+" y : "+y);
		
	}
	
	static void calculator(int n) {
		int number = n;
		for (int i = 1; i < 10; i++) {
			System.out.println(number+"*"+i+"="+number*i);
		}
	}

}
