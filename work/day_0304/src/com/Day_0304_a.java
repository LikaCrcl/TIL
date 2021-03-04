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
		
		
	}

}
