package com;

public class Day_0302_a {

	public static void main(String[] args) {
		
		// ����
		// �ּҺ�
		
		String text = "�����ٶ󸶹ٻ������īŸ����";
		
		String[] text_s = text.split("");
		char[] text_c = text.toCharArray();
		
		if (text_s[0] == "��") {
//			System.out.println("String_true"); // ����Ÿ���� == ���� �ּ� �� (heap �Ҵ�)
		}
		if (text_c[0] == '��') {
//			System.out.println("char_true"); // �⺻Ÿ���� == ���� value�� �� (stack �Ҵ�)
		}
		
		// �˻� �ܾ ������ ������ ���� ��� ó���ؾ� ���� �����غ��� ����
		// �� ǯ
		String example = "ǥ������ ������ ���� ��������� ������ �����µ�, ���� ������ ���� ǥ������ ��������� �����ϴ� ���� ���׸����Ƕ�� �ϰ� ��������� ���� ������ ǥ��� �̿��ϴ� ���� ���׸����Ƕ�� �Ѵ�.";
		char[] ch = example.toCharArray();
		char[] ch2 = {'��', '��', '��', '��', '��', '��', '��', '��', '��', 'ǥ'};
		String[] string_text = new String[ch2.length];
		
		for (int i = 0; i < string_text.length; i++) {
			string_text[i] = ""; // null �� �ȶ߰� �ϱ�
		}
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if (ch2[j] == ch[i])
				string_text[j] += ch2[j];
			}
		}
		
		// ����
		for (int i = 0; i < string_text.length; i++) {
			for (int j = 0; j < string_text.length; j++) {
				if (string_text[i].length() < string_text[j].length()) {
					String temp = string_text[i];
					string_text[i] = string_text[j];
					string_text[j] = temp;
				}
			}
		}
		// ������ �������� ���� (if ���� ��ȣ ���� �ٲٸ� ��������)
		
		for (int i = 0; i < string_text.length; i++) {
			System.out.println(string_text[i]);
		}	
		
	}

}
