package com;

import java.util.ArrayList;

public class Day_0323 {

	public static void main(String[] args) {
		
		B b = new B(3); // default 생성자 출력
		C c = new C(); // 얘도 출력
		
		// abstract를 사용했을 때의 장점은 이렇게 같은 A라도 B에서와 C에서의 출력값 등을 다르게 해줄 수 있음
		b.a(); // A method in B class
		c.a(); // C 클래스에 A 메소드
		System.out.println();
		
		// 이렇게 쓸 수도 있음
		print_test(b);
		print_test(c);
		System.out.println();
		
		ArrayList<A> list = new ArrayList<A>();
		
		list.add(b);
		list.add(c);
		
		list.get(0).a();
		list.get(1).a();
		
		b.io_print();
		

	}
	
	static void print_test(A a) {
		
		a.a();
		
	}

}
