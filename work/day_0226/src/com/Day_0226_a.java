package com;

public class Day_0226_a {
	
	static String text = "abcde";

	public static void main(String[] args) {
		
		// substring
		String a = "hello".substring(1); // String�� �����ε���(���⼱ 1)���� �߶� �������� �Լ�
		System.out.println(a); // substring���� 1�� �����Ƿ� ������� ello
		
		String b = "hello".substring(1, 4); // String�� �����ε������� �����ε������� �ڸ��� �Լ�
		System.out.println(b); // ell
		
		// for���� String�� ����Ͽ� char[]�� ���� ���� ���ϰ����� ó���ϱ� ����
		// �� ǯ
		// �ƴϱٵ� toCharArray2���� n�� 0, 1, 2�϶� ���� ���� �� ������µ� �׷��� ���⼭ String�� ��� ���ΰ���? String�� �ǹ̰� ���ݾ� �ù�
		// String�� char�� ��ȯ�ϵ� toCharArray�� �����ʴ� ��â�� ����� �ִ��� �˰� ��� �����ϰ��־��µ� ���� �׵��� ������ �̰� ���Ѱ��� 1�� ���ؾȵ�
		char[] d = toCharArray2();
		System.out.println(d);
		
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		
		
	}
	
	static char[] toCharArray2() {
		char[] n = new char[text.length()-2];
		n[0] = 'a';
		n[1] = 'b';
		n[2] = 'c';
		return n;
	}

}
