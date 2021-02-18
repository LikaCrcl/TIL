package com;

import java.util.Iterator;

public class Day_0217 {
	
	static int num_2;

	public static void main(String[] args) {
		
		// 조건문 switch (sw까지 쓰고 Ctrl+Space 누르면 기본형 자동완성)
//		switch (key) {
//			case value:
//				
//				break;   기본형
//	
//			default:
//				break;
//		}
		int num = 3;
		int sum = 0;
		
		switch (num) {
		case 0:
			sum += 0;
//			break;
		case 1:
			sum += 1;
//			break;
		case 2:
			sum += 2;
//			break;
		case 3:
			sum += 3;
//			break;
		case 4:
			sum += 4;
//			break;
		case 5:
			sum += 5;
//			break;
//		default:
//			break;
		}
		
		System.out.println("합산 : "+sum); // num = 3일 때 12가 나옴. break; 가 없어서 case 3 포함 그 아래로 전부 계산하기 때문.
		
		// 0~10 짝수 합산, 홀수 합산 과제
		int a = 0, b = 0, c = 0;
		
		switch (a) {
		
		case 0:
			b += 0;
		case 1:
			c += 1;
		case 2:
			b += 2;
		case 3:
			c += 3;
		case 4:
			b += 4;
		case 5:
			c += 5;
		case 6:
			b += 6;
		case 7:
			c += 7;
		case 8:
			b += 8;
		case 9:
			c += 9;
		case 10:
			b += 10;

		}
		
		System.out.println("짝수 합산 : "+b+" 홀수 합산 : "+c);
		
		int num_1 = 1; // 지역변수 : 함수 안에서 선언되는 변수. = 0 같이 값을 정해줘야(초기화해줘야)함
		System.out.println("지역변수 : "+num_1);
		
		System.out.println("전역변수 : "+num_2); // 0
		// 전역변수 : 함수 밖에서 (이 경우 맨 위쪽 public class 아래에서 선언) 선언된 변수. 초기화해주지 않아도 오류나지 않음."
		// 한 지역 내에서 같은 이름의 변수는 사용할 수 없지만(ex int a;, int a; X) 서로 다른 지역에서 같은 이름의 변수는 사용할 수 있음.
		
		// 만약 이걸 다시보게된다면 여기서 맨 아래쪽 test함수로 갔다가 다시 올 것
		
		int num_2 = 1;
		System.out.println("지역변수 : "+num_2); // 1
		
		if (test(1)) { // 1의 의미는 test 함수의 매개변수에 1을 대입한 것. test 함수에서 n이 0이 아니면 true이므로 이 if문의 결과는 true
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		// 어제 배운 math 함수 이용하여 랜덤하게 0 또는 1이 나오게 하기 예제.
		int num3 = (int) (Math.random()*100);
		
		if (test(num3)) { // test 함수를 boolean으로 선언했기 때문에 등식으로 나타내지 않아도 됨
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
		
		// switch문 안에 if문을 넣는다던가 하는 것도 가능
		
		// switch에서 default
		int n = 6;
		switch (n) {
		case 0:
			System.out.println(n);
			break;
		case 1:
			System.out.println(n);				// case에 전부 해당하지 않을 때 default로 보내져 그 값을 출력하게 됨. 따라서 default : 6 출력
			break;
		case 2:
			System.out.println(n);
			break;
		default:
			System.out.println("default : "+n);
			break;
		}
		
		
		// 반복문 for. for 치고 Ctrl+Space 하면 기본형 나옴
		// for (초기화; 조건; 증감) {}
		// 가운데 조건이 true일 때 들어와서 출력되고, 조건이 false라면 들어오지 않고 무시함. || && if 등과 유사
		// 조건이 false가 되는 순간부터 반복을 멈추고 for문은 끝남. (false 출력 x)
		for (int i = 8; i < 10; i++) {
			System.out.println(i);
			System.out.println(10 < 10);
		}
		
		// for문에서 마지막 false까지 출력하기 예제
		for (int i = 8; i < 10; i++) {
			System.out.println(i +" : "+(i < 10));
			if (i == 9) {
				System.out.println("10 : "+(10 < 10));
			}
		}
		
		// for문 첫번째만 false, 나머지 true 출력 예제
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				System.out.println(i+" : false");
			}
			else {
				System.out.println(i+" : "+(i < 3));
			}
		}
		
		System.out.println("git test");
		
	}
	
	static boolean test(int n) { // 여기서 int n 부분은 매개변수. 매개변수도 지역변수의 일종
		// static 'void' ~~ 같은 형태의 함수는(void로 쓰는 함수) return이 없어도 되지만 그 외의 경우(ex String, boolean 등)에는 return이 있어야 함. 
		if (n % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static void switch_test() { // 위의 콜백함수 main (지금 이 switch_test는 커스텀함수)이 너무 더러워졌고 코드는 남겨놔야 한다던가 하는 상황에 이렇게 따로 함수를 파서 놔둬도 ㄱㅊ
		// 이 커스텀함수를 다른 곳에서 불러오려 하는 경우, 부를 곳에 static이 있는지 없는지 확인해야함. 거기에 static이 있다면 여기에도 static을 써줘야 함
		// 저 밑에 나타냈는데 부를 곳에 static이 없다면 불려지논 함수는 static이 있어도 되고 없어도 ㄱㅊ
		
		int num = 0;
		
		switch (num) {
		case 0:
			
			break;

		default:
			break;
		}
	}
	
	void test2() {
		switch_test();
	}
	
//	static void test3() {
//		test2(); 는 안됨
//	}

}
