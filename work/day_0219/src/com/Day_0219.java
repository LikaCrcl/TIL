package com;

import java.util.Scanner;

public class Day_0219 {

	public static void main(String[] args) {
		
		// while�� ����
//		calculator(2);
		
		// ������, ������ 0�϶� ¦����, 1�϶� Ȧ����, 2�϶� ��ü ���
//		gugudan(1);
		
		// do while�� : true false ��� ���� ������ 1���� ������. ���� �� true��� ��� ����, false��� �� �̻� �������� ����
		int count = 0;
		do {
			System.out.println("do");
		}
		while (false);
		
		do {
			count++;
			System.out.println("do : "+count);
			if (count == 9)
				break;
		}
		while (true);
		
		// 0���� or 100 �̻� �Է��ϸ� ������ do while��
		Scanner input = new Scanner(System.in);
		System.out.println("���� �Է�");
		
		do {
			int num = input.nextInt();
			System.out.println("test "+num);
			if (num <= 0 || num > 99)
				break;
			System.out.println("�� �Է�");
		}
		while (true);
		System.out.println("�׽�Ʈ ��");
		
		

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
