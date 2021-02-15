package com;

public class Day_0215 {

	public static void main(String[] args) {
		
		// ���Կ����� +=, -=, *=, /=
		int a = 1;
		a += 1; // ���� ����� a ���� += �ڿ� ���� ���� ���Ѵ�. �� ��쿡�� ex) a += 3;�̸� a = 4. -=, *=, /=, %=(������) ��� ��������
		System.out.println(a); // 2
		
		// �񱳿�����(��������) >, <, >=, <= (* �ε�ȣ�� �տ� �;���. =>, =< : X ), !=(Ʋ����), ==(����)
		// cf. boolean
		System.out.println(4>3); // true
		System.out.println(4<3); // false
		System.out.println(4>=4); // true
		System.out.println(4!=3); // true
		System.out.println(4==4); // true
		
		// ���� �� ������ && (and, �� ��), ||(or, �� �� �ϳ�), &, | (��Ʈ �������ε� �Ŀ� �ٷ� ����)
//		System.out.println(true && false);
//		System.out.println(true && true);
		System.out.println(4>3 && 3>4); // false. && ������ ��� �� ���װ� ���� �� �� true ���� true ����. �� �� �ϳ��� false ��� false ����
		System.out.println(4>3 && 5>4); // true
		System.out.println(4>3 || 3>4); // �ݸ鿡 || �����ڴ� �� �� �ϳ��� true ��� true ����
		System.out.println(3<=3 && 3>=3 && 3>2); // �������� ����
		System.out.println((3>2 && 2>1) && 5>4); // ������ �ٲ۴ٰų� �ϰ������ () �� ����
		
		// ���� ���� : xx, ���� : xx �̷������� ǥ���غ��� ����
		System.out.printf("%s%b\n%s%b\n%s%b\n", "���� : 3>2 ", 3>2, "���� : 5>4 ", 5>4, "3>2 && 5>4 = ", 3>2 && 5>4); // ���� �����ؼ� �غ� ��
		
		// �޼ҵ带 ����� �ش�
		System.out.println(left_bool() && right_bool()); // ���� �� println�� �ִ� main �Լ� �ۿ��� ������ left_bool, right_bool�� ���Ե�. && �����ڿ��� ������ false��� ������ ��� �� �ʿ䰡 ���� ������� ����.
		System.out.println(left_bool() || right_bool()); // || �������� ��쿣 ������ true�� �� ������ �ʿ䰡 �������Ƿ� ��µ��� �ʰ� true ��ȯ.
		System.out.println(true || true && false); // true�� ������ ������ &&, || �����ڰ� ���� �� ���� �պ��� �о�� �ڸ� ��ȣ�� ���� �� ó�� ó���ϹǷ� �� ��� true || (true && false) �� ����ؼ� true ��ȯ��.
		System.out.println("----");
		System.out.println(right_bool() || left_bool() && right_bool()); // ù ���� false �� �� ���� ���� �����ϴµ� ��� ó���Ѵٰ� �����Ƿ� "���� :", "���� :" �� ��µǾ� ��: ��: ��: false�� ����
		System.out.println("----");
		System.out.println(left_bool() && right_bool() || left_bool()); // ���⼭�� ���� true���� && �� �ڵ� �����ϹǷ� ������ || ���� ù�� false�̹Ƿ� �� �� �� ���� �о��.
		// ���� ��: ��: ��: true.

	}
	
	static boolean left_bool() {
		System.out.println("���� : true");
		return true;
	}
	
	static boolean right_bool() {
		System.out.println("���� : false");
		return false;
	}

}
