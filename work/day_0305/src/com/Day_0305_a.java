package com;

import java.util.Scanner;

public class Day_0305_a {

	public static void main(String[] args) {
		
		Cons_test constructors = new Cons_test(); // ������
		
		// �ٽ� �� �� �����ϴ� String �ּ�
		String[] arr_str = new String[3];
		
		for (int i = 0; i < arr_str.length; i++) {
			arr_str[i] = "hello";
		}
		
		arr_str[0] = new String("hello");
		
		if (arr_str[0].equals(arr_str[1]) && arr_str[1] == arr_str[2])
			System.out.println("��� �ּҰ� ����");
		
		if (arr_str[0] == arr_str[1])
			System.out.println("before arr_str[0] == arr_str[1]"); // arr_str[0]�� new�� �Ἥ ������ ���ο� �ּҿ� �Ҵ��������Ƿ� �ּҰ� �ٸ���,
		
		arr_str[0] = "hello"; // new�� ���� �ʰ� value�� ���� �����ϸ� 
		
		if (arr_str[0] == arr_str[1])
			System.out.println("after arr_str[0] == arr_str[1]"); // �ּҵ� �������� �ش� �� ��µ�
		
		// ���� 2�� �迭 ����� ���� ( a_s_2[0][7], a_s_2[1][20] 'ȿ��������' �����)
		String[][] a_s_2 = new String[2][];
		
//		for (int i = 0; i < a_s_2.length; i++) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println(i+"��° �迭 ũ�� �Է�");
//			int a = sc.nextInt();
//			a_s_2[i] = new String[a];
//		}
//		
//		System.out.println("a_s_2[0].length : "+a_s_2[0].length);
//		System.out.println("a_s_2[1].length : "+a_s_2[1].length);
		// ���� scanner�� ���� ��� �����غ�
		// 2���迭�� ��ߵȴٴ� ���� ��Ʈ�� �� �����غ� ��
		int[] index = {7, 20, 90, 50, 340};
		
//		for (int i = 0; i < a_s_2.length; i++) {
//			a_s_2[i] = new String[index[i]];
//			System.out.println("a_s_2["+i+"].length : "+a_s_2[i].length);
//		}
		
		a_s_2 = new String[index.length][];
		for (int i = 0; i < a_s_2.length; i++) {
			a_s_2[i] = new String[index[i]];
			System.out.println("a_s_2["+i+"].length : "+a_s_2[i].length);
		}

	}
	
}
