package day_0225;

public class Day_0225_a {
	
	static int count; // 4byte. stack�� �Ҵ�

	public static void main(String[] args) {
		
		// �⺻Ÿ�� int, short, long, float ���� stack�̶�� ������ �Ҵ����. �ӵ� ������ �뷮 ���� (�ݹ��Լ� main�� stack�� �Ҵ����)
		// ���������� �ݹ��Լ����� �켱������ ����(�ݹ��Լ����� ���� �Ҵ����. �� main�Լ��� ������ �� ������ �����ص� ���⼭ �������� ��� ����)
		// ������ ����Ÿ���� heap�̶�� ������ �Ҵ����. �ӵ� ������ �뷮 ŭ
		// new�� ���� �⺻Ÿ���̶� heap �� ������ �Ҵ��Ŵ
		
		// stack�� Last In First Out (lifo) <-> queue�� First In First Out (fifo)
		
		count = 1919;
		System.out.println(count);
		System.out.println(count2); // ���������� �켱������ �� ���� ������ count2�� �� �Ʒ� �־ ���⼭ ��� ����
		
		test(); // test�Լ����� main�Լ��� ���� �Ҵ����
		// �� �ٿ� ���� test()�� �Ҵ��� ����
		
		int[] array = new int[3];
		int[] array2 = new int[3];
		// int�� ���� stack�� �Ҵ�� �� new�� ��������� ���� heap�� 3��ŭ �Ҵ�ǰ� ��.
		
		System.out.println(array);
		System.out.println(array2);
		
		array2 = new int[3];
		
		System.out.println(array2); // new�� �ٽ� ����� ������ �ּҰ� �޶���. 
		
		// �迭 value������ �̷������� ���� �� �� ����
		int[][] array_2 = new int[2][];
		array_2[0] = new int[] {30, 50};
		array_2[1] = new int[] {40, 60};
		
		System.out.println(array_2[0][0]); // 30
		System.out.println(array_2[1][1]); // 60
		
		String name = "helloworld";
		String name2 = "helloworld"; // ��� name�̶� �ּҺ��ϸ� true. �׳� �̷��� �����ϸ� java���� �ڵ����� heap���� ���� ���� �ֳ� ã�ƺ��� ���ٸ� ���� �ּҸ� �Ҵ�����
		String name3 = new String("helloworld"); // ��� new�� �Ἥ ������ heap ���� ���ο� ������ �Ҵ��߱� ������ �ּҰ� �ٸ�. �׷��� false
		
		// �ּ� ��
		if (name == name3)
			System.out.println("true");
		else
			System.out.println("false");
		
		name2 = name3; // �ּ� ���ϸ� true����.
		
		if (name2 == name3)
			System.out.println("true");
		else
			System.out.println("false");
		// ����Ÿ���� �� �����ڸ� ����ϸ� �ּҸ� �������� value type (ex. int, float ��)�� value�� ����(�ּҰ� ������ ���� �Ҵ��)
		
		// value ��
		System.out.println(name3.equals(name)); // value�� ���ϴ� �Լ� xxx.equals() -> boolean���� ��µ�. ���� true
		
		// String�� �迭�� �̿��� char�� ��Ÿ�� �� ����
		char[] ch = name3.toCharArray();
		System.out.println(ch.length); // "helloworld" �� ������ 10
		for (int i = 0; i < ch.length; i++) {
//			System.out.println(ch[i]);
		}
		
		// 2���迭, for�� ����Ͽ� ������ 2��~9���� ���İ� ������� ��� ���ڿ��� �����ϱ� ����
		System.out.printf("\n%S\n\n", "������ ����");
		String[][] print = new String[8][9];
		String[] gugudan = new String[72];
		int count = 0;
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				gugudan[count++] = i+"*"+j+"="+(i*j);
			}
		}
		
		count = 0;
		
		for (int i = 0; i < print.length; i++) {
			for (int j = 0; j < print[i].length; j++) {
				print[i][j] = gugudan[count++];
//				System.out.println(print[i][j]);
			}
		}

		// String 2�� �迭�� ������ char[][]�� �ֱ� ����
		// �� Ǯ���µ� ���� �Ⱦ˷��� �ù߹���
		char[][] chgugu = new char[8][];
		
		for (int i = 0; i < print.length; i++) {
			for (int j = 0; j < print[i].length; j++) {
				chgugu[i] = print[i][j].toCharArray(); // ���⼭ chgugu[i]�� print[i][j]�� ���Ե� �� ��������� j�� ������ ���� *9�� ��µǴ� �� ����. ��������� �ʰ� �����ϴ� ���� ã�ƾ� �ҵ�
			}
		}
		
		for (int i = 0; i < chgugu.length; i++) {
				System.out.print(chgugu[i]);
				System.out.println();
		}
		
		}
			
	
	static void test() {
		int test_num = 1919;
		System.out.println(test_num);
		test2();
		// �� �ٿ� ���� test2()�� �Ҵ��� ����. ������ test()�� �ؿ� ���� �� ���������Ƿ� �Ҵ� ���� �ȳ���
		System.out.println("��������");
	}
	
	static void test2() {
		int test_num2 = 19;
		System.out.println(test_num2);
	}
	
	static int count2 = 1;

}
