package com;

public class Day_0217 {

	public static void main(String[] args) {
		
		// switch문 (sw까지 쓰고 Ctrl+Space 누르면 기본형 자동완성)
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
		System.out.println("머지 왜안됨 시발");
		
		
	}
	
	static void switch_test() { // 위의 콜백함수 main (지금 이 switch_test는 커스텀함수)이 너무 더러워졌고 코드는 남겨놔야 한다던가 하는 상황에 이렇게 따로 함수를 파서 놔둬도 ㄱㅊ
		
		int num = 0;
		
		switch (num) {
		case 0:
			
			break;

		default:
			break;
		}
	}

}
