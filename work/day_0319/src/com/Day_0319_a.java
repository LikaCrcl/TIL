package com;

import com.inter.Table;
import com.service.Animal_service;
import com.service.House_service;
import com.sm.House_sm;

public class Day_0319_a {

	public static void main(String[] args) {
		
		// 상수
		Sangsu sangsu = new Sangsu();
		
		sangsu.num = 300;
		sangsu.score = 300;
		System.out.println("sangsu : "+sangsu.score);
		System.out.println("sangsu num : "+sangsu.num);
		
		Sangsu sangsu2 = new Sangsu();
		System.out.println("sangsu2 : "+sangsu2.score); // sangsu2에서 초기화 안해줬는데도 300 출력
		System.out.println("sangsu2 num : "+sangsu2.num);
		
		sangsu2.score = 600;
		
		System.out.println("sangsu : "+sangsu.score); // sangsu2에서 초기화 시켜줬는데 sangsu에서 출력해도 600 출력됨
		System.out.println("class : "+Sangsu.score); // class에서 직접 출력시켜도 sangsu2에서 초기화한 값 출력
		// 변수들은 new를 통해 참조하는 영역을 바꿀 수 있지만 static을 사용한 상수는 new를 사용하더라도 항상 같은 영역을 참조하고 있기 때문에 위와 같은 결과가 도출됨
		// 따라서 static은 객체로 만들어서 사용해봐야 의미가 없음. 그리고 어디서든 접근 가능해서 편하지만 그만큼 무겁다는 단점 있음. 남발 X
		System.out.println();
		// db service / interface
		House_service house = new House_service();
		// 아래는 출력방법. 세 가지 방법 중 상황에 맞춰 택1
//		house.a();
		
//		for (int i = 0; i < house.GetArrayList().size(); i++) {
//			System.out.println(house.GetArrayList().get(i));
//		}
		
//		for (int i = 0; i < house.GetArray().length; i++) {
//			System.out.println(house.GetArray()[i]);
//		}
		
		// animal로 연습
		// 주소로만 나와서 애먹었는데 sm에서 source에 toString 해줘야함
		Animal_service animal = new Animal_service();
		animal.a();
		
//		for (int i = 0; i < animal.GetArrayList().size(); i++) {
//			System.out.println(animal.GetArrayList().get(i));
//		}
//		
//		for (int i = 0; i < animal.GetArray().length; i++) {
//			System.out.println(animal.GetArray()[i]);
//		}
		System.out.println();		
		// 인터페이스 이용
		Table house_service = new House_service(); // 이렇게 앞에는 인터페이스의 속성을 띄고 뒤에는 직접판 클래스를 대입해줄 수 있는게 인터페이스의 다형성
		print_table(house_service);
		// house_service(animal도 마찬가지)에서 인터페이스를 오버라이드 했기 때문에 아래 print_table에서 .a();를 쓸 수 있음.
//		System.out.println(house_service.GetArrayList().size();); // 가 안되는 이유는 
		// GetArrayList() 메소드를 인터페이스에서 구현해놓은 게 아닌 각각의 service파일에서 독자적으로 구현해뒀기 때문임
				
	}
	
	static void print_table(Table asdf) {
		asdf.a();
	}

}
