package com;

import java.util.Scanner;

public class Day_0219_a {

	public static void main(String[] args) {
		
		// while문 복습
//		calculator(2);
		
		// 구구단, 변수가 0일때 짝수단, 1일때 홀수단, 2일때 전체 출력
//		gugudan(1);
		
		// do while문 : true false 상관 없이 무조건 1번은 실행함. 실행 후 true라면 계속 실행, false라면 더 이상 실행하지 않음
//		int count = 0;
//		do {
//			System.out.println("do");
//		}
//		while (false);
//		
//		do {
//			count++;
//			System.out.println("do : "+count);
//			if (count == 9)
//				break;
//		}
//		while (true);
//		
//		// 0이하 or 100 이상 입력하면 끝나는 do while문
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자 입력");
//		
//		do {
//			int num = input.nextInt();
//			System.out.println("test "+num);
//			if (num <= 0 || num > 99)
//				break;
//			System.out.println("재 입력");
//		}
//		while (true);
//		System.out.println("테스트 끝");
		
		// innerMax
//		
//		int max = 1;
//		while (max < 10) {
//			max++;
//			int innerMax = 10;
//			while (innerMax > 0) {
//				if (innerMax < max) {
//					System.out.print("*");
//				}
//				else {
//					System.out.println(" ");
//				}
//				innerMax--;
//			}
//		}
//		
//		System.out.println();
		
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				if (i < j) {
//					System.out.print("/");
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		// 이등변삼각형 피라미드 만들기
		for (int i = 1; i < 10; i++) {
			
			for (int j = 0; j < 10-i; j++) {
				System.out.print("a");
			}
			for (int j = 1; j < i*2; j++) {
				
				System.out.print("*");
			}
			for (int j = 0; j < 10-i; j++) {
				System.out.print("a");
			}
			
			System.out.println("");
		}
		
	}
	
	static void calculator(int n) {
		int count = 1;
		while (count < 10) {
			System.out.println(n+"*"+count+"="+n*count);
			count++;
		}
	}
	
	static void gugudan (int n) {
		int count = 1;
		while (count < 10) {
			count++;
			if (count % 2 == n) {
				calculator(count);
				System.out.println("true : "+count);
			}
			if (n == 2) {
				calculator(count);
				System.out.println("true : "+count);
			}
			if (count == 9)
				break;
		}
	}

}
