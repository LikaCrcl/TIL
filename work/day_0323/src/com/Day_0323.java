package com;

import java.util.ArrayList;

public class Day_0323 {

	public static void main(String[] args) {
		
		B b = new B(3); // default ������ ���
		C c = new C(); // �굵 ���
		
		// abstract�� ������� ���� ������ �̷��� ���� A�� B������ C������ ��°� ���� �ٸ��� ���� �� ����
		b.a(); // A method in B class
		c.a(); // C Ŭ������ A �޼ҵ�
		System.out.println();
		
		// �̷��� �� ���� ����
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
