package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class B extends A {
	
	public B() {
		
		super();
		System.out.println("B ������");
		
	}
	
	public B(int c) {
		
		this();
		System.out.println("B ������ : "+c);
		
	}
	
	@Override
	void a() {
		
		System.out.println("A method in B class");
		
	}
	
	void io_print() {
		
		try {
			
			File file = new File("C:\\Users\\ahgus\\Desktop\\JAVA_PROJECT\\work\\day_0323\\text\\t.txt");
			File file2 = new File("C:\\Users\\ahgus\\Desktop\\JAVA_PROJECT\\work\\day_0323\\text\\s.txt");
			
			FileReader read = new FileReader(file2);
			BufferedReader r_writer = new BufferedReader(read);
			
			String data = "";
			
			while ((data = r_writer.readLine()) != null) { // .readLine�� String �� ���� �߶�. while ���� 2��° �� �� hello world�� �д°� �ƴ� test ���� �а� ��.
				System.out.println(data);
			}
			r_writer.close();
			
			FileInputStream stream = new FileInputStream(file);
			int c = 0;
			while ((c = stream.read()) != -1) {
				System.out.print((char)c);
			}
			
			System.out.println(stream.read());
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
	}

}
