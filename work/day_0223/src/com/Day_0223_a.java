package com;

public class Day_0223_a {
	
	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		
		// value type (�⺻ Ÿ��)
//		int a = 10;
		int a2 = 20;
		a2 = a;
//		System.out.println(a); // a=20���� �ٲ��� �ʴ´�. �̰��� �⺻Ÿ��. ����Ÿ���� �ٲ� ex) String ��
		
		swap_test(a, b);
		System.out.println("/////");
		System.out.println(a);
		System.out.println(b); // ������ �����߾����� �ٽ� ����غ��� �ȹٲ������.
		
		// �迭 ����
		int[] array = new int[2];
		array[0] = 10;
		array[1] = 20;
		
		System.out.println();
		swap_array(array);
		System.out.println("////");
		System.out.println("0 : "+array[0]);
		System.out.println("1 : "+array[1]); // ������ �״�� �ٲ������. �⺻Ÿ���� ����� �迭�� ������ �Ǹ� ������ �ٲ��.
		
		// �ζ� �����
		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = i+1;
			
		}
		
//		for (int i = 0; i < 1000; i++) {
//			
//			int n = (int) (Math.random()*44)+1;
//			
//			int temp = lotto[0];
//			lotto[0] = lotto[n];
//			lotto[n] = temp;
//			
//		}
//		
//		int lotto_max = 6;
//		for (int i = 0; i < lotto_max; i++) {
//			
//			System.out.println(lotto[i]);
//			
//		} ���� ù��° ���
		
		// ���ؼ� �ߺ��̸� ������ϴ� ��� ����
		
		int[] random_index = new int[6];
		
		for (int i = 0; i < 6; i++) {
			
			int n = (int)(Math.random()*45);
			if (i == 0) {
				random_index[0] = n;
			}
			else {
				
			}
			System.out.println(n);
			
		}
		
		
		
	}
	
	static void swap_test(int _a, int _b) {
		
		int temp = 0;
		
		temp = _a;
		_a = _b;
		_b = temp;
		
		System.out.println(_a);
		System.out.println(_b);
		
	}
	
	static void swap_array (int[] n) {
		int temp = 0;
		
		temp = n[0];
		n[0] = n[1];
		n[1] = temp;
						
		System.out.println("adress 0 : "+n[0]);
		System.out.println("adress 1 : "+n[1]);
	}

}
