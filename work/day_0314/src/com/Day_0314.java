package com;

public class Day_0314 {
	
	static int a;

	public static void main(String[] args) {
		
		// ���͵�ī�� �ͼ� �����Ѱ� ����
		// method : �Լ�. (ex. public static void asdf() { ��� ������� �����ϸ� asdf �κ��� �޼ҵ��� ��)
		
		test();
		System.out.println(test2(1));
		
		// ����������
		// public : ��ü ����, protected : ���� ��Ű�� �̳�, ��ӹ��� Ŭ���� ���� ���, default : ���� ��Ű�� �̳��� ���, private : �ش� Ŭ���� �������� ���
	}
	
	// �� �ñ����� void : return���� ������ �ǹ��Ѵٴµ�
	static void test() {
		System.out.println("����"); // �� ��µǴ� ����
	}
	
	static int test2(int n) {
		return n; // ���� ��µǴ°� �ٸ����ΰ�? �� ��¾ȵ��� �ù�?
		// return�� ���ʿ� print��� ��ɰ� �ٸ��� test2()��� �޼ҵ带 �ϳ��� ������ ���� �� ������ �������ִ� ����.
		// �ؼ� test2(1)�� '���'�ϱ� ���ؼ��� �׳� test2(1); �� ���� �ƴϰ� syso�� �������� �Ѵ�.
	}

}
