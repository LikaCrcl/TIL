package com;

import java.util.ArrayList;
import java.util.LinkedList;

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
		
		System.out.println("list_string2[0] : "+list_string2.get(0)); // 0�� ���� ��� �� ���. ���ȣ�� ���� �����ϱ� ������ �� ���̰� ���� ǥ��� �ƴ�
		System.out.println("list_string2[1] : "+list_string2.get(1)); // 1�� ���� ~~
		
		System.out.println("list_string2.size() : "+list_string2.size()); // list_string2�� add�� �� 2���̶� 2
		
		System.out.println("list_string2[1][0] : "+list_string2.get(1).get(0)); // �� ���� ����ϰ��� �Ѵٸ� �̷���
		
		ArrayList<String> list_test = list_string2.get(1); // get(1)�� list_string2[1]�� �������� ���̰� �� ���� �迭�̱� ������ 1���� ���� ����
		
		System.out.println("list_test : "+list_test);
		
		// 2�� ArrayList �̿� ������ ����
		ArrayList<ArrayList<Integer>> list_gugudan = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> asdf = new ArrayList<Integer>();
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				asdf.add((i+2)*(j+1));
			}
			list_gugudan.add(asdf);
			asdf = new ArrayList<Integer>(); // �̰� �����ָ� �� j for������ add�� ������ ���� ����. new�� �Ἥ �ּҸ� ���� �Ҵ������ ����
		}
		
		for (int i = 0; i < list_gugudan.size(); i++) {
			for (int j = 0; j < list_gugudan.get(i).size(); j++) {
//				System.out.println(list_gugudan.get(i).get(j));
			}
			System.out.println();
		}
		
		// list_gugudan ������ �ٽ� ������ 2�� String list�� ������ �������� �ֱ� ����
		ArrayList<ArrayList<String>> list_str = new ArrayList<ArrayList<String>>();
		ArrayList<String> data_gugu = new ArrayList<String>();
		
		for (int i = 0; i < list_gugudan.size(); i++) {
			for (int j = 0; j < list_gugudan.get(i).size(); j++) {
				data_gugu.add((i+2)+"*"+(j+1)+"="+list_gugudan.get(i).get(j));
			}
			list_str.add(data_gugu);
			data_gugu = new ArrayList<String>();
		}
		
		System.out.println(list_str);
		
		// LinkedList
		LinkedList<Integer> list_int_link = new LinkedList<Integer>();
		ArrayList<Integer> list_int_arr = new ArrayList<Integer>();
		
		double start_time = System.currentTimeMillis();
		
		for (int i = 0; i < 1E5; i++) {
//			list_int_link.add(i);
			list_int_arr.add(i);
//			System.out.println(i);
		}
		
		for (int i = 0; i < 1E5; i++) {
//			list_int_link.remove(0);
			list_int_arr.remove(0);
			System.out.println(i);
		}
		
		double end_time = System.currentTimeMillis();
		System.out.println();
		System.out.println(end_time - start_time);
		
		// add �� ���� ArrayList��, remove�� �� LinkedList�� �� ����. add�� ���� ���� �� arraylist, remove�� ���� ���� �� linkedlist�� ����
		
	}

}