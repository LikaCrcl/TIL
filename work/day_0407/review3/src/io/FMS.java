package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FMS {
	final static String file = "lang.txt";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("FMS 프로그램입니다.");
		//CRUD(Create, Read, Update, Delete)
		while(true) {
			System.out.println("1. 추가하기\n2. 목록보기\n3. 수정하기\n4. 삭제하기\n5. 나가기");
			int choice = sc.nextInt();
			if(choice == 5) {
				System.out.println("안녕히가세요.");
				break;
			}
			switch(choice) {
			case 1:
				//추가하기
				System.out.print("추가할 데이터 : ");
				String newData = sc.next();
				append(newData);
				break;
			case 2:
				//목록보기
				show();
				break;
			case 3:
				//수정하기
				show();
				System.out.println("삭제할 데이터 : ");
				String toEditData = sc.next();
				System.out.println("추가할 데이터 : ");
				String editedData = sc.next();
				edit(toEditData, editedData);
				break;
			case 4:
				//삭제하기
				show();
				System.out.print("삭제할 데이터 : ");
				String deleteData = sc.next();
				delete(deleteData);
				break;
			
			}
		}
	}
	static void delete(String deleteData) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String result="";
			boolean check = false;
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				if(line.equals(deleteData)) {
					check = true;
				}else {
					result+=line+"\r\n";
				}
			}
			if(check) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				bw.write(result);
				bw.close();
			}else {
				System.out.println("삭제할 데이터가 없습니다.");
			}
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	static void append(String newData) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
			bw.write(newData+"\r\n");
			bw.close();
		} catch (IOException e) {
		}
	}
	
	static void show() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			System.out.println("=====☆★☆=====데이터 목록=====☆★☆=====");
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			System.out.println("==================================");
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	static void edit(String toEditData, String editedData) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String result="";
			boolean check = false;
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				if(line.equals(toEditData)) {
					check = true;
					line = editedData;
					result+=line+"\r\n";
				}else {
					result+=line+"\r\n";
				}
			}
			if(check) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				bw.write(result);
				bw.close();
			}else {
				System.out.println("수정할 데이터가 없습니다.");
			}
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	
}









