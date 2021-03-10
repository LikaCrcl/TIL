package com;

import java.util.ArrayList;

public class Day_0310_a {

	public static void main(String[] args) {
		
		// 1eX : 10의 X승
		System.out.println("1e2 : "+(int)1e2); // 10의 제곱
		System.out.println("1e4 : "+(int)1e4); // 10의 4승
		
		// for each문
		ArrayList<Integer> list_int = new ArrayList<Integer>();
		
		for (int i = 0; i < 1E2; i++) {
//			list_int.add(i+10);
		}
		
		for(int i : list_int) {
//			System.out.println("for each list_int : "+i); // 자동으로 min~max값까지 모든 값을 보여줌
		}
		
		ArrayList<String> list_string = new ArrayList<String>();
		list_int.add(100);
		list_string.add("100");
		
		list_string.add(list_int.get(0).toString());
		list_int.add(Integer.parseInt(list_string.get(0)));
		
		System.out.println("list_int : "+list_int);
		System.out.println("list_string : "+list_string);
		
		// 2차 ArrayList
		ArrayList<ArrayList<String>> list_string2 = new ArrayList<ArrayList<String>>();
		
		list_string2.add(new ArrayList<String>());
		list_string2.add(list_string); // 2차니까 1차를 add해줄 수 있음
		
		System.out.println("list_string2[0] : "+list_string2.get(0)); // 0번 방의 모든 값 출력
		System.out.println("list_string2[1] : "+list_string2.get(1)); // 1번 방의 ~~
		
		System.out.println("list_string2.size() : "+list_string2.size()); // list_string2에 add한 건 2번이라서 2
		
		System.out.println("list_string2[1][0] : "+list_string2.get(1).get(0)); // 상세 값을 출력하고자 한다면 이렇게
		
		ArrayList<String> list_test = list_string2.get(1); // get(1)은 list_string2[1]을 가져오는 것이고 그 또한 배열이기 때문에 1차에 대입 가능
		
		System.out.println("list_test : "+list_test);
		
	}

}
