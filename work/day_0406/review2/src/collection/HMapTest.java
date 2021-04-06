package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//HashMap에 요소 추가하기
		map.put(1, "하나");
		map.put(2,"둘");
		map.put(3, "셋");
		map.put(4, "넷");
		map.put(5, "오");
		System.out.println(map);
		map.put(5, "다섯");//기존에 존재하던 Key값으로 추가를 하게되면 수정이 일어난다.
		System.out.println(map);
		
		//HashMap에서 요소 가져오기
		System.out.println(map.get(3));
		
		//HashMap의 요소 개수
		System.out.println(map.size());
		
		//HashMap에서 요소 삭제하기
		map.remove(3);
		
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> keyiter = keyset.iterator();
		while(keyiter.hasNext()) {
			System.out.println("키 : "+keyiter.next());
		}
		
		Collection<String> values = map.values();
		Iterator<String> valueiter= values.iterator();
		while(valueiter.hasNext()) {
			System.out.println("값 : "+valueiter.next());
		}
		
		Set<Entry<Integer, String>> entryset = map.entrySet();
		Iterator<Entry<Integer,String>> entryiter = entryset.iterator();
		while(entryiter.hasNext()) {
			Entry<Integer,String> entry = entryiter.next();
			System.out.println("키 : "+entry.getKey());
			System.out.println("값 : "+entry.getValue());
		}
		
		
	}
}















