package com;

import java.util.Scanner; // java.util.*; 라고 입력 시 java util 내 모든 클래스 불러옴

public class Day_0209a {

	public static void main(String[] args) {
		
		// scanner class
		
		Scanner input = new Scanner(System.in); // new : 연산자. 매우중요
		/*
	 	new 연산자는 램에 새로운 주소를 할당해줌
		같은 클래스라도 new가 여러번 들어오면 서로 다른 주소에 할당됨
		비록 대입한 값이 같더라도 new를 사용하게 되면 다르다고 판단함.

		String name = "name";
		String name2 = "name";
				
		System.out.println(name == name2); -> true ( == 는 비교연산자)
		
		String name = "name";
		String name2 = new String("name");
		
		System.out.println(name == name2); -> false
		*/
		
		System.out.println("숫자만 입력하세요");
		int num = input.nextInt();
		System.out.println("입력이 완료되었습니다.");		
		System.out.println(num);
		
	}

}
