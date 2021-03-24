package com;

public class B extends A {

	@Override
	void a() {
		
		System.out.println("B의 a 메소드");
		
		String name = "hello";
		String name2 = "world";
		System.out.println(name.hashCode());
		name = name+name2;
		System.out.println(name);
		System.out.println(name.hashCode());
		// String은 값이 바뀌면 주소도 바뀜
		
	}

	@Override
	public void i() {
		
		System.out.println("B의 i 메소드");
		StringBuilder sb = new StringBuilder("sb_hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("world");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		// StringBuilder는 append로 값을 추가해줬지만 주소가 바뀌지 않음
		sb.delete(0, 3); // "sb_" (0부터 3까지) 삭제
		sb.deleteCharAt(6); // hellow'o'rld 삭제
		System.out.println(sb); // hellowrld
		
	}
	
	void b() {
		System.out.println("B의 b 메소드");
	}

	@Override
	void aa() {
		
		
		
	}
	
}
