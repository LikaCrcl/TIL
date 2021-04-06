package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HSetTest {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		//HashSet에 요소 추가하기
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
		
		//HashSet 간단히 확인하기
		System.out.println(set);
		
		//HashSet 요소 삭제하기
		set.remove(20);
		
		//HashSet의 요소 개수
		System.out.println(set.size());
		
		//HashSet에 요소 포함 여부 확인
		System.out.println(set.contains(20));
		
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		iter = set.iterator();
		System.out.println(iter.next());
	
		
		
		
		
		
		
		
	}
}








