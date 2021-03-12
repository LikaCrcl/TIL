// ���� �𸣰����� Ȥ�� �ٽ� �� ������ ��������ϴ� ���� ����� ��Ű�� ���� ���� ���� �� ����ΰ� �� ��

package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class SetClass implements Comparator<SetClass>{ // implements�� ���� �ڸ� ��ӹް� ���ִ� �ص� extends�� �ٸ��� Class�� ��������� ��.
	
	// ���������� private, protected, public, default
	// private > default > protected > public ������ ���� ����
	public SetClass() {
	}
	
//	private int num; // private�� �� SetClass �ȿ����� ����� �� �ְ� �� (�ܺο��� ���� ���� �Ұ�)
	int num;
	String name;
	
	SetClass(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	// �Ʒ��� Comparator<SetClass> �� �ϼ���Ű�� ���� �ʿ��� �κ�
	public int compare(SetClass o1, SetClass o2) {
		// TODO Auto-generated method stub
		return o2.num - o1.num;
	}
	// �� �Ʒ��� implements ������ Parent �� �� �� �ϼ���Ű�� ���� �ʿ��� �κ�
//	@Override
//	public int toCount() {
//		return 0;
//	}
//	
//	@Override
//	public int toNumber() {
//		return 0;
//	}

}

public class Day_0312_a extends SetClass { // (Class) extends (Class) : �� class�� ���� class�� ��ӹް� ���� (�ڰ� �θ�, ���� �ڽ� �̶�� �����ϸ� �ɵ�)

	public static void main(String[] args) {
		
		// ��ü ����. ������ ����Ʈ���� ���� ��
		House inho = new House(); // () �ȿ� �ƹ��͵� �Ⱦ��� ����Ʈ�� ���
		House inho2 = new House("inho");
		House john = new House("john"); // Ŭ���� ���Ͽ��� (String print) �� �����������Ƿ� () �ȿ� �Է��� String���� ������ ���
		
		// this
//		House inho_1 = new House(22, 2, 1, "���̵�", "Made in China");
//		System.out.println(inho_1.house_elec);
		
		// �迭���� ǥ���غ���
		int max = 3;
		int[] total_house_size = {24, 28, 32};
		int[] total_house_room = {2, 3, 4};
		int[] total_house_toilet = {1, 2, 3};
		String[] total_house_gagu = {"IKEA", "AA Furniture", "AKRACING"};
		String[] total_house_elec = {"made in germany", "made in china", "made in korea"};
		String[] total_name = {"myHouse", "inho2", "john"};
		String[] host = total_name;
		
		ArrayList<House> total_house_list = new ArrayList<House>();
		HashMap<String, House> total_house = new HashMap<>();
		
		for (int i = 0; i < max; i++) {
			House test = new House(total_house_size[i], total_house_room[i], total_house_toilet[i], total_house_gagu[i], total_house_elec[i], host[i]);
			total_house_list.add(test);
			total_house.put(total_name[i], test);
		}
		
		System.out.println(total_house.keySet());
		
		for (String i : total_house.keySet()) {
			House h = total_house.get(i);
			System.out.println("������ : "+h.house_host);
			System.out.println("��� : "+h.house_size);
			System.out.println("�� ���� : "+h.house_room);
			System.out.println("ȭ��� ���� : "+h.house_toilet);
			System.out.println("���� ������ : "+h.house_gagu);
			System.out.println("���ڱ�� ������ : "+h.house_elec);
			System.out.println();
		}
		
//		System.out.println(A.num;); // ������ num�� private�� �����������Ƿ� ����� �� ����.
		
//		name = "asdf"; // extends SetClass �� ����� ������ name�� ���� ��������.
		
		// TreeSet ���� ��Ģ ������ֱ�
		Set<SetClass> tree = new TreeSet<SetClass>(); // Set import ���ְ� �̷������ε� �� �� �ִµ�
		
		for (int i = 0; i < max; i++) {
			SetClass a = new SetClass(total_house_size[i], total_house_gagu[i]);
			tree.add(a); // add�� �ȵǴµ� �� �ȵǴ��� �𸣰���
		}
		
//		for (SetClass i : tree) {
//			System.out.println(i.name);
//			System.out.println(i.num);
//		}
				
	}

}
