package day_0225;

public class Day_0225_a {
	
	static int count; // 4byte. stack�� �Ҵ�

	public static void main(String[] args) {
		
		// �⺻Ÿ�� int, short, long, float ���� stack�̶�� ������ �Ҵ����. �ӵ� ���� (�ݹ��Լ� main�� stack�� �Ҵ����)
		// ���������� �ݹ��Լ����� �켱������ ����(�ݹ��Լ����� ���� �Ҵ����. �� main�Լ��� ������ �� ������ �����ص� ���⼭ �������� ��� ����)
		// ������ ����Ÿ���� heap�̶�� ������ �Ҵ����. �ӵ� ����
		
		// stack�� Last In First Out (lifo) <-> queue�� First In First Out (fifo)
		
		int num = 1919;
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
