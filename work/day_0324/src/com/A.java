package com;

public abstract class A extends AA implements I {
	
	public A() {
		System.out.println("A 생성자");
	}
	
	abstract void a();
	
	void b() {}
	
	public void i() {
		System.out.println("A의 i 메소드");
	}

}
