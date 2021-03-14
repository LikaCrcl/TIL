package com;

import java.util.Scanner;

public class NumberBaseBall {
	
	

	public static void main(String[] args) {
		
		// 이론 노잼이라 해보는 숫자야구 만들어보기
		
		// 0이 아닌 랜덤 미중복 세자리 숫자 생성
		int random_num = (int)(Math.random()*9)+1;
		
		for (int i = 0; i < 10; i++) {
			System.out.print((int)(Math.random()*9)+1);
		}
		int[] answer = new int[3];
				
		for (int i = 0; i < answer.length; i++) {
			answer[i] = random_num;
			if (i == 0) {
				
			}
			else if (i == 1) {
				while (answer[i] == answer[i-1] || answer[i] == answer[i+1]) {
					answer[i] = random_num;
					
				}
			}
			else {
				while (answer[i] == answer[i-1] || answer[i] == answer[i-2]) {
					answer[i] = random_num;
					
				}
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
		
		// 사용자가 세자리 숫자 입력
		
		
		// 생성된 숫자와 비교
		

	}
	

}
