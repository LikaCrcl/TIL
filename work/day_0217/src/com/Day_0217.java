package com;

public class Day_0217 {

	public static void main(String[] args) {
		
		// switch�� (sw���� ���� Ctrl+Space ������ �⺻�� �ڵ��ϼ�)
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
		System.out.println("���� �־ȵ� �ù�");
		
		
	}
	
	static void switch_test() { // ���� �ݹ��Լ� main (���� �� switch_test�� Ŀ�����Լ�)�� �ʹ� ���������� �ڵ�� ���ܳ��� �Ѵٴ��� �ϴ� ��Ȳ�� �̷��� ���� �Լ��� �ļ� ���ֵ� ����
		
		int num = 0;
		
		switch (num) {
		case 0:
			
			break;

		default:
			break;
		}
	}

}
