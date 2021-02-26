package com;

public class Day_0226_a {
	
	static String text = "abcde";

	public static void main(String[] args) {
		
		// substring
		String a = "hello".substring(1); // String�� �����ε���(���⼱ 1) ������ �߶� �������� �Լ�. �����ε��� ������
		System.out.println(a); // substring���� 1�� ��. 1�� �ش��ϴ� ���� e �̹Ƿ� e ���� h�� �߸�. ������� ello
		
		String b = "hello".substring(1, 4); // String�� �����ε������� �����ε������� �ڸ��� �Լ�. �����ε��� ������. ���� �ε����� �������� ����
		System.out.println(b); // ell
		
		// for���� String�� ����Ͽ� char[]�� ���� ���� ���ϰ����� ó���ϱ� ���� (toCharArray ���x)
		// �� ǯ
		// �ƴϱٵ� toCharArray2���� n�� 0, 1, 2�϶� ���� ���� �� ������µ� �׷��� ���⼭ String�� ��� ���ΰ���? String�� �ǹ̰� ���ݾ� �ù�
		// String�� char�� ��ȯ�ϵ� toCharArray�� �����ʴ� ��â�� ����� �ִ��� �˰� ��� �����ϰ��־��µ� ���� �׵��� ������ �̰� ���Ѱ��� 1�� ���ؾȵ�
		char[] d = toCharArray2();
		System.out.println(d);
		
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		// (String).charAt(index)
		char aa = text.charAt(0);
		System.out.println(aa); // String�� index ��°�� ��ġ�� character�� ������ִ� �Լ� 
		
		// String[] x = (String a).split("(String b)");
		String[] bb = text.split("c");
		System.out.println(bb[0]); // ab
		System.out.println(bb[1]); // de
		// (String a)���� "(String b)" �� ������ ������ ������ �迭�� �Է��ϴ� �Լ�.
		// ������ c�� ���ػ�ұ� ������ �迭�� 2���� ���� �Էµ�. (ab / c / de)
		// ���� "(String b)"�� (String a)�� ���ٸ� (String a) ��ü�� ������.
		// "(String b)" �� ""�� �Է��ϸ� (String a)�� ������ ���� �ϳ��ϳ��� ©�� �迭�� �Է��� ex) "abcde".split(""); => a, b, c, d, e
		
		// split ����
		System.out.println("split����");
		String[] test_split = "ab;cd;ef;gh".split(";");
		System.out.println(test_split.length); // ab, cd, ef, gh�� 4.
		for (int i = 0; i < test_split.length; i++) {
			System.out.println(test_split[i]); // 0 : ab, 1 : cd, 2 : ef, 3 : gh
		}
		
		String[] test_split2 = "abcdefa".split("a");
		System.out.println("����?"+test_split2[0]); // "" ��µ�
		
		// String x = (String a).strip();
		String a_strip = " abc ".strip();
		System.out.println("����"+a_strip+"����"); // (String a)�� �� �ڿ� �ִ� ����(" ")�� �����ִ� �Լ�
		
		String a2_strip = " a b c ".strip();
		System.out.println(a2_strip); // �� ��, �� �ڸ� ������
		
		// (String a) = (String a).replace('a', 'b');
		// String a ���� 'a'�� 'b'�� ġȯ�ϴ� �Լ�
		String a_replace = "hello";
		a_replace = a_replace.replace('h', 'p');
		System.out.println(a_replace); // pello ���
		
		// toUpperCase, toLowerCase
		// (String a) = (String a).toUpper(Lower)Case();
		// (String a)�� ���� Upper�� ��� �빮�ڷ�, Lower�� ��� �ҹ��ڷ� �ٲ��ִ� �Լ�
		String a_case = "hi im noob";
		a_case = a_case.toUpperCase();
		System.out.println(a_case); // HI IM NOOB
		a_case = a_case.toLowerCase();
		System.out.println(a_case); // hi im noob
		
		a_case = "Hi Im Noob";
		a_case = a_case.toUpperCase();
		System.out.println(a_case); // �����־ ���� �빮�ڷ�
		
		// �������� '��', '��', '��', '��' ���� ���� ���� ���� ������� String �迭�� �־ ����ϱ� ����
		// ��ǯ
		String example = "ǥ������ ������ ���� ��������� ������ �����µ�, ���� ������ ���� ǥ������ ��������� �����ϴ� ���� ���׸����Ƕ�� �ϰ� ��������� ���� ������ ǥ��� �̿��ϴ� ���� ���׸����Ƕ�� �Ѵ�.";
		String[] answer = new String[example.length()];
				
		for (int i = 0; i < example.length(); i++) {
			if (example.charAt(i) == '��') { 
				answer[i] = "��";
			}
			else if (example.charAt(i) == '��') {
				answer[i] = "��";
			}
			else if (example.charAt(i) == '��') {
				answer[i] = "��";
			}
			else if (example.charAt(i) == '��') {
				answer[i] = "��";
			}
			else if (example.charAt(i) == '��') {
				answer[i] = "��";
			}
		}
				
		for (int i = 0; i < answer.length; i++) {
//			System.out.println(answer[i]);
		}
		
		// ���� �� �õ�
		System.out.println();
		System.out.println("���� ��");
		System.out.println();
		
		String[] answer2 = new String[5];
		
		for (int i = 0; i < answer2.length; i++) {
			answer2[i] = "";
		}
		
		char[] ch = example.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '��') {
				answer2[0] += ch[i];
			}
			else if (ch[i] == '��') {
				answer2[1] += ch[i];
			}
			else if (ch[i] == '��') {
				answer2[2] += ch[i];
			}
			else if (ch[i] == '��') {
				answer2[3] += ch[i];
			}
			else if (ch[i] == '��') {
				answer2[4] += ch[i];
			}
		}
		
		for (int i = 0; i < answer2.length; i++) {
			System.out.println(answer2[i]+" : "+answer2[i].length());
		}
				
		for (int i = 0; i < answer2.length; i++) {
			for (int j = 0; j < answer2.length; j++) {
				if (answer2[i].length() > answer2[j].length()) {
					String temp = answer2[j];
					answer2[j] = answer2[i];
					answer2[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < answer2.length; i++) {
			System.out.println(answer2[i]+" : "+answer2[i].length());
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
