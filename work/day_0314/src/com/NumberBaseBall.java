package com;

import java.util.Scanner;

public class NumberBaseBall {
	
	

	public static void main(String[] args) {
		
		// �̷� �����̶� �غ��� ���ھ߱� ������
		
		// 0�� �ƴ� ���� ���ߺ� ���ڸ� ���� ����
		int[] answer = new int[3];
				
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int)(Math.random()*9)+1;
			if (i == 1) {
				while (answer[i] == answer[i-1]) {
					answer[i] = (int)(Math.random()*9)+1;
				}
			}
			else if (i == 2) {
				while (answer[i] == answer[i-1] || answer[i] == answer[i-2]) {
					answer[i] = (int)(Math.random()*9)+1;
				}
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
		
		// ����ڰ� ���ڸ� ���� �Է�
		
		
		// ������ ���ڿ� ��
		

	}
	

}
