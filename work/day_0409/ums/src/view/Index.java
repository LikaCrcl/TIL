package view;

import java.util.Scanner;

//	  DTO		 DTO
//View -> DAO ---conn---> DB

public class Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �ڹ� ���� ������Ʈ / UMS ���α׷�");
		
		while(true) {
			System.out.println("1. ȸ������\n2. �α���\n3. ������");
			int choice = sc.nextInt();
			if(choice == 3) {
				System.out.println("�ȳ���������.");
				break;
			}
			switch(choice) {
			case 1:
				//ȸ������
				new JoinView();
				break;
			case 2:
				//�α���
				new LoginView();
				break;
			}
		}
	}
}
