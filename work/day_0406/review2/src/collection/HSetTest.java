package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HSetTest {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		//HashSet�� ��� �߰��ϱ�
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		
		//HashSet ������ Ȯ���ϱ�
		System.out.println(set);
		
		//HashSet ��� �����ϱ�
		set.remove(20);
		
		//HashSet�� ��� ����
		System.out.println(set.size());
		
		//HashSet�� ��� ���� ���� Ȯ��
		System.out.println(set.contains(20));
		
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		iter = set.iterator();
		System.out.println(iter.next());
	
		
		
		
		
		
		
		
	}
}








