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
	
	// 이 아래는 따로 쓰지 않고 빈 공간에 우클릭 후 Source에 있는 Generate Getters and Setters 사용하였음.
	// getter와 setter를 설정해주고 싶은 값을 체크 후 finish 누르면 됨.

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
