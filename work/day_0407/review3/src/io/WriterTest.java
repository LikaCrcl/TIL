package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
	public static void main(String[] args) {
		try {
//			FileWriter fw = new FileWriter("test.txt");
			FileWriter fw = new FileWriter("test.txt",true);
			
			System.out.println("���� �غ� �Ϸ�!");
			//		Writer out = new FileWriter("test.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("���� �غ� �Ϸ�!");
			bw.write("\r\nOracle");
			bw.close();
		} catch (IOException e) {
		}
	}
}
