package com;

import java.util.ArrayList;

public class Day_0309_a {

	public static void main(String[] args) {
		
		// 1차배열을 2차배열로
		
		String[] s_data = {"12345", "21345", "31245", "41235"};
		String[][] s_data2 = new String[(int) Math.sqrt(s_data.length)][(int) Math.sqrt(s_data.length)];
		int count = 0;
		
		for (int i = 0; i < s_data2.length; i++) {
			for (int j = 0; j < s_data2[0].length; j++) {
				s_data2[i][j] = s_data[count++];
				System.out.println(s_data2[i][j]);
			}
		}
		
		System.out.println();
		
		// 특정값만 다시 1차로
		
		String[] pick = new String[s_data.length];
		int count2 = 0;
		
		for (int i = 0; i < s_data2.length; i++) {
			for (int j = 0; j < s_data2[0].length; j++) {
				pick[count2++] = s_data2[i][j].substring(3);
			}
		}
		
		String a = "";
		
		for (int i = 0; i < pick.length; i++) {
			a += pick[i];
		}
		
		System.out.println("다시 1차 : \n"+a);
		
		// int X = Integer.parseInt((String));
		// String을 int변수 X에 담음. int값 말고 다른게 껴있으면 안되는듯?
		int test = Integer.parseInt(a);
		System.out.println(test); // 45454535
		
		// 1차배열의 값을 꺼내 int 배열에 넣기(parse)
		int[] data_int = new int[pick.length];
		
		for (int i = 0; i < data_int.length; i++) {
			data_int[i] = Integer.parseInt(pick[i]);
		}
		
		for (int i = 0; i < data_int.length; i++) {
			System.out.println("data_int[i] : "+data_int[i]);
		}
		
		System.out.println();
		
		// arraylist 복습
		ArrayList<Integer> list_data = new ArrayList<Integer>();
		System.out.println("list_data.size() : "+list_data.size());
		
		for (int i = 0; i < s_data2.length; i++) {
			for (int j = 0; j < s_data2[0].length; j++) {
				list_data.add(i);
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < list_data.size(); i++) {
			System.out.println("list_data.get(i) : "+list_data.get(i));
		}
		
		// list_data 안의 데이터를 ArrayList(String)에 넣기 예제
		ArrayList<String> list_str = new ArrayList<String>();
		
		for (int i = 0; i < list_data.size(); i++) {
			list_str.add(list_data.get(i)+"");
		}
		
		System.out.println("list_str : "+list_str);
		
	}

}
