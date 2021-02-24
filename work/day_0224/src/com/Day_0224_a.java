package com;

public class Day_0224_a {

	public static void main(String[] args) {
		
		// 1차 배열
		int[] array = new int[10];
		int[] array_a = {1, 2, 3};
		
		// 2차 배열
		int[][] array2 = new int[2][10]; // 17~18째 줄과 같은 의미
		array2[0][0] = 10;
		System.out.println(array2[0][0]);
		
		int[][] array2_a = new int[2][];
		array2_a[0] = new int[10];
		array2_a[1] = new int[10];
		
		int[][] array2_b = {{1,2},{3,4}}; // 잘 안씀
		array2_b[0][0] = 1;
		array2_b[0][1] = 2;
		array2_b[1][0] = 3;
		array2_b[1][1] = 4; // 까지가 int[][] array2_b = {{1,2},{3,4}};와 같은 의미임. 앞 배열에 온 0은 {1,2}, 1은 {3,4}를 의미하고 뒷 배열에 온 0은 1 혹은 3, 1은 2 혹은 4를 의미함.
		
		// 1차에 15, 19, 66 넣기 예제
		int[][] array_c = new int[3][];
		int[] d = {15, 19, 66};
		
		for (int i = 0; i < array_c.length; i++) {
			array_c[i] = new int[d[i]];
		}
		
		// 배열 정리
		int[] array_1 = new int[3]; // 1차 배열 array_1에는 value값을 직접 저장해 줄 수 없고 new int[3]이라 함은 array_1 배열에 array_1[0], [1], [2] 주소를 할당해준 것.
		System.out.println(array_1[0]); // value가 없기 때문에 0 출력
		array_1[0] = 1; // 주소가 할당된 배열에는 value를 저장해줄 수 있음.
		System.out.println(array_1[0]); // value 저장해줘서 1 출력
		
		int[][] array_2 = new int[3][]; // 2차 배열 array_2
		array_2[0] = new int[10]; // 2차배열에서는 앞쪽 배열에 value를 직접 저장할 수 없음. 주소를 할당해줘야함. 바로 윗줄에서 선언한 것은 array_2[0][], [1][], [2][]였고 여기서는 [0][]의 주소들을 할당해 준 것임
		// 이 다음부터는 array_2[0][0], [0][1], ... , [0][9] 까지의 value를 저장해줄 수 있게 된 것임
		array_2[0][0] = 1;
		System.out.println(array_2.length); // int[][] array_2 = new int[3][]; 에서 할당해준 주소의 크기. 따라서 3 출력
		System.out.println(array_2[0].length); // array_2[0] = new int[10]; 에서 할당해준 array_2[0]에 대한 크기. 따라서 10 출력
		
		System.out.println("----");
		
		// array_t[min][min] ~ array_t[max][max] 에 전부 j 대입시키기 예제
		// 못 풂
		int[][] array_t = new int[10][];
		int[] array_num = {15,19,66,100,20,30,50,45,32,2};
		int count = 0;
		
		for (int i = 0; i < array_t.length; i++) {
			array_t[i] = new int[array_num[i]];
			for (int j = 0; j < array_t[i].length; j++) {
				array_t[i][j] = count++;
				System.out.println(array_t[i][j]);
			}
		}
		
		int size = 10;
		int[][] array_3 = new int[size][size];
		
	}

}
