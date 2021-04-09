package view;

import java.util.Scanner;

//	  DTO		 DTO
//View -> DAO ---conn---> DB

public class Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국비반 자바 최종 프로젝트 / UMS 프로그램");
		
		while(true) {
			System.out.println("1. 회원가입\n2. 로그인\n3. 나가기");
			int choice = sc.nextInt();
			if(choice == 3) {
				System.out.println("안녕히가세요.");
				break;
			}
			switch(choice) {
			case 1:
				//회원가입
				new JoinView();
				break;
			case 2:
				//로그인
				new LoginView();
				break;
			}
		}
	}
}
