package com;

import com.inter.Table;
import com.service.Animal_service;
import com.service.House_service;
import com.sm.House_sm;

public class Day_0319_a {

	public static void main(String[] args) {
		
		// ���
		Sangsu sangsu = new Sangsu();
		
		sangsu.num = 300;
		sangsu.score = 300;
		System.out.println("sangsu : "+sangsu.score);
		System.out.println("sangsu num : "+sangsu.num);
		
		Sangsu sangsu2 = new Sangsu();
		System.out.println("sangsu2 : "+sangsu2.score); // sangsu2���� �ʱ�ȭ ������µ��� 300 ���
		System.out.println("sangsu2 num : "+sangsu2.num);
		
		sangsu2.score = 600;
		
		System.out.println("sangsu : "+sangsu.score); // sangsu2���� �ʱ�ȭ ������µ� sangsu���� ����ص� 600 ��µ�
		System.out.println("class : "+Sangsu.score); // class���� ���� ��½��ѵ� sangsu2���� �ʱ�ȭ�� �� ���
		// �������� new�� ���� �����ϴ� ������ �ٲ� �� ������ static�� ����� ����� new�� ����ϴ��� �׻� ���� ������ �����ϰ� �ֱ� ������ ���� ���� ����� �����
		// ���� static�� ��ü�� ���� ����غ��� �ǹ̰� ����. �׸��� ��𼭵� ���� �����ؼ� �������� �׸�ŭ ���̴ٴ� ���� ����. ���� X
		System.out.println();
		// db service / interface
		House_service house = new House_service();
		// �Ʒ��� ��¹��. �� ���� ��� �� ��Ȳ�� ���� ��1
//		house.a();
		
//		for (int i = 0; i < house.GetArrayList().size(); i++) {
//			System.out.println(house.GetArrayList().get(i));
//		}
		
//		for (int i = 0; i < house.GetArray().length; i++) {
//			System.out.println(house.GetArray()[i]);
//		}
		
		// animal�� ����
		// �ּҷθ� ���ͼ� �ָԾ��µ� sm���� source�� toString �������
		Animal_service animal = new Animal_service();
		animal.a();
		
//		for (int i = 0; i < animal.GetArrayList().size(); i++) {
//			System.out.println(animal.GetArrayList().get(i));
//		}
//		
//		for (int i = 0; i < animal.GetArray().length; i++) {
//			System.out.println(animal.GetArray()[i]);
//		}
		System.out.println();		
		// �������̽� �̿�
		Table house_service = new House_service(); // �̷��� �տ��� �������̽��� �Ӽ��� ��� �ڿ��� ������ Ŭ������ �������� �� �ִ°� �������̽��� ������
		print_table(house_service);
		// house_service(animal�� ��������)���� �������̽��� �������̵� �߱� ������ �Ʒ� print_table���� .a();�� �� �� ����.
//		System.out.println(house_service.GetArrayList().size();); // �� �ȵǴ� ������ 
		// GetArrayList() �޼ҵ带 �������̽����� �����س��� �� �ƴ� ������ service���Ͽ��� ���������� �����صױ� ������
				
	}
	
	static void print_table(Table asdf) {
		asdf.a();
	}

}
