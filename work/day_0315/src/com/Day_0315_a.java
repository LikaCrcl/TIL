package com;

public class Day_0315_a {

	public static void main(String[] args) {
		
		// Getters and Setters
		// ���� private�� �������� �� ���� ���
		Animal asdf = new Animal(1, "male");
		
		System.out.println(asdf.getAge()); // 1
		System.out.println(asdf.getGender()); // male
		
		asdf.setAge(3);
		System.out.println(asdf.getAge()); // 3
		
//		System.out.println(asdf.age); // age�� private �� ��� �Ұ���.
		
		int max = 6;
		String[] name_array = new String[] {"����", "������", "ȣ����", "Ÿ��", "ġŸ", "�⸰"};
		int[] age_array = new int[] {12, 8, 14, 23, 3, 6};
		String[] gender_array = new String[] {"��", "��", "��", "��", "��", "��"};
		double[] speed_array = new double[] {12.5, 60, 60, 45.5, 78.6, 12};
		String[] type_array = new String[] {"�ʽ�", "����", "�ʽ�", "����", "����", "�ʽ�"};
		double[] weight_array = new double[] {23.3, 100.5, 120.5, 90.6, 66.6, 300.3};
		
		Animal2[] ani_array = new Animal2[max];	
				
		for (int i = 0; i < max; i++) {
			Animal2 ani_temp = new Animal2(name_array[i], age_array[i], gender_array[i], speed_array[i], type_array[i], weight_array[i]);
			ani_array[i] = ani_temp;
		}
		
		System.out.println(ani_array[0].name);
		
	}

}
