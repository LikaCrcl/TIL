package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class B extends A {

	@Override
	public void i() {
		
		File file = new File("C:\\Users\\ahgus\\Desktop\\JAVA_PROJECT\\work\\day_0325\\text\\t.txt");
		String name = "hello";
		StringBuilder sb = new StringBuilder("helloworld");
		StringBuffer sbb = new StringBuffer("helloworld_buffer");
		File file2 = new File("C:\\Users\\ahgus\\Desktop\\JAVA_PROJECT\\work\\day_0325\\text\\s.txt");
		
		byte[] bytes = sb.toString().getBytes();
		
		try {
			
			FileWriter writer = new FileWriter(file);
			BufferedWriter b_writer = new BufferedWriter(writer);
			b_writer.write(sbb.toString());
			System.out.println(sbb);
			b_writer.close();
			
			FileOutputStream stream = new FileOutputStream(file2);
			stream.write(bytes);
			stream.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		} finally {
			
			System.out.println("매번 출력");
			
		}
		
	}

	@Override
	void a() {
		
		File file = new File("C:\\Users\\ahgus\\Desktop\\JAVA_PROJECT\\work\\day_0325\\text\\t.txt");
		
		try {
			
			FileReader read = new FileReader(file);
			BufferedReader b_read = new BufferedReader(read);
			System.out.println("출력이 됩니다 : "+b_read.readLine());
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
	}

}
