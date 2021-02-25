package day_0225;

import java.util.Iterator;

public class Day_0225_a {
	
	static int count; // 4byte. stack에 할당

	public static void main(String[] args) {
		
		// 기본타입 int, short, long, float 등은 stack이라는 공간에 할당받음. 속도 빠름 (콜백함수 main도 stack에 할당받음)
		// 전역변수는 콜백함수보다 우선순위가 높음(콜백함수보다 먼저 할당받음. 이 main함수가 끝나고 그 다음에 선언해도 여기서 전역변수 사용 가능)
		// 나머지 참조타입은 heap이라는 공간에 할당받음. 속도 느림
		
		// stack은 Last In First Out (lifo) <-> queue는 First In First Out (fifo)
		
		count = 1919;
		System.out.println(count);
		System.out.println(count2); // 전역변수의 우선순위가 더 높기 때문에 count2가 저 아래 있어도 여기서 사용 가능
		
		test(); // test함수보다 main함수가 먼저 할당받음
		// 이 줄에 오면 test()도 할당이 끝남
		
		int[] array = new int[3];
		int[] array2 = new int[3];
		// int라서 먼저 stack에 할당된 후 new를 사용함으로 인해 heap에 3만큼 할당되게 됨.
		
		System.out.println(array);
		System.out.println(array2);
		
		array2 = new int[3];
		
		System.out.println(array2); // new를 다시 써줬기 때문에 주소가 달라짐. 
		
		// 배열 value대입을 이런식으로 해줄 수 도 있음
		int[][] array_2 = new int[2][];
		array_2[0] = new int[] {30, 50};
		array_2[1] = new int[] {40, 60};
		
		System.out.println(array_2[0][0]); // 30
		System.out.println(array_2[1][1]); // 60
		
		String name = "helloworld";
		String name2 = "helloworld"; // 얘랑 name이랑 주소비교하면 true. 그냥 이렇게 선언하면 java에서 자동으로 heap에서 같은 값이 있나 찾아보고 같다면 같은 주소를 할당해줌
		String name3 = new String("helloworld"); // 얘는 new를 써서 강제로 heap 내에 새로운 공간에 할당했기 때문에 주소가 다름. 그래서 false
		
		// 주소 비교
		if (name == name3)
			System.out.println("true");
		else
			System.out.println("false");
		
		name2 = name3; // 주소 비교하면 true나옴.
		
		if (name2 == name3)
			System.out.println("true");
		else
			System.out.println("false");
		// 참조타입은 비교 연산자를 사용하면 주소를 비교하지만 value type (ex. int, float 등)은 value를 비교함(주소가 어차피 같게 할당됨)
		
		// value 비교
		System.out.println(name3.equals(name)); // value를 비교하는 함수 xxx.equals() -> boolean으로 출력됨. 따라서 true
		
		// String도 배열을 이용해 char로 나타낼 수 있음
		char[] ch = name3.toCharArray();
		System.out.println(ch.length); // "helloworld" 열 글자의 10
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
	}
	
	static void test() {
		int test_num = 1919;
		System.out.println(test_num);
		test2();
		// 이 줄에 오면 test2()의 할당은 끝남. 하지만 test()는 밑에 뭐가 더 남아있으므로 할당 아직 안끝남
		System.out.println("ㅁㄴㅇㄹ");
	}
	
	static void test2() {
		int test_num2 = 19;
		System.out.println(test_num2);
	}
	
	static int count2 = 1;

}
