package com;

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
		
		// �迭 - (Ÿ��)[] (����)[] int[] nums;
		int[] nums = new int[3500]; // int[3] : ������ 0���� 3500�� ����. (0, 1, 2, ... , 3499���� ����)
		System.out.println(nums[0]); // 0�� ���´ٸ� ���� �Ϸ��� ����
		
		nums[3499] = 3499;
		System.out.println(nums[3499]); // ������ 3499 �� �ʱ�ȭ���༭ 3499 ���
		
	}

}
