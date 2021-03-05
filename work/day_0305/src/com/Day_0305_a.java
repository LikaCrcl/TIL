package com;

import java.util.Scanner;

public class Day_0305_a {

	public static void main(String[] args) {
		
		Cons_test constructors = new Cons_test(); // 생성자
		
		// 다시 한 번 강조하는 String 주소
		String[] arr_str = new String[3];
		
		for (int i = 0; i < arr_str.length; i++) {
			arr_str[i] = "hello";
		}
		
		arr_str[0] = new String("hello");
		
		if (arr_str[0].equals(arr_str[1]) && arr_str[1] == arr_str[2])
			System.out.println("모두 주소가 같음");
		
		if (arr_str[0] == arr_str[1])
			System.out.println("before arr_str[0] == arr_str[1]"); // arr_str[0]에 new를 써서 강제로 새로운 주소에 할당해줬으므로 주소가 다르고,
		
		arr_str[0] = "hello"; // new를 쓰지 않고 value만 같게 선언하면 
		
		if (arr_str[0] == arr_str[1])
			System.out.println("after arr_str[0] == arr_str[1]"); // 주소도 같아져서 해당 줄 출력됨
		
		// 난수 2차 배열 만들기 예제 ( a_s_2[0][7], a_s_2[1][20] '효율적으로' 만들기)
		String[][] a_s_2 = new String[2][];
		
//		for (int i = 0; i < a_s_2.length; i++) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println(i+"번째 배열 크기 입력");
//			int a = sc.nextInt();
//			a_s_2[i] = new String[a];
//		}
//		
//		System.out.println("a_s_2[0].length : "+a_s_2[0].length);
//		System.out.println("a_s_2[1].length : "+a_s_2[1].length);
		// 까지 scanner를 쓰는 방법 생각해봄
		// 2차배열을 써야된다는 말에 힌트를 얻어서 생각해본 답
		int[] index = {7, 20, 90, 50, 340};
		
//		for (int i = 0; i < a_s_2.length; i++) {
//			a_s_2[i] = new String[index[i]];
//			System.out.println("a_s_2["+i+"].length : "+a_s_2[i].length);
//		}
		
		a_s_2 = new String[index.length][];
		for (int i = 0; i < a_s_2.length; i++) {
			a_s_2[i] = new String[index[i]];
			System.out.println("a_s_2["+i+"].length : "+a_s_2[i].length);
		}

	}
	
}
