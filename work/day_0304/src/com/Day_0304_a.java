package com;

import java.util.ArrayList;

public class Day_0304_a {

	public static void main(String[] args) {
		
		// ArrayList 보충
		java.util.ArrayList<Integer> arr = new java.util.ArrayList<Integer>(); // import 안하고 이렇게 써도 문제 없음.
		arr.add(100);
		System.out.println("integer remove(0) : "+arr.remove(0)); // Integer list에선 remove(x) 를 하면 x번째에 있는 지워질 value를 출력해줌
		
		ArrayList<String> list_string = new ArrayList<String>();
		list_string.add("hello");
		System.out.println("string remove \"hello\" : "+list_string.remove("hello")); // String list에서는 지울 value를 직접 써넣으면 boolean의 형식으로 출력됨.
		// remove 정상 실행 된다면 true, 일치하는 value가 없어 remove를 실행할 수 없으면 false 출력됨
		list_string.add("nimi");
		System.out.println("string remove(0) : "+list_string.remove(0)); // index로 remove 하면 해당 index의 value를 보여줌 
		
		System.out.println();
		
		list_string.add("hello");
		list_string.add(null);
		list_string.add("hello");
		System.out.println("before remove hello : "+list_string); // hello, null, hello
		list_string.remove("hello");
		System.out.println("after remove hello : "+list_string); // null, hello 출력. 중복되는 value가 있다면 제일 앞의 것부터 remove됨
		
		// XXX.contains("String"); = true / false
		System.out.println("list_string.contains(\"hello\") : "+list_string.contains("hello")); // XXX 라는 ArrayList에서 "String"이 있는지 없는지 알아내는 함수.
		
		// cf) equals
		System.out.println("list_string.equals(\"hello\") : "+list_string.equals("hello")); // false
		
		ArrayList<String> list_string2 = new ArrayList<String>();
		list_string2.add(null);
		list_string2.add("hello");
		System.out.println("list_string.equals(list_string2) : "+list_string.equals(list_string2)); // true
		// list 내부의 value가 완전히 일치해야 true 반환됨. contains와는 다름
		// String 비교에서와 마찬가지로 == 로 비교하면 주소, equals로 비교하면 value를 비교함
		
		System.out.println();
		// 간단 과제
		ArrayList<String> test = new ArrayList<String>();
		test.add("world");
		test.add("hello");
		test.add("world");
		test.add("test");
		
		ArrayList<String> test2 = new ArrayList<String>();
		test2.add("hello");
		
		System.out.println("test.contains(test2) before : "+test.contains(test2)); // false
		
		System.out.println("test.contains(test2) after : "+test.contains(test2.get(0))); // true
		// contains 뒤에 list를 넣으면 복잡하게 비교하는듯. value를 넣어줘야 원하는 값이 나옴
		
		System.out.println();
		// 구구단
		// 옛날에 했던거 다시해보기
		int[][] array_2 = new int[8][9];
		
		for (int i = 0; i < array_2.length; i++) {
			for (int j = 0; j < array_2[i].length; j++) {
				array_2[i][j] = (i+2)*(j+1);
			}
		}
		
		for (int i = 0; i < array_2.length; i++) {
			for (int j = 0; j < array_2[i].length; j++) {
//				System.out.println((i+2)+"*"+(j+1)+"="+array_2[i][j]);
			}
		}
		
		// ArrayList로 해보기
		ArrayList<Integer> gugudan = new ArrayList<Integer>();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				gugudan.add((i+2)*(j+1));
			}
		}
		
		int num = 0;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.println((i+2)+"*"+(j+1)+"="+gugudan.get(num++));
			}
		}
		
	}

}
