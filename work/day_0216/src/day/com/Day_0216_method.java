// if�� ���� �� �ٸ������ �� �ڵ�
package day.com;

import java.util.Scanner;

public class Day_0216_method {

	public static void main(String[] args) {
		
		String subs = sub();
		String socs = soc();
		System.out.println(subs+socs);

	}
	
	static String sub() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		String sub_ins = sc.next();
		return sub_ins+"������ ������ ";	
		// "������ �Է��ϼ��� : " ������ ��ĳ�� �־ �Է��ϰ� �� ���ϰ��� �ȳ����� �����غôµ�
		// �̷��� �Լ��� �ҷ����� ���� ���� �ٸ� �Լ��� �� ó���ϰ� �������� �����µ�?
	}
	
	static String soc() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		String soc_ins = sc.next();
		return soc_ins+"�� �Դϴ�.";
		
	}
	
}
