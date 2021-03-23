package com;

public class C extends A {
	
	public C() {
		
		System.out.println("C 생성자");
		
	}

	@Override
	void a() {
		
		System.out.println("C 클래스에 A 메소드");
		
	}

}
