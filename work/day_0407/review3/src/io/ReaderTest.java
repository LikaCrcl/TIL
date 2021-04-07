package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
		} catch (IOException ioe) {
		}
	}
}
