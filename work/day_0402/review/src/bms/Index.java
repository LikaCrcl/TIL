package bms;

import java.util.Scanner;

//ù ����
public class Index {
	public static void main(String[] args) {
		System.out.println("BMS ���α׷�");
		View v = new View();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. ���°���\n2. �α���\n3. ������");
			int choice = sc.nextInt();
			if(choice == 3) {
				break;
			}else if(choice == 1) {
				//���°���(��й�ȣ, �̸�)
				v.joinView();
				//joinView() ���η� �̵� -> manager.join() ���η� �̵� ->joinView() ������ join()ȣ��� ���ƿ���
				//-> Index�� 18��° �ٷ� ���ƿ���
			}else if(choice == 2) {
				//�α���
				v.loginView();
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}
