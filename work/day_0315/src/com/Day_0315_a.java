package com;

public class Day_0315_a {

	public static void main(String[] args) {
		
		// Getters and Setters
		// 값을 private로 설정했을 때 많이 사용
		Animal asdf = new Animal(1, "male");
		
		System.out.println(asdf.getAge()); // 1
		System.out.println(asdf.getGender()); // male
		
		asdf.setAge(3);
		System.out.println(asdf.getAge()); // 3
		
//		System.out.println(asdf.age); // age가 private 라서 출력 불가능.
		
		int max = 6;
		String[] name_array = new String[] {"사자", "원숭이", "호랑이", "타조", "치타", "기린"};
		int[] age_array = new int[] {12, 8, 14, 23, 3, 6};
		String[] gender_array = new String[] {"수", "암", "수", "암", "수", "암"};
		double[] speed_array = new double[] {12.5, 60, 60, 45.5, 78.6, 12};
		String[] type_array = new String[] {"초식", "육식", "초식", "육식", "육식", "초식"};
		double[] weight_array = new double[] {23.3, 100.5, 120.5, 90.6, 66.6, 300.3};
		
		Animal2[] ani_array = new Animal2[max];	
				
		for (int i = 0; i < max; i++) {
			Animal2 ani_temp = new Animal2(name_array[i], age_array[i], gender_array[i], speed_array[i], type_array[i], weight_array[i]);
			ani_array[i] = ani_temp;
		}
		
		System.out.println(ani_array[0].name);
		
	}

}
