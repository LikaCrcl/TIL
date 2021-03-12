// 볼진 모르겠지만 혹시 다시 이 파일을 열어봐야하는 일이 생기면 패키지 안의 파일 전부 다 열어두고 볼 것

package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class SetClass implements Comparator<SetClass>{ // implements도 앞이 뒤를 상속받게 해주는 앤데 extends와 다르게 Class를 구현해줘야 함.
	
	// 접근제한자 private, protected, public, default
	// private > default > protected > public 순으로 강한 보안
	public SetClass() {
	}
	
//	private int num; // private는 이 SetClass 안에서만 사용할 수 있게 함 (외부에서 접근 절대 불가)
	int num;
	String name;
	
	SetClass(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	// 아래는 Comparator<SetClass> 를 완성시키기 위해 필요한 부분
	public int compare(SetClass o1, SetClass o2) {
		// TODO Auto-generated method stub
		return o2.num - o1.num;
	}
	// 이 아래는 implements 다음에 Parent 가 올 때 완성시키기 위해 필요한 부분
//	@Override
//	public int toCount() {
//		return 0;
//	}
//	
//	@Override
//	public int toNumber() {
//		return 0;
//	}

}

public class Day_0312_a extends SetClass { // (Class) extends (Class) : 앞 class가 뒤의 class를 상속받게 해줌 (뒤가 부모, 앞이 자식 이라고 생각하면 될듯)

	public static void main(String[] args) {
		
		// 객체 복습. 생성자 디폴트값과 설정 값
		House inho = new House(); // () 안에 아무것도 안쓰면 디폴트값 출력
		House inho2 = new House("inho");
		House john = new House("john"); // 클래스 파일에서 (String print) 로 설정해줬으므로 () 안에 입력한 String값의 생성자 출력
		
		// this
//		House inho_1 = new House(22, 2, 1, "레이디", "Made in China");
//		System.out.println(inho_1.house_elec);
		
		// 배열에서 표현해보기
		int max = 3;
		int[] total_house_size = {24, 28, 32};
		int[] total_house_room = {2, 3, 4};
		int[] total_house_toilet = {1, 2, 3};
		String[] total_house_gagu = {"IKEA", "AA Furniture", "AKRACING"};
		String[] total_house_elec = {"made in germany", "made in china", "made in korea"};
		String[] total_name = {"myHouse", "inho2", "john"};
		String[] host = total_name;
		
		ArrayList<House> total_house_list = new ArrayList<House>();
		HashMap<String, House> total_house = new HashMap<>();
		
		for (int i = 0; i < max; i++) {
			House test = new House(total_house_size[i], total_house_room[i], total_house_toilet[i], total_house_gagu[i], total_house_elec[i], host[i]);
			total_house_list.add(test);
			total_house.put(total_name[i], test);
		}
		
		System.out.println(total_house.keySet());
		
		for (String i : total_house.keySet()) {
			House h = total_house.get(i);
			System.out.println("집주인 : "+h.house_host);
			System.out.println("평수 : "+h.house_size);
			System.out.println("방 갯수 : "+h.house_room);
			System.out.println("화장실 갯수 : "+h.house_toilet);
			System.out.println("가구 제조사 : "+h.house_gagu);
			System.out.println("전자기기 제조국 : "+h.house_elec);
			System.out.println();
		}
		
//		System.out.println(A.num;); // 위에서 num을 private로 설정해줬으므로 사용할 수 없음.
		
//		name = "asdf"; // extends SetClass 를 해줬기 때문에 name에 접근 가능해짐.
		
		// TreeSet 정렬 규칙 만들어주기
		Set<SetClass> tree = new TreeSet<SetClass>(); // Set import 해주고 이런식으로도 쓸 수 있는듯
		
		for (int i = 0; i < max; i++) {
			SetClass a = new SetClass(total_house_size[i], total_house_gagu[i]);
			tree.add(a); // add가 안되는데 왜 안되는지 모르겠음
		}
		
//		for (SetClass i : tree) {
//			System.out.println(i.name);
//			System.out.println(i.num);
//		}
				
	}

}
