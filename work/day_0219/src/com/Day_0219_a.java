package com;

import java.util.Scanner;

public class Day_0219_a {

	public static void main(String[] args) {
		
		// while�� ����
//		calculator(2);
		
		// ������, ������ 0�϶� ¦����, 1�϶� Ȧ����, 2�϶� ��ü ���
//		gugudan(1);
		
		// do while�� : true false ��� ���� ������ 1���� ������. ���� �� true��� ��� ����, false��� �� �̻� �������� ����
//		int count = 0;
//		do {
//			System.out.println("do");
//		}
//		while (false);
//		
//		do {
//			count++;
//			System.out.println("do : "+count);
//			if (count == 9)
//				break;
//		}
//		while (true);
//		
//		// 0���� or 100 �̻� �Է��ϸ� ������ do while��
//		Scanner input = new Scanner(System.in);
//		System.out.println("���� �Է�");
//		
//		do {
//			int num = input.nextInt();
//			System.out.println("test "+num);
//			if (num <= 0 || num > 99)
//				break;
//			System.out.println("�� �Է�");
//		}
//		while (true);
//		System.out.println("�׽�Ʈ ��");
		
		// innerMax
//		
//		int max = 1;
//		while (max < 10) {
//			max++;
//			int innerMax = 10;
//			while (innerMax > 0) {
//				if (innerMax < max) {
//					System.out.print("*");
//				}
//				else {
//					System.out.println(" ");
//				}
//				innerMax--;
//			}
//		}
//		
//		System.out.println();
		
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				if (i < j) {
//					System.out.print("/");
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		// �̵�ﰢ�� �Ƕ�̵� �����
		for (int i = 1; i < 10; i++) {
			
			for (int j = 0; j < 10-i; j++) {
				System.out.print("a");
			}
			for (int j = 1; j < i*2; j++) {
				
				System.out.print("*");
			}
			for (int j = 0; j < 10-i; j++) {
				System.out.print("a");
			}
			
			System.out.println("");
		}
		
	}
	
	static void calculator(int n) {
		int count = 1;
		while (count < 10) {
			System.out.println(n+"*"+count+"="+n*count);
			count++;
		}
	}
	
	static void gugudan (int n) {
		int count = 1;
		while (count < 10) {
			count++;
			if (count % 2 == n) {
				calculator(count);
				System.out.println("true : "+count);
			}
			if (n == 2) {
				calculator(count);
				System.out.println("true : "+count);
			}
			if (count == 9)
				break;
		}
	}

}
