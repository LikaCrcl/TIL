package com;

public class Day_0308_a {

	public static void main(String[] args) {
		
		// int 2차배열을 String 2차배열에 대입하여 표현해보기 예제
		int[][] gugudan = new int[9][9];
		String[][] gu_string = new String[9][9];
		
		for (int i = 0; i < gugudan.length; i++) {
			for (int j = 0; j < gugudan[0].length; j++) {
				gugudan[i][j] = (i+1)*(j+1);
//				System.out.println(gugudan[i][j]);
			}
//			System.out.println();
		}
				
		for (int i = 0; i < gu_string.length; i++) {
			for (int j = 0; j < gu_string[0].length; j++) {
				gu_string[i][j] = (i+1)+"*"+(j+1)+"="+gugudan[i][j];
//				System.out.println(gu_string[i][j]);
			}
		}
		
		String[] a = new String[gu_string.length*gu_string[0].length];
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = "";
		}
		
		for (int i = 0; i < gu_string.length; i++) {
			for (int j = 0; j < gu_string[0].length; j++) {
				a[count++] = gu_string[i][j];
			}
		}
		
		count = 0;
		
		// 다시 String 변수에 넣고 접미사로 ; 가 오게 하기 예제 인데 뭔 개소린지 씨발존나모르겠다
		
		String b = "";
		
		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
			b += a[i]+";";
		}
		
		System.out.println(b);
		
				
	}

}
