package bms;

import java.util.Scanner;

//첫 시작
public class Index {
	public static void main(String[] args) {
		System.out.println("BMS 프로그램");
		View v = new View();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 계좌개설\n2. 로그인\n3. 나가기");
			int choice = sc.nextInt();
			if(choice == 3) {
				break;
			}else if(choice == 1) {
				//계좌개설(비밀번호, 이름)
				v.joinView();
				//joinView() 내부로 이동 -> manager.join() 내부로 이동 ->joinView() 내부의 join()호출로 돌아오기
				//-> Index의 18번째 줄로 돌아오기
			}else if(choice == 2) {
				//로그인
				v.loginView();
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
