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
		
		
	}

}
