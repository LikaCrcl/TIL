package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public abstract class A {
	
	public A() {
		System.out.println("A 생성자");
		String num = "1234";
		
		// 파일 불러올 수 있게 해주는 클래스 File
		// 경로는 String 형식이며, \ 를 두개씩 써줘야 함
		// 경로명에 한글이 있으면 안되는 듯?
		File file = new File("C:\\Users\\ahgus\\Desktop\\JAVA_PROJECT\\work\\day_0323\\text\\t.txt");
		File file2 = new File("C:\\Users\\ahgus\\Desktop\\JAVA_PROJECT\\work\\day_0323\\text\\s.txt");
		
		String text = "hello world";
		String text2 = "hello world \ntest";
		
		byte[] bytes = text2.getBytes(); // getCharArray랑 비슷한 느낌의 메소드
		
		// try catch문
		// try 안에 있는 코드를 먼저 실행시키고 문제가 없다면 그대로 출력
		// try 코드가 문제가 있다면 catch에서 error 메시지를 출력하고 다른 코드들 읽어나감. (에러가 떠도 다른 코드들 정상 실행)
		try {
			
			int c = Integer.parseInt(num);
			System.out.println(c);
			
			FileWriter writer = new FileWriter(file);
			BufferedWriter b_writer = new BufferedWriter(writer); // 얘들 뭔지 모르겠음 시발
			b_writer.write(text);
			b_writer.close();
			
			FileOutputStream stream = new FileOutputStream(file2);
			stream.write(bytes);
			stream.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}
	
	// abstract
	// interface처럼 선언부만 있게 만들 수 도 있고
	abstract void a();
	
	// 일반 Class처럼 구현부까지 만들 수 도 있다.
	void b() {}

}
