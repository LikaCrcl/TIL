package com;

import java.util.ArrayList;

public class Day_0310_a {

	public static void main(String[] args) {
		
		// 1eX : 10�� X��
		System.out.println("1e2 : "+(int)1e2); // 10�� ����
		System.out.println("1e4 : "+(int)1e4); // 10�� 4��
		
		// for each��
		ArrayList<Integer> list_int = new ArrayList<Integer>();
		
		for (int i = 0; i < 1E2; i++) {
//			list_int.add(i+10);
		}
		
		for(int i : list_int) {
//			System.out.println("for each list_int : "+i); // �ڵ����� min~max������ ��� ���� ������
		}
		
		ArrayList<String> list_string = new ArrayList<String>();
		list_int.add(100);
		list_string.add("100");
		
		list_string.add(list_int.get(0).toString());
		list_int.add(Integer.parseInt(list_string.get(0)));
		
		System.out.println("list_int : "+list_int);
		System.out.println("list_string : "+list_string);
		
		// 2�� ArrayList
		ArrayList<ArrayList<String>> list_string2 = new ArrayList<ArrayList<String>>();
		
		list_string2.add(new ArrayList<String>());
		list_string2.add(list_string); // 2���ϱ� 1���� add���� �� ����
		
		System.out.println("list_string2[0] : "+list_string2.get(0)); // 0�� ���� ��� �� ���
		System.out.println("list_string2[1] : "+list_string2.get(1)); // 1�� ���� ~~
		
		System.out.println("list_string2.size() : "+list_string2.size()); // list_string2�� add�� �� 2���̶� 2
		
		System.out.println("list_string2[1][0] : "+list_string2.get(1).get(0)); // �� ���� ����ϰ��� �Ѵٸ� �̷���
		
		ArrayList<String> list_test = list_string2.get(1); // get(1)�� list_string2[1]�� �������� ���̰� �� ���� �迭�̱� ������ 1���� ���� ����
		
		System.out.println("list_test : "+list_test);
		
	}

}
