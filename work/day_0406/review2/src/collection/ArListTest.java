package collection;

import java.util.ArrayList;

public class ArListTest {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		
		//ArrayList에 요소 추가하기
		list1.add("Hello");
		list1.add("Java");
		list1.add("Oracle");
		list1.add("Javascript");
		
		//ArrayList 간단히 확인하기
//		System.out.println(list1);
		
		//					ArrayList의 요소 개수
		for (int i = 0; i < list1.size(); i++) {
			//ArrayList에서 요소 가져오기
//			System.out.println(list1.get(i));
		}
		//is~~~ : ~~이다
		//isRedirect : Redirect면 참 
		//has~~~ : ~~를 갖고있다
		
		//ArrayList에 요소 포함 여부 확인
//		System.out.println(list1.contains("Hello"));
		
		//ArrayList에서 요소 삭제하기
		list1.remove(2);
//		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		
//		list2.remove(2);
		list2.remove(new Integer(30));
		
//		remove(int index)
//		remove(Object o)
		
		
	}
}







