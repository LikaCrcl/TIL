package com;

public class Day_0224_a {

	public static void main(String[] args) {
		
		// 1�� �迭
		int[] array = new int[10];
		int[] array_a = {1, 2, 3};
		
		// 2�� �迭
		int[][] array2 = new int[2][10]; // 17~18° �ٰ� ���� �ǹ�
		array2[0][0] = 10;
		System.out.println(array2[0][0]);
		
		int[][] array2_a = new int[2][];
		array2_a[0] = new int[10];
		array2_a[1] = new int[10];
		
		int[][] array2_b = {{1,2},{3,4}}; // �� �Ⱦ�
		array2_b[0][0] = 1;
		array2_b[0][1] = 2;
		array2_b[1][0] = 3;
		array2_b[1][1] = 4; // ������ int[][] array2_b = {{1,2},{3,4}};�� ���� �ǹ���. �� �迭�� �� 0�� {1,2}, 1�� {3,4}�� �ǹ��ϰ� �� �迭�� �� 0�� 1 Ȥ�� 3, 1�� 2 Ȥ�� 4�� �ǹ���.
		
		// 1���� 15, 19, 66 �ֱ� ����
		int[][] array_c = new int[3][];
		int[] d = {15, 19, 66};
		
		for (int i = 0; i < array_c.length; i++) {
			array_c[i] = new int[d[i]];
		}
		
		// �迭 ����
		int[] array_1 = new int[3]; // 1�� �迭 array_1���� value���� ���� ������ �� �� ���� new int[3]�̶� ���� array_1 �迭�� array_1[0], [1], [2] �ּҸ� �Ҵ����� ��.
		System.out.println(array_1[0]); // value�� ���� ������ 0 ���
		array_1[0] = 1; // �ּҰ� �Ҵ�� �迭���� value�� �������� �� ����.
		System.out.println(array_1[0]); // value �������༭ 1 ���
		
		int[][] array_2 = new int[3][]; // 2�� �迭 array_2
		array_2[0] = new int[10]; // 2���迭������ ���� �迭�� value�� ���� ������ �� ����. �ּҸ� �Ҵ��������. �ٷ� ���ٿ��� ������ ���� array_2[0][], [1][], [2][]���� ���⼭�� [0][]�� �ּҵ��� �Ҵ��� �� ����
		// �� �������ʹ� array_2[0][0], [0][1], ... , [0][9] ������ value�� �������� �� �ְ� �� ����
		array_2[0][0] = 1;
		System.out.println(array_2.length); // int[][] array_2 = new int[3][]; ���� �Ҵ����� �ּ��� ũ��. ���� 3 ���
		System.out.println(array_2[0].length); // array_2[0] = new int[10]; ���� �Ҵ����� array_2[0]�� ���� ũ��. ���� 10 ���
		
		System.out.println("----");
		
		// array_t[min][min] ~ array_t[max][max] �� ���� j ���Խ�Ű�� ����
		// �� ǯ
		int[][] array_t = new int[10][];
		int[] array_num = {15,19,66,100,20,30,50,45,32,2};
		int count = 0;
		
		for (int i = 0; i < array_t.length; i++) {
			array_t[i] = new int[array_num[i]];
			for (int j = 0; j < array_t[i].length; j++) {
				array_t[i][j] = count++;
				System.out.println(array_t[i][j]);
			}
		}
		
		int size = 10;
		int[][] array_3 = new int[size][size];
		
	}

}
