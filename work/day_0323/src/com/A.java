package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public abstract class A {
	
	public A() {
		System.out.println("A ������");
		String num = "1234";
		
		// ���� �ҷ��� �� �ְ� ���ִ� Ŭ���� File
		// ��δ� String �����̸�, \ �� �ΰ��� ����� ��
		// ��θ� �ѱ��� ������ �ȵǴ� ��?
		File file = new File("C:\\Users\\ahgus\\Desktop\\JAVA_PROJECT\\work\\day_0323\\text\\t.txt");
		File file2 = new File("C:\\Users\\ahgus\\Desktop\\JAVA_PROJECT\\work\\day_0323\\text\\s.txt");
		
		String text = "hello world";
		String text2 = "hello world \ntest";
		
		byte[] bytes = text2.getBytes(); // getCharArray�� ����� ������ �޼ҵ�
		
		// try catch��
		// try �ȿ� �ִ� �ڵ带 ���� �����Ű�� ������ ���ٸ� �״�� ���
		// try �ڵ尡 ������ �ִٸ� catch���� error �޽����� ����ϰ� �ٸ� �ڵ�� �о��. (������ ���� �ٸ� �ڵ�� ���� ����)
		try {
			
			int c = Integer.parseInt(num);
			System.out.println(c);
			
			FileWriter writer = new FileWriter(file);
			BufferedWriter b_writer = new BufferedWriter(writer); // ��� ���� �𸣰��� �ù�
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
	// interfaceó�� ����θ� �ְ� ���� �� �� �ְ�
	abstract void a();
	
	// �Ϲ� Classó�� �����α��� ���� �� �� �ִ�.
	void b() {}

}
