package com;

import java.util.ArrayList;

public class Day_0311_a {

	public static void main(String[] args) {
		
		// for�� ������ Start(type)��ü 30���� ����� ��������� ���� �ش��� ���� �����ϱ� ����
		// name pc_0~29, number 0~29, size 27, power true
		ArrayList<Start> list_start = new ArrayList<Start>();
		Start pc = new Start();
		for (int i = 0; i < 30; i++) {
			pc.name = "pc_"+i;
			pc.number = i;
			pc.size = 27;
			pc.power = true;
			System.out.println("name : "+pc.name);
			System.out.println("number : "+pc.number);
			System.out.println("size : "+pc.size);
			System.out.println("power : "+pc.power);
		}
		
	}

}

class Start {
	
	public void start() {
		
		System.out.println("�������Դϴ�");
		
	}
	
	String name;
	int size;
	boolean power;
	int number;
	
}
