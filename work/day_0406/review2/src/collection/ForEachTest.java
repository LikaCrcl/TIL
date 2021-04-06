package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class ForEachTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//���� for��
//		for (int i = 0; i < 5; i++) {
//			System.out.println(list.get(i));
//		}
		
		//���� for��
//		for(Integer data : list) {
//			System.out.println(data);
//		}
		
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
//		for(Integer data : set) {
//			System.out.println(data);
//		}
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("�ϳ�", 1);
		map.put("��", 2);
		map.put("��", 3);
		map.put("��", 4);
		map.put("�ټ�", 5);
		
		Set<Entry<String, Integer>> entryset = map.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		
		
		
	}
}








