package com;

import java.util.Iterator;

public class Day_0222_a {

	public static void main(String[] args) {
		
		//for �� ���� ����
		
//		for (int i = 0; i < 10; i++) {
//			
//			if (i == 4) {
//				System.out.println(i);
//				break; // for�� �ƿ� ����
//			}
//		System.out.println(i);
//		}
		
//		for (int i = 0; i < 10; i++) {
//			if (i == 4) {
//				for (int j = 0; j < 10; j++) {
//					System.out.println(i);
//					break; // �ٱ��� for�� ���� �������°� �ƴ� if�� ������ �� for�� �� ����
//				}
//				System.out.println("if ��");
//			}
//		System.out.println("�ٱ��� for��");
//		}
		
//		int count = 1;
//		switch (count) {
//		case 0:
//			System.out.println("case 0 : "+count);
//			break;
//			
//		case 1:
//			if (count == 0) {
//				System.out.println("case 1 : "+count);
//				break;
//			}
//			else {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("case 11 : "+count);
//					break;
//				}
//			}
//			System.out.println("case 1 : "+count);
//			break;
//			
//		case 2:
//			System.out.println("case 2 : "+count);
//			break;
//		}
		// �� switch���� �������� case 11 : 1 case 1 : 1 �� ����. break;�� �������� �� �ݺ����� ���������� ���ǹ��� �����Ѵ�.
		
		// continue
//		for (int i = 0; i < 10; i++) {
//			if (i != 4) {
//				continue; // continue�� ������ �� �Ʒ��� ���� �����ϰ� i++�� �Ѿ. ���⼱ 0�� �� ���� �� print ���ϰ� 1�� �Ѿ. i�� 4�� �� false �̹Ƿ� 4�� ��µǰ� ��.
//			}
//			System.out.println(i);
//		}
//		
		// ���� ������ ? : [(����)(����)(����)? (value true):(value false)]
		int count;
		System.out.println(count = (true) ? 10:20);
		System.out.println(count = (false) ? 10:20);
		System.out.println(count = (count > 0) ? 10:20); // ������ count�� 20���� �ʱ�ȭ������� ������ count > 0 : true. ���� 10
		
		// �̷� �����ε� �� �� ����
		int num = (count > 0)? 30:40;
		boolean is_bool = (count > 0)? true:false;
		
		System.out.println(is_bool); // true
		
		String name = (count > 0)? "����":"����";
		System.out.println(name);
		
		// 0~99 true, 100~199 false ����
//		boolean random = ((int)(Math.random()*200) > 99)? true:false;
//		System.out.println(random);
		// ���� ���� ������ ��
		
		// random�� ���� ���Դ��� �� �� �ִ� ��
		int num2 = (int) (Math.random()*200);
		boolean is_test = (num2 < 100)? true:false;
		System.out.println(num2 + " : " +is_test);
		
		// �迭(Array) - (Ÿ��)[] (����) = new (Ÿ��)[(����(int))];
		int[] nums = new int[3500]; // int[3] : ������ 0���� 3500�� ����. (0, 1, 2, ... , 3499���� ����)
		System.out.println(nums[0]); // 0�� ���´ٸ� ���� �Ϸ��� ����
		
		nums[3499] = 3499;
		System.out.println(nums[3499]); // ������ 3499 �� �ʱ�ȭ���༭ 3499 ���
		
		int max = 35;
		int[] nums2 = new int[max]; // [] �ȿ� int�� ������ ������ ���� ���� ����
		System.out.println(nums2[34]); // max=35 ���� �����߱� ������ 34�� ���� �Ϸ������Ƿ� 0�� ��µ�
		System.out.println("nums2 max : "+nums2[nums2.length-1]); // � �迭�� max���� ����ʹٸ� .length-1 ���ָ� ��. .length�� max�� +1�� ���̱� ����.
		
		// PC 100�� ������ �̸� �ֱ�
		String[] names2 = new String[100];
		System.out.println(names2.length); // (�迭����).length : ������ ����. ���� 0~99�� 100�� �̹Ƿ� 100 ��µ�
//		System.out.println(names2[100]); �� ������. ����� �� [n]�� n��°�� �ƴ� n ��ü�� �ǹ���. ex) names2 �迭�� ù��°�� names2[0]
		names2[0] = "00";
		System.out.println(names2[0]);
		
		for (int i = 0; i < names2.length; i++) {
//			System.out.print(i);
			names2[i] = "PC : �ε��� : "+i;
			System.out.println(names2[i]);
		}
		
		// ¦�� true, Ȧ�� false�� ��Ÿ���� ����
		boolean[] bool = new boolean[35];
		for (int i = 0; i < bool.length; i++) {
			// ���� �ẻ ��
//			if (i % 2 == 0) {
//				bool[i] = true;
//				System.out.println(i+" : "+bool[i]);
//			}
//			else {
//				bool[i] = false;
//				System.out.println(i+" : "+bool[i]);
//			}
			
			// �� ������ ���׿����ڸ� �� ���� ����
			bool[i] = (i % 2 == 0) ? true:false;
			System.out.println(i+" : "+bool[i]);
				
		}
		
		// ������ 2�ܺ��� 9�ܱ��� ����� �迭 ��� ǥ�� ����
		System.out.println("������ 2��~9�� ����");
		int[] a = new int[72];
		int b = 0;
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				a[b] = i*j;
				System.out.println(a[b++]);
			}
		}
	}

}
