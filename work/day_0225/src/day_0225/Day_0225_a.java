package day_0225;

public class Day_0225_a {
	
	static int count; // 4byte. stack에 할당

	public static void main(String[] args) {
		
		// 기본타입 int, short, long, float 등은 stack이라는 공간에 할당받음. 속도 빠름 (콜백함수 main도 stack에 할당받음)
		// 전역변수는 콜백함수보다 우선순위가 높음(콜백함수보다 먼저 할당받음. 이 main함수가 끝나고 그 다음에 선언해도 여기서 전역변수 사용 가능)
		// 나머지 참조타입은 heap이라는 공간에 할당받음. 속도 느림
		
		// stack은 Last In First Out (lifo) <-> queue는 First In First Out (fifo)
		
		int num = 1919;
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
