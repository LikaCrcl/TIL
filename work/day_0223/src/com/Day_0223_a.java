package com;

import java.util.Iterator;

public class Day_0223_a {
	
	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		
		// value type (기본 타입)
//		int a = 10;
		int a2 = 20;
		a2 = a;
//		System.out.println(a); // a=20으로 바뀌지 않는다. 이것이 기본타입. 참조타입은 바뀜 ex) String 등
		
		swap_test(a, b);
		System.out.println("/////");
		System.out.println(a);
		System.out.println(b); // 위에서 스왑했었지만 다시 출력해보니 안바뀌어있음.
		
		// 배열 스왑
		int[] array = new int[2];
		array[0] = 10;
		array[1] = 20;
		
		System.out.println();
		swap_array(array);
		System.out.println("////");
		System.out.println("0 : "+array[0]);
		System.out.println("1 : "+array[1]); // 스왑한 그대로 바뀌어있음. 기본타입을 썼더라도 배열을 만나게 되면 참조로 바뀐다.
		System.out.println("---");
		
		// 로또 만들기
		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			
			lotto[i] = i+1; // 0이 나오지 않게, 45가 출력될 수 있게 해주는 코드.
			
		}
		
//		for (int i = 0; i < 1000; i++) {
//			
//			int n = (int) (Math.random()*44)+1;
//			
//			int temp = lotto[0];
//			lotto[0] = lotto[n]; // lotto[0] 부터 lotto[45]를 전부 섞어주는 코드.
//			lotto[n] = temp;
//			
//		}
//		
//		int lotto_max = 6;
//		for (int i = 0; i < lotto_max; i++) {
//			
//			System.out.println(lotto[i]); // lotto[0] ~ lotto[5]까지를 도출하는 코드. 위에서 계속 섞어주기 떄문에 랜덤한 값이 나온다.
//			
//		} 까지 첫번째 방법
		
		// 비교해서 중복이면 재생성하는 방법 예제
		
		int[] random_index = new int[6];
		
		for (int i = 0; i < 6; i++) {
			
			int n = (int)(Math.random()*45+1);
			random_index[i] = n;
			
			if (i == 0) {
			}
			else {
				for (int j = 0; j < i; j++) {
					if (random_index[i] == random_index[j]) {
						i--;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < random_index.length; i++) {
//			System.out.println(random_index[i]); // 위쪽 for문에서 값을 입력받고 난 후 따로 빠져나와 출력해줘야함.
		}
		
		// * break; 는 가장 가까이 있는 반복문(for, while)을 나가며, 그 중간에 조건문(switch, if)이 있어도 무시한다.
		
		// 랜덤 10개 값 생성하여 높은 수가 아래로 오게끔 (오름차순) 정렬 과제
		int[] random = new int[10];
		
		for (int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random()*100);
			if (i == 0) {
				random[i] = (int)(Math.random()*10);
			}
			else {
				if (random[i] < random[i-1]) {
					i--;
				}
			}
		}
		
		for (int i = 0; i < random.length; i++) {
			System.out.println(random[i]);
		}
		
	}
	
	static void swap_test(int _a, int _b) {
		
		int temp = 0;
		
		temp = _a;
		_a = _b;
		_b = temp;
		
		System.out.println(_a);
		System.out.println(_b);
		
	}
	
	static void swap_array (int[] n) {
		int temp = 0;
		
		temp = n[0];
		n[0] = n[1];
		n[1] = temp;
						
		System.out.println("adress 0 : "+n[0]);
		System.out.println("adress 1 : "+n[1]);
	}

}
