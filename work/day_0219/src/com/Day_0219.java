package com;

import java.util.Scanner;

public class Day_0219 {

	public static void main(String[] args) {
		
		// while문 복습
//		calculator(2);
		
		// 구구단, 변수가 0일때 짝수단, 1일때 홀수단, 2일때 전체 출력
//		gugudan(1);
		
		// do while문 : true false 상관 없이 무조건 1번은 실행함. 실행 후 true라면 계속 실행, false라면 더 이상 실행하지 않음
		int count = 0;
		do {
			System.out.println("do");
		}
		while (false);
		
		do {
			count++;
			System.out.println("do : "+count);
			if (count == 9)
				break;
		}
		while (true);
		
		// 0이하 or 100 이상 입력하면 끝나는 do while문
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 입력");
		
		do {
			int num = input.nextInt();
			System.out.println("test "+num);
			if (num <= 0 || num > 99)
				break;
			System.out.println("재 입력");
		}
		while (true);
		System.out.println("테스트 끝");
		
		

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
