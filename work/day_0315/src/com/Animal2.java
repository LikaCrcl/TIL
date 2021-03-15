package com;

public class Animal2 {
	
	public Animal2() {
		
	}
	
	// 우클릭 - source - constructor using fields 로 만든 메소드
	// 커서위치 기준으로 만들어짐
	public Animal2(String name, int age, String gender, double speed, String type, double weight) {
		super();
		this.name	= name;
		this.age	= age;
		this.gender = gender;
		this.speed 	= speed;
		this.type 	= type;
		this.weight = weight;
	}

	String	name;
	int 	age;
	String gender;
	double 	speed;
	String 	type;
	double 	weight;

}
