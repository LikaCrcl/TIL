package day.com;

import java.util.Scanner;

public class Day_0216 {

	public static void main(String[] args) {
		
		// ����������
		int a = 1;
		int b = a++; // a�� ������ ����Ǿ� ���� ȣ��Ǵ� a�� 2��
		
		System.out.println(b); // ������ ������ a++ �� ������ a�� ȣ������� �ʾұ� ������ 1 ���
		System.out.println(a+b); // a=2, b=1
		System.out.println(b); // a�� ���� �������� b�� ������ ������ �� ������ ��������
		
		b = ++a; // a�� 2���� ���� �����
		
		System.out.println(b); // 3
		
		double c = Math.random()+10;
		System.out.println(c);
		 
		long d = (long) (Math.random()*100);
		System.out.println(d);
		
		System.out.println(Math.round(3.50)); // �ݿø�
		System.out.println(Math.PI);
		System.out.println(Math.abs(-100)); // ����
		System.out.println(Math.floor(3.14)); // �Ҽ��� ���� ����
		System.out.println(Math.floor(-2.1)); // ������ ������ �� �۾����Ƿ� -3.0�� ����. �ø�? �̶�� �����ϸ� ���ҵ�
		
		// ��� - ���ǹ�(if��, switch��), �ݺ���(for��, while��)
		// if��		 
		// �⺻ ���� : if(���� (ex 3>2 ��)){}
		// ������ true��� �߰�ȣ �� �ڵ带 �а�, false��� �߰�ȣ�� ���� �ʰ� �ǳʶڴ�.
		if (4>3) {
			System.out.println("��ȭ����");
		}
		
		if (4>2)
			System.out.println("����"); // if�� �ȿ��� �ϰ���� �ൿ?�� �� �� �϶��� {}�� ������ �� �ִ�.
		
		if (3<2)
			System.out.println("��"); // false�� ��� ��� �ȵ� ({} ����)
			System.out.println("��2"); // if (3<2)�� ���ԵǴ� ���� �ƴ� �������� print
			
		if (4>3 != 4>3)
			System.out.println("����"); // ��� �ȵ�
		else // if�� ������ false�� �� ���� �ϰ� �ʹٸ� else
			System.out.println("����"); // �굵 �����̸� {} ���� ����
		
		// if���� ������ ���� ������ else if (true�� ���� ���� �� �Ʒ��� ���õǴ� ���� || �������� ������ ����)
		if (false) { // ���Ⱑ true���ٸ� �� ���� else if���� �ǹ� ������
			System.out.println("ù° ���� ����");
		}
		else if (false) { // ���⵵ true������ �ؿ� ����
			System.out.println("��° ���� ����");
		}
		else if (true) {
			System.out.println("��° ���� ����"); // �길 ��µ�
		}
		
		// ������ 100���� ��, 90�̻� 100�̸��϶�, 90�̸��� �� ���� ����ϴ� ����

		// ������ ���� �ڵ�
		int score=90;
		// ��ĳ�ʸ� �� ���� ����
//		Scanner sc = new Scanner(System.in);
//		int score;
//		
//		System.out.print("���� �Է�(���ڸ� �� ��) : ");
//		score = sc.nextInt();
		
		if (score == 100) {
			System.out.println("100��");
		}
		else if (score >= 90) {
			System.out.println("90�� �̻� 100�� �̸�");
		}
		else {
			System.out.println("90�� �̸�");
		}
		
		// ��ø if��
		// ������ 100���̸� 100���̴� ���, 100�� �ƴѰ� �ƴ� ���� ���
		int kor=20;
		int eng=60;
		int math=100;
		
		if (kor == 100) {
			if (math == 100) {
				if (eng == 100) {
					System.out.println("���� 100��");
				}
				else {
					System.out.println("�� �� : 100, ���� : "+eng);
				}
			}
			else if (eng == 100) {
				System.out.println("�� �� : 100, ���� : "+math);
			}
			else {
				System.out.println("���� : 100, ���� : "+eng+", ���� : "+math);
			}
		}
		else if (math == 100) {
			if (eng == 100) {
				System.out.println("�� �� : 100, ���� : "+kor);
			}
			else {
				System.out.println("���� : 100, ���� : "+kor+", ���� : "+eng);
			}
		}
		else if (eng == 100) {
			System.out.println("���� : 100, ���� : "+kor+", ���� : "+math);
		}
		else {
			System.out.println("���� : "+kor+", ���� : "+eng+", ���� : "+math);
		}
		
		// ¦Ȧ�ǵ���
		int num = 10;
		
		if (num%2 == 0) { // % : ������ ������
			System.out.println("¦���Դϴ� "+num);
		}
		else {
			System.out.println("Ȧ���Դϴ� "+num);
		}
		
		// switch ���ǹ�
		int num2 = 3;
		
		switch (num2) { // num2 �ڸ����� String, int�� �� �� ����.
			case 1:
				System.out.println("1 : "+num2);
				break; // break; �� ������ �ش��ϴ� ���� ���� ������� �����.
			case 2:
				System.out.println("2 : "+num2);
				break; // ���� num2 = 2 ���� break; �� �����ٸ� �ֿܼ��� 2 : 2, 3 : 2, 4 : 2, 5 : 2 �� ���� ��µ��� ����.
			case 3:
				System.out.println("3 : "+num2);
				break; // ��ü�� break;�� ��������� �� ���� ��쵵 �ֱ���.
			case 4:
				System.out.println("4 : "+num2);
				break;
			case 5:
				System.out.println("5 : "+num2);
				break;
		}
		
		

	}
}
