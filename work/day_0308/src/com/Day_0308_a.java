package com;

public class Day_0308_a {

	public static void main(String[] args) {
		
		// int 2���迭�� String 2���迭�� �����Ͽ� ǥ���غ��� ����
		int[][] gugudan = new int[9][9];
		String[][] gu_string = new String[9][9];
		
		for (int i = 0; i < gugudan.length; i++) {
			for (int j = 0; j < gugudan[0].length; j++) {
				gugudan[i][j] = (i+1)*(j+1);
//				System.out.println(gugudan[i][j]);
			}
//			System.out.println();
		}
				
		for (int i = 0; i < gu_string.length; i++) {
			for (int j = 0; j < gu_string[0].length; j++) {
				gu_string[i][j] = (i+1)+"*"+(j+1)+"="+gugudan[i][j];
//				System.out.println(gu_string[i][j]);
			}
		}
		
		String[] a = new String[gu_string.length*gu_string[0].length];
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = "";
		}
		
		for (int i = 0; i < gu_string.length; i++) {
			for (int j = 0; j < gu_string[0].length; j++) {
				a[count++] = gu_string[i][j];
			}
		}
		
		count = 0;
		
		// �ٽ� String ������ �ְ� ���̻�� ; �� ���� �ϱ� ���� �ε� �� ���Ҹ��� ���������𸣰ڴ�
		
		String b = "";
		
		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
			b += a[i]+";";
		}
		
		System.out.println(b);
		
				
	}

}
