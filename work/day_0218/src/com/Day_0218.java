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
		calculator(10);
		
		// ������ 2��~9�� ��� ����
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println((i+"*"+j+"="+(i*j)));
			}
		}
		
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
		
		// while��
		
		String name = "helloworlds";
		int n = name.length(); // name.length(); <- String�� ���� ���� int�� ��Ÿ���ִ� �Լ�. n = 11
		int count = 0;
		
		while (count < n) { // for�� ó�� ()���� ������ true�� �� while ���� �ٵ��� ������� �о��. 
			System.out.println(count+" : test");
			if (count == 3) { // �� �ȿ� if�� �� ���� ����
				break; // ���⼭ break�Ǵ� ������ count�� 3�� ���� ����, �� �� �� if���� ���������°� �ƴ϶� while�� ��ü�� ��������.
			}
			count++;
		} // break�� �ߵ�?�ϰԵǸ� ����� ���ԵǴ� ����.
		
		// for���� �ٸ����� for���� i++ ���� �Ἥ i�� ������ �������ִµ� while�� ���� �� �� ó�� count++;�� ������ ������ count�� �������� �����Ƿ� �ʱ� ������ count������ ������ ��� ���� ��.
		// ���⼭�� ��� count++;�� ���ٸ� �ֿܼ� "0 : test"�� ��� ������ ��µǰ� ��
		
		// while������ 2��~9�� ��� ����
		int num = 2;
		int num2 = 1;
		
		while (num < 10) {
			while (num2 < 10) {
				System.out.println(num+"*"+num2+"="+(num*num2));
				num2++;
			}
			num++;
			num2=1; // ���� �̰� �Ⱦ��� num++; ���� ������ ��������־��µ� �� �ٿ� println("0"); �غ��� ���޾���
			// ������ �� �ȿ��ִ� while���� num2�� 1�� �ٽ� ���ƿ��� �ʰ� 10���� �����ִٴ� �ſ���
			// �׷��� �ٽ� 1�� �ʱ�ȭ��������� �����۵�
		}
		
	}
	
	static void calculator(int n) {
		int number = n;
		for (int i = 1; i < 10; i++) {
			System.out.println(number+"*"+i+"="+number*i);
		}
	}

}
