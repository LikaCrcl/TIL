package com;

public class House {
	
	House () {
		System.out.println("test"); // default 생성자
	}
	
	House (String print) {
		System.out.println(print); // 설정해준 생성자 값
	}
	
	public House (int house_size, int house_room, int house_toilet, String house_gagu, String house_elec, String house_host) {
		
		this.house_size = house_size;
		this.house_room = house_room;
		this.house_toilet = house_toilet;
		this.house_gagu = house_gagu;
		this.house_elec = house_elec;
		this.house_host = house_host;
		// this는 변수가 올 자리를 표시해주는 느낌이라고 보면 될듯. Day파일에서 class 변수를 inho_1으로 설정해줬기 때문에 this는 inho_1로 치환되는 느낌?
		// 풀어 써 보자면 inho_1.house_size = house_size; 가 되는 모양새임.
		// 색을 보면 알 수 있지만 this 뒤의 변수는 이 클래스의 전역변수이고 = 뒤의 변수는 () 안의 내가 입력해줄 생성자임
		
	}
	
	int house_size;
	int house_room;
	int house_toilet;
	String house_gagu;
	String house_elec;
	String house_host;

}
