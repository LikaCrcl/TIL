package com;

public class Animal {
	
	public Animal() {
		
	}
	
	private int age;
	private String gender;
	
	public Animal(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	// �� �Ʒ��� ���� ���� �ʰ� �� ������ ��Ŭ�� �� Source�� �ִ� Generate Getters and Setters ����Ͽ���.
	// getter�� setter�� �������ְ� ���� ���� üũ �� finish ������ ��.

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
