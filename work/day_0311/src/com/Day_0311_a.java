package com;

import java.util.ArrayList;
import java.util.HashSet;

public class Day_0311_a {

	public static void main(String[] args) {
		
		// 객체 ?
		Start test = new Start();
		test.name = "pc_";
		test.number = 0;
		test.size = 27;
		test.power = true; // (변수). 을 입력하면 저 밑에 생성해둔 class 안의 멤버 변수에 접근할 수 있음
		
		// for문 돌려서 Start(type)객체 30개를 만들고 멤버변수에 각각 해당한 내용 기재하기 예제
		// name pc_0~29, number 0~29, size 27, power true
		Start pc;
		int max = 30;
		int[] c = new int[max];
		String[] names = new String[max];
		ArrayList<Integer> list_int = new ArrayList<Integer>();
		HashSet<Integer> set_int = new HashSet<Integer>();
		Start[] array_start = new Start[max];
		ArrayList<Start> list_start = new ArrayList<Start>();
		
		for (int i = 0; i < 30; i++) {
			pc = new Start();
			pc.name = "pc_"+i;
			pc.number = i;
			pc.size = 27;
			pc.power = true;
			
//			System.out.println("name : "+pc.name);
//			System.out.println("number : "+pc.number);
//			System.out.println("size : "+pc.size);
//			System.out.println("power : "+pc.power);
//			System.out.println();
			
			// 배열로 나타내기
			c[i] = pc.number;
			list_int.add(pc.size);
			names[i] = pc.name;

//			System.out.println("number : "+c[i]);
//			System.out.println("size : "+list_int.get(i));
//			System.out.println("name : "+names[i]);
//			System.out.println();
			
			// 객체로 나타내기 (출력은 아래에)
			array_start[i] = pc;
			
			// 객체 List로 나타내기 (출력 아래에)
			list_start.add(pc);
		}
		
		for (int i = 0; i < array_start.length; i++) {
//			System.out.println("name : "+array_start[i].name);
//			System.out.println("number : "+array_start[i].number);
//			System.out.println("size : "+array_start[i].size);
//			System.out.println("power : "+array_start[i].power);
//			System.out.println();
			
			Start z = list_start.get(i); // 이렇게 간소화? 하는게 좋음
			
			System.out.println("name : "+z.name);
			System.out.println("number : "+z.number);
			System.out.println("size : "+z.size);
			System.out.println("power : "+z.power);
			System.out.println();
		}
		
	}

}

class Start {
	
	public Start() { // void 등의 타입? 없이 class 이름과 똑같이 온 것에 주목. 여기서 Start() 가 생성자.
		
		System.out.print(""); // syso 없으면 run이 안됨.
		
	}
	
	String name;
	int size;
	boolean power;
	int number; // 얘들은 멤버변수라고 한다고 함
	
}
