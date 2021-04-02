package bms;

import java.util.Scanner;

public class View {
	
	void loginView() {
		Scanner sc = new Scanner(System.in);
		BankManager manager2 = new BankManager();
		System.out.print("계좌번호 : ");
		String account = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		//session : 로그인 성공한 정보를 담는 공간
		Bank session = manager2.login(account, pw);
		if(session != null) {
			System.out.println(session.name+"님 어서오세요.");
			mainView(session);
		}else {
			System.out.println("로그인 실패 / 다시 시도해 주세요.");
		}
		
	}
	void joinView() {
		Scanner sc = new Scanner(System.in);
		BankManager manager1 = new BankManager();
		System.out.println("1. 국민은행\n2. 신한은행\n3. 우리은행");
		int bankChoice = sc.nextInt();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		manager1.join(bankChoice,pw,name);
		
	}
	void mainView(Bank session) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 입금하기\n2. 출금하기\n3. 계좌조회\n4. 로그아웃");
			int choice = sc.nextInt();
			if(choice == 4) {
				break;
			}
			switch(choice) {
			case 1:
				//입금하기
				System.out.print("입금할 금액 : ");
				int money = sc.nextInt();
				session.deposit(money);
				break;
			case 2:
				//출금하기
				System.out.print("출금할 금액 : ");
				money = sc.nextInt();
				session.withdraw(money);
				break;
			case 3:
				//계좌조회
				session.show();
				break;
			}
		}
	}
}








