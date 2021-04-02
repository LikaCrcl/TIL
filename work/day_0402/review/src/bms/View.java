package bms;

import java.util.Scanner;

public class View {
	
	void loginView() {
		Scanner sc = new Scanner(System.in);
		BankManager manager2 = new BankManager();
		System.out.print("���¹�ȣ : ");
		String account = sc.next();
		System.out.print("��й�ȣ : ");
		String pw = sc.next();
		//session : �α��� ������ ������ ��� ����
		Bank session = manager2.login(account, pw);
		if(session != null) {
			System.out.println(session.name+"�� �������.");
			mainView(session);
		}else {
			System.out.println("�α��� ���� / �ٽ� �õ��� �ּ���.");
		}
		
	}
	void joinView() {
		Scanner sc = new Scanner(System.in);
		BankManager manager1 = new BankManager();
		System.out.println("1. ��������\n2. ��������\n3. �츮����");
		int bankChoice = sc.nextInt();
		System.out.print("��й�ȣ : ");
		String pw = sc.next();
		System.out.print("�̸� : ");
		String name = sc.next();
		manager1.join(bankChoice,pw,name);
		
	}
	void mainView(Bank session) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. �Ա��ϱ�\n2. ����ϱ�\n3. ������ȸ\n4. �α׾ƿ�");
			int choice = sc.nextInt();
			if(choice == 4) {
				break;
			}
			switch(choice) {
			case 1:
				//�Ա��ϱ�
				System.out.print("�Ա��� �ݾ� : ");
				int money = sc.nextInt();
				session.deposit(money);
				break;
			case 2:
				//����ϱ�
				System.out.print("����� �ݾ� : ");
				money = sc.nextInt();
				session.withdraw(money);
				break;
			case 3:
				//������ȸ
				session.show();
				break;
			}
		}
	}
}








