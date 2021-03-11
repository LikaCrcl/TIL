package com;

import java.util.ArrayList;
import java.util.HashSet;

public class Day_0311_a {

	public static void main(String[] args) {
		
		// ��ü ?
		Start test = new Start();
		test.name = "pc_";
		test.number = 0;
		test.size = 27;
		test.power = true; // (����). �� �Է��ϸ� �� �ؿ� �����ص� class ���� ��� ������ ������ �� ����
		
		// for�� ������ Start(type)��ü 30���� ����� ��������� ���� �ش��� ���� �����ϱ� ����
		// name pc_0~29, number 0~29, size 27, power true
		Start pc;
		int max = 30;
		int[] c = new int[max];
		String[] names = new String[max];
		ArrayList<Integer> list_int = new ArrayList<Integer>();
		HashSet<Integer> set_int = new HashSet<Integer>();
		Start[] array_start = new Start[max];
		ArrayList<Start> list_start = new ArrayList<Start>();
		
		for (int i = 0; i < 30; i++) {
			pc = new Start();
			pc.name = "pc_"+i;
			pc.number = i;
			pc.size = 27;
			pc.power = true;
			
//			System.out.println("name : "+pc.name);
//			System.out.println("number : "+pc.number);
//			System.out.println("size : "+pc.size);
//			System.out.println("power : "+pc.power);
//			System.out.println();
			
			// �迭�� ��Ÿ����
			c[i] = pc.number;
			list_int.add(pc.size);
			names[i] = pc.name;

//			System.out.println("number : "+c[i]);
//			System.out.println("size : "+list_int.get(i));
//			System.out.println("name : "+names[i]);
//			System.out.println();
			
			// ��ü�� ��Ÿ���� (����� �Ʒ���)
			array_start[i] = pc;
			
			// ��ü List�� ��Ÿ���� (��� �Ʒ���)
			list_start.add(pc);
		}
		
		for (int i = 0; i < array_start.length; i++) {
//			System.out.println("name : "+array_start[i].name);
//			System.out.println("number : "+array_start[i].number);
//			System.out.println("size : "+array_start[i].size);
//			System.out.println("power : "+array_start[i].power);
//			System.out.println();
			
			Start z = list_start.get(i); // �̷��� ����ȭ? �ϴ°� ����
			
			System.out.println("name : "+z.name);
			System.out.println("number : "+z.number);
			System.out.println("size : "+z.size);
			System.out.println("power : "+z.power);
			System.out.println();
		}
		
	}

}

class Start {
	
	public Start() { // void ���� Ÿ��? ���� class �̸��� �Ȱ��� �� �Ϳ� �ָ�. ���⼭ Start() �� ������.
		
		System.out.print(""); // syso ������ run�� �ȵ�.
		
	}
	
	String name;
	int size;
	boolean power;
	int number; // ����� ���������� �Ѵٰ� ��
	
}
