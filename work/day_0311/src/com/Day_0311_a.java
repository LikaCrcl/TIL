package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

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
		Start[] array_start = new Start[max];
		ArrayList<Start> list_start = new ArrayList<Start>();
		
		for (int i = 0; i < max; i++) {
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
			// ��ü�迭���
//			System.out.println("name : "+array_start[i].name);
//			System.out.println("number : "+array_start[i].number);
//			System.out.println("size : "+array_start[i].size);
//			System.out.println("power : "+array_start[i].power);
//			System.out.println();
			
			// ��üList���
			Start z = list_start.get(i); // �̷��� ����ȭ? �ϴ°� ����
			
//			System.out.println("name : "+z.name);
//			System.out.println("number : "+z.number);
//			System.out.println("size : "+z.size);
//			System.out.println("power : "+z.power);
//			System.out.println();
		}
		
		// set(HashSet, LinkedHashSet, TreeSet)
		HashSet<Integer> set_int = new HashSet<Integer>();
		
		set_int.add(100);
		set_int.add(100);
		set_int.add(100);
		set_int.add(100);
		
		System.out.println("set_int.size before : "+set_int.size()); // 1 ���. �ߺ� ��� X
		
		set_int.add(200);
		set_int.add(400);
		set_int.add(5940);
		
		System.out.println("set_int.size after : "+set_int.size()); // �ٸ� �� add�����Ƿ� 2
		
		// Set ���� get�� ����� �� ��� for each������ ����ؾ���		
		for(int i : set_int) {
			System.out.println("for each HashSet : "+i); // 400, 100, 5940, 200 ������ ����. HashSet�� add ���ָ� ������� �ԷµǴ� ���� �ƴϰ� �������� �ԷµǾ� ��Ȯ�� ������ �� �� ����(get�� �� �� ����)
		}
		
		LinkedHashSet<Integer> link_int = new LinkedHashSet<Integer>();
		
		link_int.add(100);
		link_int.add(100);
		link_int.add(100);
		link_int.add(100);
		
		System.out.println("link_int size : "+link_int.size()); // 1 ���. ������ �ߺ� X
		
		link_int.add(200);
		link_int.add(300);
		link_int.add(124089);
		link_int.add(5823);
		link_int.add(235);
		link_int.add(652);
		link_int.add(346);
				
		for (int i : link_int) {
			System.out.println("for each LinkedHashSet : "+i);
		}
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("aaa");
		treeSet.add("ccc");
		treeSet.add("��");
		treeSet.add("ee");
		treeSet.add("��");
		treeSet.add("b");
		treeSet.add("��");
		treeSet.add("ddd");
		treeSet.add("hhh");
		
		for (String i : treeSet) {
			System.out.println(i); // TreeSet�� �Է°����� �ڿ��� ������� ��������.
		}
		
		HashSet<Start> hash_start = new HashSet<Start>();
		LinkedHashSet<Start> link_start = new LinkedHashSet<Start>();
		TreeSet<Start> tree_start = new TreeSet<Start>();
		
		for (int i = 0; i < max; i++) {
			// ���� ���� �ָ��ؼ� ���⼭ �ٽ� ��
			pc = new Start();
			
			pc.name = "pc_"+i;
			pc.number = i;
			pc.size = 27;
			pc.power = true;
			// �ٽ� HashSet���� pc ����غ��� ����
			hash_start.add(pc);
			
			// LinkedHashSet
			link_start.add(pc);
		}
		
		for (Start i : hash_start) {
//			System.out.println("name : "+i.name);
//			System.out.println("number : "+i.number);
//			System.out.println("size : "+i.size);
//			System.out.println("power : "+i.power);
//			System.out.println();
		}
		
		for (Start i : link_start) {
			System.out.println("name : "+i.name);
			System.out.println("number : "+i.number);
			System.out.println("size : "+i.size);
			System.out.println("power : "+i.power);
			System.out.println();
		}
		
		// �ñ��ؼ� ������ �غôµ� max���� �þ�� ���ο� ���� �߰��Ǹ� ��ü ������ �� �ٲ�°� �ƴϰ� �������� ������ �� �迭�� ���ΰ� �迭 ���� ��򰡷� ����
		
		// Map ( HashMap<(Key), (Value)> )
		HashMap<Integer, String> map_hash = new HashMap<Integer, String>();
		
		map_hash.put(100, "hi");
		map_hash.put(200, "hi"); // key ���� �ߺ� �����. value�� �ߺ� ����. hash�� �ߺ� �Ÿ��µ�
		
		map_hash.put(100, "fuck you"); // �ߺ� �߻� �� �������� �߰��� �� value ��ȯ
		
		System.out.println("key 100 : "+map_hash.get(100)); // get ���� key ���� ���� value ��ȯ
		
		System.out.println("HashMap size : "+map_hash.size()); // �������� key�� ������ �� size
		System.out.println("HashMap keyset : "+map_hash.keySet()); // �迭�� ��µ�
		
		for (int i : map_hash.keySet()) {
			System.out.println("key : "+i);
			System.out.println("value : "+map_hash.get(i));
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
