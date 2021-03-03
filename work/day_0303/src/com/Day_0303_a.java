package com;

import java.util.ArrayList;

public class Day_0303_a {

	public static void main(String[] args) {
		
		// collections framework
		// list 중 ArrayList.
		// ArrayList<참조타입> (변수) = new ArrayList<참조타입>();
		int[] array_count = new int[9];
		
		ArrayList<Integer> list_count = new ArrayList<Integer>();
		// <> 안에는 참조타입만 올 수 있음. int의 경우 Integer로, boolean의 경우 Boolean으로 쓰면 사용 가능함.
		
		for (int i = 0; i < array_count.length; i++) {
			array_count[i] = i+1;
			list_count.add(i+1); // XXX.add(int); - 초기화해주는 함수. add가 한 번 실행될 때 마다 주소가 1개 생성됨
			// ex) list_count.add(18); => list_count.get(0) = 18 (value), list_count.size() = 1 (address)
		}
		
		// 서로 의미가 같은 것들 
		System.out.println(array_count.length);
		System.out.println(list_count.size()); // length 보는 함수. 위 for문에서 add가 0~8까지 9번 돌았기 때문에 9 출력됨.
		
		System.out.println(array_count[0]);
		System.out.println(list_count.get(0)); // index의 value를 보는 함수. 위 for문에서 add가 0~8까지 9번 도는 동안 i+1로 초기화해줬기 때문에 여기서는 1 출력됨.
		
		for (int i = 0; i < list_count.size(); i++) {
//			System.out.println(array_count[i]);
//			System.out.println(list_count.get(i));
		}
		
		System.out.println("------------");
		// 직접 타이핑해보기
		int[] a = new int[10];
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
			b.add((i+1)*10);
		}
		
		System.out.println("a.length : "+a.length);
		System.out.println("b.size() : "+b.size());
		
		System.out.println("a[0] : "+a[0]);
		System.out.println("b.get(0) : "+b.get(0));
		
		for (int i = 0; i < b.size(); i++) {
//			System.out.println("array : "+a[i]);
//			System.out.println("ArrayList : "+b.get(i));
		}
		
		// remove
		// XXX.remove(int n) : n번째 index에 있는 값을 삭제.
		System.out.println("b.size() before remove : "+b.size()); // 10
		b.remove(0);
		System.out.println("b.size() after remove : "+b.size()); // 9
		System.out.println("b.get(0) after remove 0 : "+b.get(0)); // b(0)의 값이었던 10을 지워서 20 출력됨.
		
		// 갑자기 궁금해짐
		int size = 10;
		int[] size_array = new int[size];
		System.out.println("size_array.length before : "+size_array.length);
		size = 20;
		System.out.println("size_array.length after : "+size_array.length); // int[size]에서 size값을 다시 초기화해준다고 해도 배열의 length는 변하지않음
		size_array = new int[size];
		System.out.println("size_array.length re : "+size_array.length); // 배열도 다시 초기화해주면 length도 그에 맞게 변함
		
		// arraylist를 같은 타입의 변수에 대입해줄 수도 있음
		int a_int = b.size();
		System.out.println("b.size() : "+b.size());
		System.out.println("a_int : "+a_int);
		
		// 배열 내 모든 value를 remove해보기 예제
		int[] arr_i = new int[100];
		ArrayList<Integer> arr_l = new ArrayList<Integer>();
		
		for (int i = 0; i < arr_i.length; i++) {
			arr_l.add(i+1);
		}
		
		for (int i = 0; i < arr_i.length; i++) {
			System.out.println("arr_l : "+arr_l.get(i));
		}
		
		for (int i = 0; i < arr_i.length; i++) {
			int m = arr_l.remove(i);
			i--;
			System.out.println("removing.. "+m);
			
			if (arr_l.size() == 0) {
				System.out.println("arr_l.size() : "+arr_l.size());
				break;
			}
		}
		// 까지 생각한 답인데 int m = arr_l.remove(i); 부터 for문 끝까지의 부분을 그냥 int m = arr_l.remove(0); 으로 해줘도 됨.
		
		// 어제했던 예제 list로 해보기 예제
		// 는 해보라고 해놓고 나몰라라
		System.out.println();
		System.out.println("예제");
		System.out.println();
		
		String text = "표제어의 범위에 따라 백과사전의 종류가 나뉘는데, 넓은 범위를 갖는 표제어들로 백과사전을 구성하는 것을 대항목주의라고 하고 상대적으로 좁은 범위의 표제어를 이용하는 것을 소항목주의라고 한다.";
		char[] text_char = text.toCharArray();
		ArrayList<Character> text_list = new ArrayList<Character>();
		char[] index_char = {'의','가','는','라','을'};
		
		for (int i = 0; i < index_char.length; i++) {
			text_list.add(index_char[i]);
		}
		
		String[] answer = new String[text_list.size()];
				
		for (int i = 0; i < answer.length; i++) {
			answer[i] = "";
		}
		
		for (int i = 0; i < text_char.length; i++) {
			for (int j = 0; j < text_list.size(); j++) {
				if (text_char[i] == text_list.get(j))
					answer[j] += text_list.get(j);
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if (answer[i].length() < answer[j].length()) {
					String temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		System.out.println();
		
		// 밀어내고 add 하기 -> XXX.add((Index), (Value));
		ArrayList<Integer> new_list = new ArrayList<Integer>();
		new_list.add(100);
		System.out.println("new_list.get(0) before : "+new_list.get(0)); // 100
		new_list.add(0, 200);
		System.out.println("new_list.get(0) after : "+new_list.get(0)); // 200
		System.out.println("전체 보기 : "+new_list); // [200, 100]
		
		// 치환 add하기 -> XXX.set((Index), (Value));
		// 위 add( , )는 자기가 그자리에 들어가고 나머지를 뒤로 하나씩 밀지만 set은 원래 Index에 있던 value를 없애고 자기가 그 자리에 들어감.(뒤로 밀지 않음)
		new_list.set(0, 2000);
		System.out.println("before : [200, 100], after : "+new_list); // [2000, 100]
		
		// all remove -> XXX.clear();
		new_list.clear();
		System.out.println("after clear : "+new_list); // []
		
		
		
	}

}
