package com;

public class Day_0218 {

	public static void main(String[] args) {
		
		// ��� �����Ȱ� �ִµ� ��� ������ �� ������ �빮�ڷθ� �����
		// ex) final int NUM = 1;
		// ���� switch���� ��� default ����
		// default�� if������ else�� ����� Ư���� ������ ����. (��� false�� �����)
		// ���� ����, ����, �Ű����� ����
		// ���� : class �ٷ� �ȿ��� ������ ��
		// ���� : class ���� method �ȿ��� ������ ��
		// �Ű� : method ���� �� () �ȿ� ������ �� ex) for (int i, i < 0, i++) ������ i ��
		
		// switch ����
		int key_v = 0; 
		switch (key_v) {
		case 1-1: // case�� �����ڰ� �� ���� �ִ�.
			
			break;

		default:
			break;
		}
		
		// for���� method�� �̿��� ������ ����
//		calculator(10);
		
		// ������ 2��~9�� ��� ����
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println((i+"*"+j+"="+(i*j)));
//			}
//		}
		
		// method �̿� ������ ��� ����
		for (int i = 2; i < 10; i++) {
				calculator(i);
		}
		
		// swap �̿� x�� 60, y�� 30 �ֱ�
		int x = 30;
		int y = 60;
		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x : "+x+" y : "+y);
		
	}
	
	static void calculator(int n) {
		int number = n;
		for (int i = 1; i < 10; i++) {
			System.out.println(number+"*"+i+"="+number*i);
		}
	}

}
