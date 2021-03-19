package com.sm;


public class Animal_sm {
	
	public Animal_sm() {}
	
	public Animal_sm(String name, int age, String gender, double speed, String type, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.speed = speed;
		this.type = type;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Animal_sm [name=" + name + ", age=" + age + ", gender=" + gender + ", speed=" + speed + ", type=" + type
				+ ", weight=" + weight + "]";
	}

	protected String name;
	protected int age;
	protected String gender;
	protected double speed;
	protected String type;
	protected double weight;

}
