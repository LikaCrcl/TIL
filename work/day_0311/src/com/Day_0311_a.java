package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

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
		Start[] array_start = new Start[max];
		ArrayList<Start> list_start = new ArrayList<Start>();
		
		for (int i = 0; i < max; i++) {
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
			// 객체배열출력
//			System.out.println("name : "+array_start[i].name);
//			System.out.println("number : "+array_start[i].number);
//			System.out.println("size : "+array_start[i].size);
//			System.out.println("power : "+array_start[i].power);
//			System.out.println();
			
			// 객체List출력
			Start z = list_start.get(i); // 이렇게 간소화? 하는게 좋음
			
//			System.out.println("name : "+z.name);
//			System.out.println("number : "+z.number);
//			System.out.println("size : "+z.size);
//			System.out.println("power : "+z.power);
//			System.out.println();
		}
		
		// set(HashSet, LinkedHashSet, TreeSet)
		HashSet<Integer> set_int = new HashSet<Integer>();
		
		set_int.add(100);
		set_int.add(100);
		set_int.add(100);
		set_int.add(100);
		
		System.out.println("set_int.size before : "+set_int.size()); // 1 출력. 중복 허용 X
		
		set_int.add(200);
		set_int.add(400);
		set_int.add(5940);
		
		System.out.println("set_int.size after : "+set_int.size()); // 다른 값 add했으므로 2
		
		// Set 들은 get을 사용할 수 없어서 for each문으로 출력해야함		
		for(int i : set_int) {
			System.out.println("for each HashSet : "+i); // 400, 100, 5940, 200 순으로 나옴. HashSet은 add 해주면 순서대로 입력되는 것이 아니고 랜덤으로 입력되어 정확한 순서를 알 수 없음(get을 할 수 없음)
		}
		
		LinkedHashSet<Integer> link_int = new LinkedHashSet<Integer>();
		
		link_int.add(100);
		link_int.add(100);
		link_int.add(100);
		link_int.add(100);
		
		System.out.println("link_int size : "+link_int.size()); // 1 출력. 여전히 중복 X
		
		link_int.add(200);
		link_int.add(300);
		link_int.add(124089);
		link_int.add(5823);
		link_int.add(235);
		link_int.add(652);
		link_int.add(346);
				
		for (int i : link_int) {
			System.out.println("for each LinkedHashSet : "+i);
		}
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("aaa");
		treeSet.add("ccc");
		treeSet.add("가");
		treeSet.add("ee");
		treeSet.add("다");
		treeSet.add("b");
		treeSet.add("나");
		treeSet.add("ddd");
		treeSet.add("hhh");
		
		for (String i : treeSet) {
			System.out.println(i); // TreeSet은 입력값들을 자연적 순서대로 정렬해줌.
		}
		
		HashSet<Start> hash_start = new HashSet<Start>();
		LinkedHashSet<Start> link_start = new LinkedHashSet<Start>();
		TreeSet<Start> tree_start = new TreeSet<Start>();
		
		for (int i = 0; i < max; i++) {
			// 위로 가기 애매해서 여기서 다시 씀
			pc = new Start();
			
			pc.name = "pc_"+i;
			pc.number = i;
			pc.size = 27;
			pc.power = true;
			// 다시 HashSet으로 pc 출력해보기 예제
			hash_start.add(pc);
			
			// LinkedHashSet
			link_start.add(pc);
		}
		
		for (Start i : hash_start) {
//			System.out.println("name : "+i.name);
//			System.out.println("number : "+i.number);
//			System.out.println("size : "+i.size);
//			System.out.println("power : "+i.power);
//			System.out.println();
		}
		
		for (Start i : link_start) {
			System.out.println("name : "+i.name);
			System.out.println("number : "+i.number);
			System.out.println("size : "+i.size);
			System.out.println("power : "+i.power);
			System.out.println();
		}
		
		// 궁금해서 실험좀 해봤는데 max값이 늘어나서 새로운 값이 추가되면 전체 순서가 다 바뀌는건 아니고 랜덤으로 배정된 그 배열은 놔두고 배열 사이 어딘가로 낑김
		
		// Map ( HashMap<(Key), (Value)> )
		HashMap<Integer, String> map_hash = new HashMap<Integer, String>();
		
		map_hash.put(100, "hi");
		map_hash.put(200, "hi"); // key 값은 중복 불허용. value는 중복 가능. hash라서 중복 거르는듯
		
		map_hash.put(100, "fuck you"); // 중복 발생 시 마지막에 추가해 준 value 반환
		
		System.out.println("key 100 : "+map_hash.get(100)); // get 안의 key 값에 대한 value 반환
		
		System.out.println("HashMap size : "+map_hash.size()); // 설정해준 key의 갯수가 곧 size
		System.out.println("HashMap keyset : "+map_hash.keySet()); // 배열로 출력됨
		
		for (int i : map_hash.keySet()) {
			System.out.println("key : "+i);
			System.out.println("value : "+map_hash.get(i));
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
