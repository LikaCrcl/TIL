package com;

public class B extends A {

	@Override
	void a() {
		
		System.out.println("B�� a �޼ҵ�");
		
		String name = "hello";
		String name2 = "world";
		System.out.println(name.hashCode());
		name = name+name2;
		System.out.println(name);
		System.out.println(name.hashCode());
		// String�� ���� �ٲ�� �ּҵ� �ٲ�
		
	}

	@Override
	public void i() {
		
		System.out.println("B�� i �޼ҵ�");
		StringBuilder sb = new StringBuilder("sb_hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("world");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		// StringBuilder�� append�� ���� �߰��������� �ּҰ� �ٲ��� ����
		sb.delete(0, 3); // "sb_" (0���� 3����) ����
		sb.deleteCharAt(6); // hellow'o'rld ����
		System.out.println(sb); // hellowrld
		
	}
	
	void b() {
		System.out.println("B�� b �޼ҵ�");
	}

	@Override
	void aa() {
		
		
		
	}
	
}
