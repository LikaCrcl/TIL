package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//HashMap�� ��� �߰��ϱ�
		map.put(1, "�ϳ�");
		map.put(2,"��");
		map.put(3, "��");
		map.put(4, "��");
		map.put(5, "��");
		System.out.println(map);
		map.put(5, "�ټ�");//������ �����ϴ� Key������ �߰��� �ϰԵǸ� ������ �Ͼ��.
		System.out.println(map);
		
		//HashMap���� ��� ��������
		System.out.println(map.get(3));
		
		//HashMap�� ��� ����
		System.out.println(map.size());
		
		//HashMap���� ��� �����ϱ�
		map.remove(3);
		
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> keyiter = keyset.iterator();
		while(keyiter.hasNext()) {
			System.out.println("Ű : "+keyiter.next());
		}
		
		Collection<String> values = map.values();
		Iterator<String> valueiter= values.iterator();
		while(valueiter.hasNext()) {
			System.out.println("�� : "+valueiter.next());
		}
		
		Set<Entry<Integer, String>> entryset = map.entrySet();
		Iterator<Entry<Integer,String>> entryiter = entryset.iterator();
		while(entryiter.hasNext()) {
			Entry<Integer,String> entry = entryiter.next();
			System.out.println("Ű : "+entry.getKey());
			System.out.println("�� : "+entry.getValue());
		}
		
		
	}
}















