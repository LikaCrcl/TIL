package com.com; // com ���� �ȿ� com ���� �ϳ� �� �������(Package Explorer Ȯ��)
// ��Ŭ���� ȭ�� ���� Package Explorer ���� ��� �� ���� Ŭ�� �� Package Presentation �ɼ� �ٲٸ�
// ��Ű�� �ͽ��÷η� ���� ��� ���� ����

public class Hello {

	public static void main(String[] args) {
		
		System.out.println(); // syso ġ�� Ctrl + Space
		System.out.println(3+3); // +, -, *, / <- ������
		System.out.println(3-3);
		System.out.println(3*3);
		System.out.println(3/3); // ��� ����(Run) �ϰ������ �� �ʷ� �����ư Ŭ�� or Ctrl + F11
		// ��������� : + - * / ��
		// ���Կ����� : =
		// �������� : >, <, >=, <=, != (�񱳿�����. ?)
		// ���迬���� : &&, ||, &|
		
		int num_0 = 3; // ���⼭ num_0�� num_1�� ����(Variable).
		int num_1 = 3;
		
		System.out.println(num_0+num_1);
		
		num_0 = 6; // ������ ������ �ٲ� �� ����
		
		System.out.println(num_0+num_1);
		
		final int COUNT_NUM = 300; // COUNT_NUM �� �տ� final�� ���� ����� �����. ����� �빮�ڷθ� �����(������ ���� ���)
		// �� ���ķ� COUNT_NUM = 200; �� �� �� ����
		
		System.out.println("10%2 : " + 10%2); // % : ������ ������(��� �����ڿ� ���Ե�). ���� �ڷ� ������ �� �������� ǥ������
		
		// ���������� : ++, -- <- ������ 1�� ���ϰų� ���� �� ���·� ����. ex) n=1; n++=2; n=2; 
		// �����ڰ� �տ� ���� ����, �ڿ� ���� ����. ex) ++m : ����
		int m = 3;
		int n = m++; // �� �� m�� 4�� ������ ������ ���� ��쿣 m�� n�� ���� �����ϰ� ������ �̷����
		int l = ++m; // 4�� �ƴ� m�� �ٽ� 5�� �ư� �����ڰ� ������ �ͼ� ���� ��Ų �� ���ԵǱ� ������ l�� 5�� ��
		
		System.out.println("n : " + n);
		System.out.println("l : " + l);
		
		
	}

}
