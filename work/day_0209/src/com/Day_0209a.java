package com;

import java.util.Scanner; // java.util.*; ��� �Է� �� java util �� ��� Ŭ���� �ҷ���

public class Day_0209a {

	public static void main(String[] args) {
		
		// scanner class
		
		Scanner input = new Scanner(System.in); // new : ������. �ſ��߿�
		/*
	 	new �����ڴ� ���� ���ο� �ּҸ� �Ҵ�����
		���� Ŭ������ new�� ������ ������ ���� �ٸ� �ּҿ� �Ҵ��
		��� ������ ���� ������ new�� ����ϰ� �Ǹ� �ٸ��ٰ� �Ǵ���.

		String name = "name";
		String name2 = "name";
				
		System.out.println(name == name2); -> true ( == �� �񱳿�����)
		
		String name = "name";
		String name2 = new String("name");
		
		System.out.println(name == name2); -> false
		*/
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num = input.nextInt();
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");		
		System.out.println(num);
		
	}

}
