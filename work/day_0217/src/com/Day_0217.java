package com;

import java.util.Iterator;

public class Day_0217 {
	
	static int num_2;

	public static void main(String[] args) {
		
		// ���ǹ� switch (sw���� ���� Ctrl+Space ������ �⺻�� �ڵ��ϼ�)
//		switch (key) {
//			case value:
//				
//				break;   �⺻��
//	
//			default:
//				break;
//		}
		int num = 3;
		int sum = 0;
		
		switch (num) {
		case 0:
			sum += 0;
//			break;
		case 1:
			sum += 1;
//			break;
		case 2:
			sum += 2;
//			break;
		case 3:
			sum += 3;
//			break;
		case 4:
			sum += 4;
//			break;
		case 5:
			sum += 5;
//			break;
//		default:
//			break;
		}
		
		System.out.println("�ջ� : "+sum); // num = 3�� �� 12�� ����. break; �� ��� case 3 ���� �� �Ʒ��� ���� ����ϱ� ����.
		
		// 0~10 ¦�� �ջ�, Ȧ�� �ջ� ����
		int a = 0, b = 0, c = 0;
		
		switch (a) {
		
		case 0:
			b += 0;
		case 1:
			c += 1;
		case 2:
			b += 2;
		case 3:
			c += 3;
		case 4:
			b += 4;
		case 5:
			c += 5;
		case 6:
			b += 6;
		case 7:
			c += 7;
		case 8:
			b += 8;
		case 9:
			c += 9;
		case 10:
			b += 10;

		}
		
		System.out.println("¦�� �ջ� : "+b+" Ȧ�� �ջ� : "+c);
		
		int num_1 = 1; // �������� : �Լ� �ȿ��� ����Ǵ� ����. = 0 ���� ���� �������(�ʱ�ȭ�����)��
		System.out.println("�������� : "+num_1);
		
		System.out.println("�������� : "+num_2); // 0
		// �������� : �Լ� �ۿ��� (�� ��� �� ���� public class �Ʒ����� ����) ����� ����. �ʱ�ȭ������ �ʾƵ� �������� ����."
		// �� ���� ������ ���� �̸��� ������ ����� �� ������(ex int a;, int a; X) ���� �ٸ� �������� ���� �̸��� ������ ����� �� ����.
		
		// ���� �̰� �ٽú��Եȴٸ� ���⼭ �� �Ʒ��� test�Լ��� ���ٰ� �ٽ� �� ��
		
		int num_2 = 1;
		System.out.println("�������� : "+num_2); // 1
		
		if (test(1)) { // 1�� �ǹ̴� test �Լ��� �Ű������� 1�� ������ ��. test �Լ����� n�� 0�� �ƴϸ� true�̹Ƿ� �� if���� ����� true
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		// ���� ��� math �Լ� �̿��Ͽ� �����ϰ� 0 �Ǵ� 1�� ������ �ϱ� ����.
		int num3 = (int) (Math.random()*100);
		
		if (test(num3)) { // test �Լ��� boolean���� �����߱� ������ ������� ��Ÿ���� �ʾƵ� ��
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
		
		// switch�� �ȿ� if���� �ִ´ٴ��� �ϴ� �͵� ����
		
		// switch���� default
		int n = 6;
		switch (n) {
		case 0:
			System.out.println(n);
			break;
		case 1:
			System.out.println(n);				// case�� ���� �ش����� ���� �� default�� ������ �� ���� ����ϰ� ��. ���� default : 6 ���
			break;
		case 2:
			System.out.println(n);
			break;
		default:
			System.out.println("default : "+n);
			break;
		}
		
		
		// �ݺ��� for. for ġ�� Ctrl+Space �ϸ� �⺻�� ����
		// for (�ʱ�ȭ; ����; ����) {}
		// ��� ������ true�� �� ���ͼ� ��µǰ�, ������ false��� ������ �ʰ� ������. || && if ��� ����
		// ������ false�� �Ǵ� �������� �ݺ��� ���߰� for���� ����. (false ��� x)
		for (int i = 8; i < 10; i++) {
			System.out.println(i);
			System.out.println(10 < 10);
		}
		
		// for������ ������ false���� ����ϱ� ����
		for (int i = 8; i < 10; i++) {
			System.out.println(i +" : "+(i < 10));
			if (i == 9) {
				System.out.println("10 : "+(10 < 10));
			}
		}
		
		// for�� ù��°�� false, ������ true ��� ����
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				System.out.println(i+" : false");
			}
			else {
				System.out.println(i+" : "+(i < 3));
			}
		}
		
		System.out.println("git test");
		
	}
	
	static boolean test(int n) { // ���⼭ int n �κ��� �Ű�����. �Ű������� ���������� ����
		// static 'void' ~~ ���� ������ �Լ���(void�� ���� �Լ�) return�� ��� ������ �� ���� ���(ex String, boolean ��)���� return�� �־�� ��. 
		if (n % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static void switch_test() { // ���� �ݹ��Լ� main (���� �� switch_test�� Ŀ�����Լ�)�� �ʹ� ���������� �ڵ�� ���ܳ��� �Ѵٴ��� �ϴ� ��Ȳ�� �̷��� ���� �Լ��� �ļ� ���ֵ� ����
		// �� Ŀ�����Լ��� �ٸ� ������ �ҷ����� �ϴ� ���, �θ� ���� static�� �ִ��� ������ Ȯ���ؾ���. �ű⿡ static�� �ִٸ� ���⿡�� static�� ����� ��
		// �� �ؿ� ��Ÿ�´µ� �θ� ���� static�� ���ٸ� �ҷ����� �Լ��� static�� �־ �ǰ� ��� ����
		
		int num = 0;
		
		switch (num) {
		case 0:
			
			break;

		default:
			break;
		}
	}
	
	void test2() {
		switch_test();
	}
	
//	static void test3() {
//		test2(); �� �ȵ�
//	}

}
