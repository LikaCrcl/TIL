package com;

public class Animal2 {
	
	public Animal2() {
		
	}
	
	// ��Ŭ�� - source - constructor using fields �� ���� �޼ҵ�
	// Ŀ����ġ �������� �������
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
