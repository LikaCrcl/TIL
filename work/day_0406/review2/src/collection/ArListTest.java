package collection;

import java.util.ArrayList;

public class ArListTest {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		
		//ArrayList�� ��� �߰��ϱ�
		list1.add("Hello");
		list1.add("Java");
		list1.add("Oracle");
		list1.add("Javascript");
		
		//ArrayList ������ Ȯ���ϱ�
//		System.out.println(list1);
		
		//					ArrayList�� ��� ����
		for (int i = 0; i < list1.size(); i++) {
			//ArrayList���� ��� ��������
//			System.out.println(list1.get(i));
		}
		//is~~~ : ~~�̴�
		//isRedirect : Redirect�� �� 
		//has~~~ : ~~�� �����ִ�
		
		//ArrayList�� ��� ���� ���� Ȯ��
//		System.out.println(list1.contains("Hello"));
		
		//ArrayList���� ��� �����ϱ�
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







