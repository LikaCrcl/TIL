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
		System.out.println("FMS ���α׷��Դϴ�.");
		//CRUD(Create, Read, Update, Delete)
		while(true) {
			System.out.println("1. �߰��ϱ�\n2. ��Ϻ���\n3. �����ϱ�\n4. �����ϱ�\n5. ������");
			int choice = sc.nextInt();
			if(choice == 5) {
				System.out.println("�ȳ���������.");
				break;
			}
			switch(choice) {
			case 1:
				//�߰��ϱ�
				System.out.print("�߰��� ������ : ");
				String newData = sc.next();
				append(newData);
				break;
			case 2:
				//��Ϻ���
				show();
				break;
			case 3:
				//�����ϱ�
				show();
				System.out.println("������ ������ : ");
				String toEditData = sc.next();
				System.out.println("�߰��� ������ : ");
				String editedData = sc.next();
				edit(toEditData, editedData);
				break;
			case 4:
				//�����ϱ�
				show();
				System.out.print("������ ������ : ");
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
				System.out.println("������ �����Ͱ� �����ϴ�.");
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
			System.out.println("=====�١ڡ�=====������ ���=====�١ڡ�=====");
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
				System.out.println("������ �����Ͱ� �����ϴ�.");
			}
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	
}









