package com;

import java.util.ArrayList;

public class Day_0304_a {

	public static void main(String[] args) {
		
		// ArrayList ����
		java.util.ArrayList<Integer> arr = new java.util.ArrayList<Integer>(); // import ���ϰ� �̷��� �ᵵ ���� ����.
		arr.add(100);
		System.out.println("integer remove(0) : "+arr.remove(0)); // Integer list���� remove(x) �� �ϸ� x��°�� �ִ� ������ value�� �������
		
		ArrayList<String> list_string = new ArrayList<String>();
		list_string.add("hello");
		System.out.println("string remove \"hello\" : "+list_string.remove("hello")); // String list������ ���� value�� ���� ������� boolean�� �������� ��µ�.
		// remove ���� ���� �ȴٸ� true, ��ġ�ϴ� value�� ���� remove�� ������ �� ������ false ��µ�
		list_string.add("nimi");
		System.out.println("string remove(0) : "+list_string.remove(0)); // index�� remove �ϸ� �ش� index�� value�� ������ 
		
		System.out.println();
		
		list_string.add("hello");
		list_string.add(null);
		list_string.add("hello");
		System.out.println("before remove hello : "+list_string); // hello, null, hello
		list_string.remove("hello");
		System.out.println("after remove hello : "+list_string); // null, hello ���. �ߺ��Ǵ� value�� �ִٸ� ���� ���� �ͺ��� remove��
		
		// XXX.contains("String"); = true / false
		System.out.println("list_string.contains(\"hello\") : "+list_string.contains("hello")); // XXX ��� ArrayList���� "String"�� �ִ��� ������ �˾Ƴ��� �Լ�.
		
		// cf) equals
		System.out.println("list_string.equals(\"hello\") : "+list_string.equals("hello")); // false
		
		ArrayList<String> list_string2 = new ArrayList<String>();
		list_string2.add(null);
		list_string2.add("hello");
		System.out.println("list_string.equals(list_string2) : "+list_string.equals(list_string2)); // true
		// list ������ value�� ������ ��ġ�ؾ� true ��ȯ��. contains�ʹ� �ٸ�
		// String �񱳿����� ���������� == �� ���ϸ� �ּ�, equals�� ���ϸ� value�� ����
		
		System.out.println();
		// ���� ����
		ArrayList<String> test = new ArrayList<String>();
		test.add("world");
		test.add("hello");
		test.add("world");
		test.add("test");
		
		ArrayList<String> test2 = new ArrayList<String>();
		test2.add("hello");
		
		System.out.println("test.contains(test2) before : "+test.contains(test2)); // false
		
		System.out.println("test.contains(test2) after : "+test.contains(test2.get(0))); // true
		// contains �ڿ� list�� ������ �����ϰ� ���ϴµ�. value�� �־���� ���ϴ� ���� ����
		
		System.out.println();
		// ������
		// ������ �ߴ��� �ٽ��غ���
		int[][] array_2 = new int[8][9];
		
		for (int i = 0; i < array_2.length; i++) {
			for (int j = 0; j < array_2[i].length; j++) {
				array_2[i][j] = (i+2)*(j+1);
			}
		}
		
		for (int i = 0; i < array_2.length; i++) {
			for (int j = 0; j < array_2[i].length; j++) {
//				System.out.println((i+2)+"*"+(j+1)+"="+array_2[i][j]);
			}
		}
		
		// ArrayList�� �غ���
		ArrayList<Integer> gugudan = new ArrayList<Integer>();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				gugudan.add((i+2)*(j+1));
			}
		}
		
		int num = 0;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.println((i+2)+"*"+(j+1)+"="+gugudan.get(num++));
			}
		}
		
	}

}
