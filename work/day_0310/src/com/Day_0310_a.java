package com;

import java.util.ArrayList;
import java.util.LinkedList;

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
		
		System.out.println("list_string2[0] : "+list_string2.get(0)); // 0번 방의 모든 값 출력. 대괄호는 내가 이해하기 쉬울라고 쓴 것이고 정식 표기는 아님
		System.out.println("list_string2[1] : "+list_string2.get(1)); // 1번 방의 ~~
		
		System.out.println("list_string2.size() : "+list_string2.size()); // list_string2에 add한 건 2번이라서 2
		
		System.out.println("list_string2[1][0] : "+list_string2.get(1).get(0)); // 상세 값을 출력하고자 한다면 이렇게
		
		ArrayList<String> list_test = list_string2.get(1); // get(1)은 list_string2[1]을 가져오는 것이고 그 또한 배열이기 때문에 1차에 대입 가능
		
		System.out.println("list_test : "+list_test);
		
		// 2차 ArrayList 이용 구구단 예제
		ArrayList<ArrayList<Integer>> list_gugudan = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> asdf = new ArrayList<Integer>();
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				asdf.add((i+2)*(j+1));
			}
			list_gugudan.add(asdf);
			asdf = new ArrayList<Integer>(); // 이거 안해주면 위 j for문에서 add한 값들이 전부 쌓임. new를 써서 주소를 새로 할당해줘야 했음
		}
		
		for (int i = 0; i < list_gugudan.size(); i++) {
			for (int j = 0; j < list_gugudan.get(i).size(); j++) {
//				System.out.println(list_gugudan.get(i).get(j));
			}
			System.out.println();
		}
		
		// list_gugudan 값들을 다시 꺼내서 2차 String list에 구구단 형식으로 넣기 예제
		ArrayList<ArrayList<String>> list_str = new ArrayList<ArrayList<String>>();
		ArrayList<String> data_gugu = new ArrayList<String>();
		
		for (int i = 0; i < list_gugudan.size(); i++) {
			for (int j = 0; j < list_gugudan.get(i).size(); j++) {
				data_gugu.add((i+2)+"*"+(j+1)+"="+list_gugudan.get(i).get(j));
			}
			list_str.add(data_gugu);
			data_gugu = new ArrayList<String>();
		}
		
		System.out.println(list_str);
		
		// LinkedList
		LinkedList<Integer> list_int_link = new LinkedList<Integer>();
		ArrayList<Integer> list_int_arr = new ArrayList<Integer>();
		
		double start_time = System.currentTimeMillis();
		
		for (int i = 0; i < 1E5; i++) {
//			list_int_link.add(i);
			list_int_arr.add(i);
//			System.out.println(i);
		}
		
		for (int i = 0; i < 1E5; i++) {
//			list_int_link.remove(0);
			list_int_arr.remove(0);
			System.out.println(i);
		}
		
		double end_time = System.currentTimeMillis();
		System.out.println();
		System.out.println(end_time - start_time);
		
		// add 할 때엔 ArrayList가, remove할 땐 LinkedList가 더 빠름. add할 일이 많을 땐 arraylist, remove할 일이 많을 땐 linkedlist를 쓰자
		
	}

}