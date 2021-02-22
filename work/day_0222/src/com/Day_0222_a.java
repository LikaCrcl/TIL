package com;

public class Day_0222_a {

	public static void main(String[] args) {
		
		//for 문 응용 복습
		
//		for (int i = 0; i < 10; i++) {
//			
//			if (i == 4) {
//				System.out.println(i);
//				break; // for문 아예 끝남
//			}
//		System.out.println(i);
//		}
		
//		for (int i = 0; i < 10; i++) {
//			if (i == 4) {
//				for (int j = 0; j < 10; j++) {
//					System.out.println(i);
//					break; // 바깥쪽 for문 까지 나가지는게 아닌 if문 안쪽의 이 for문 만 끝남
//				}
//				System.out.println("if 문");
//			}
//		System.out.println("바깥쪽 for문");
//		}
		
//		int count = 1;
//		switch (count) {
//		case 0:
//			System.out.println("case 0 : "+count);
//			break;
//			
//		case 1:
//			if (count == 0) {
//				System.out.println("case 1 : "+count);
//				break;
//			}
//			else {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("case 11 : "+count);
//					break;
//				}
//			}
//			System.out.println("case 1 : "+count);
//			break;
//			
//		case 2:
//			System.out.println("case 2 : "+count);
//			break;
//		}
		// 위 switch문을 돌려보면 case 11 : 1 case 1 : 1 이 나옴. break;는 마지막에 들어간 반복문을 빠져나오고 조건문은 무시한다.
		
		// continue
//		for (int i = 0; i < 10; i++) {
//			if (i != 4) {
//				continue; // continue를 만나면 그 아래로 전부 무시하고 i++로 넘어감. 여기선 0일 때 들어온 후 print 안하고 1로 넘어감. i가 4일 땐 false 이므로 4만 출력되게 됨.
//			}
//			System.out.println(i);
//		}
//		
		// 삼항 연산자 ? : [(변수)(대입)(조건)? (value true):(value false)]
		int count;
		System.out.println(count = (true) ? 10:20);
		System.out.println(count = (false) ? 10:20);
		System.out.println(count = (count > 0) ? 10:20); // 위에서 count를 20으로 초기화시켜줬기 때문에 count > 0 : true. 따라서 10
		
		// 이런 식으로도 쓸 수 있음
		int num = (count > 0)? 30:40;
		boolean is_bool = (count > 0)? true:false;
		
		System.out.println(is_bool); // true
		
		String name = (count > 0)? "ㅇㅇ":"ㄴㄴ";
		System.out.println(name);
		
		// 0~99 true, 100~199 false 예제
//		boolean random = ((int)(Math.random()*200) > 99)? true:false;
//		System.out.println(random);
		// 까지 내가 생각한 답
		
		// random이 몇이 나왔는지 볼 수 있는 답
		int num2 = (int) (Math.random()*200);
		boolean is_test = (num2 < 100)? true:false;
		System.out.println(num2 + " : " +is_test);
		
		// 배열 - (타입)[] (변수)[] int[] nums;
		int[] nums = new int[3500]; // int[3] : 변수를 0부터 3500개 선언. (0, 1, 2, ... , 3499까지 선언)
		System.out.println(nums[0]); // 0이 나온다면 선언 완료한 것임
		
		nums[3499] = 3499;
		System.out.println(nums[3499]); // 위에서 3499 값 초기화해줘서 3499 출력
		
	}

}
