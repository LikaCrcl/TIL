package com;

import java.util.ArrayList;

public class Day_0303_a {

	public static void main(String[] args) {
		
		// collections framework
		// list �� ArrayList.
		// ArrayList<����Ÿ��> (����) = new ArrayList<����Ÿ��>();
		int[] array_count = new int[9];
		
		ArrayList<Integer> list_count = new ArrayList<Integer>();
		// <> �ȿ��� ����Ÿ�Ը� �� �� ����. int�� ��� Integer��, boolean�� ��� Boolean���� ���� ��� ������.
		
		for (int i = 0; i < array_count.length; i++) {
			array_count[i] = i+1;
			list_count.add(i+1); // XXX.add(int); - �ʱ�ȭ���ִ� �Լ�. add�� �� �� ����� �� ���� �ּҰ� 1�� ������
			// ex) list_count.add(18); => list_count.get(0) = 18 (value), list_count.size() = 1 (address)
		}
		
		// ���� �ǹ̰� ���� �͵� 
		System.out.println(array_count.length);
		System.out.println(list_count.size()); // length ���� �Լ�. �� for������ add�� 0~8���� 9�� ���ұ� ������ 9 ��µ�.
		
		System.out.println(array_count[0]);
		System.out.println(list_count.get(0)); // index�� value�� ���� �Լ�. �� for������ add�� 0~8���� 9�� ���� ���� i+1�� �ʱ�ȭ����� ������ ���⼭�� 1 ��µ�.
		
		for (int i = 0; i < list_count.size(); i++) {
//			System.out.println(array_count[i]);
//			System.out.println(list_count.get(i));
		}
		
		System.out.println("------------");
		// ���� Ÿ�����غ���
		int[] a = new int[10];
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
			b.add((i+1)*10);
		}
		
		System.out.println("a.length : "+a.length);
		System.out.println("b.size() : "+b.size());
		
		System.out.println("a[0] : "+a[0]);
		System.out.println("b.get(0) : "+b.get(0));
		
		for (int i = 0; i < b.size(); i++) {
//			System.out.println("array : "+a[i]);
//			System.out.println("ArrayList : "+b.get(i));
		}
		
		// remove
		// XXX.remove(int n) : n��° index�� �ִ� ���� ����.
		System.out.println("b.size() before remove : "+b.size()); // 10
		b.remove(0);
		System.out.println("b.size() after remove : "+b.size()); // 9
		System.out.println("b.get(0) after remove 0 : "+b.get(0)); // b(0)�� ���̾��� 10�� ������ 20 ��µ�.
		
		// ���ڱ� �ñ�����
		int size = 10;
		int[] size_array = new int[size];
		System.out.println("size_array.length before : "+size_array.length);
		size = 20;
		System.out.println("size_array.length after : "+size_array.length); // int[size]���� size���� �ٽ� �ʱ�ȭ���شٰ� �ص� �迭�� length�� ����������
		size_array = new int[size];
		System.out.println("size_array.length re : "+size_array.length); // �迭�� �ٽ� �ʱ�ȭ���ָ� length�� �׿� �°� ����
		
		// arraylist�� ���� Ÿ���� ������ �������� ���� ����
		int a_int = b.size();
		System.out.println("b.size() : "+b.size());
		System.out.println("a_int : "+a_int);
		
		// �迭 �� ��� value�� remove�غ��� ����
		int[] arr_i = new int[100];
		ArrayList<Integer> arr_l = new ArrayList<Integer>();
		
		for (int i = 0; i < arr_i.length; i++) {
			arr_l.add(i+1);
		}
		
		for (int i = 0; i < arr_i.length; i++) {
			System.out.println("arr_l : "+arr_l.get(i));
		}
		
		for (int i = 0; i < arr_i.length; i++) {
			int m = arr_l.remove(i);
			i--;
			System.out.println("removing.. "+m);
			
			if (arr_l.size() == 0) {
				System.out.println("arr_l.size() : "+arr_l.size());
				break;
			}
		}
		// ���� ������ ���ε� int m = arr_l.remove(i); ���� for�� �������� �κ��� �׳� int m = arr_l.remove(0); ���� ���൵ ��.
		
		// �����ߴ� ���� list�� �غ��� ����
		// �� �غ���� �س��� �������
		System.out.println();
		System.out.println("����");
		System.out.println();
		
		String text = "ǥ������ ������ ���� ��������� ������ �����µ�, ���� ������ ���� ǥ������ ��������� �����ϴ� ���� ���׸����Ƕ�� �ϰ� ��������� ���� ������ ǥ��� �̿��ϴ� ���� ���׸����Ƕ�� �Ѵ�.";
		char[] text_char = text.toCharArray();
		ArrayList<Character> text_list = new ArrayList<Character>();
		char[] index_char = {'��','��','��','��','��'};
		
		for (int i = 0; i < index_char.length; i++) {
			text_list.add(index_char[i]);
		}
		
		String[] answer = new String[text_list.size()];
				
		for (int i = 0; i < answer.length; i++) {
			answer[i] = "";
		}
		
		for (int i = 0; i < text_char.length; i++) {
			for (int j = 0; j < text_list.size(); j++) {
				if (text_char[i] == text_list.get(j))
					answer[j] += text_list.get(j);
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if (answer[i].length() < answer[j].length()) {
					String temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		System.out.println();
		
		// �о�� add �ϱ� -> XXX.add((Index), (Value));
		ArrayList<Integer> new_list = new ArrayList<Integer>();
		new_list.add(100);
		System.out.println("new_list.get(0) before : "+new_list.get(0)); // 100
		new_list.add(0, 200);
		System.out.println("new_list.get(0) after : "+new_list.get(0)); // 200
		System.out.println("��ü ���� : "+new_list); // [200, 100]
		
		// ġȯ add�ϱ� -> XXX.set((Index), (Value));
		// �� add( , )�� �ڱⰡ ���ڸ��� ���� �������� �ڷ� �ϳ��� ������ set�� ���� Index�� �ִ� value�� ���ְ� �ڱⰡ �� �ڸ��� ��.(�ڷ� ���� ����)
		new_list.set(0, 2000);
		System.out.println("before : [200, 100], after : "+new_list); // [2000, 100]
		
		// all remove -> XXX.clear();
		new_list.clear();
		System.out.println("after clear : "+new_list); // []
		
		
		
	}

}
