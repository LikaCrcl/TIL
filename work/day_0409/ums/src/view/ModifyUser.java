package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;
import dao.UserDAO;

public class ModifyUser {
	public ModifyUser() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		ProductDAO pdao = new ProductDAO();
		String userid = Session.getData("login_id");
		System.out.println("1. ��й�ȣ ����\n2. �ڵ��� ��ȣ ����\n3. ȸ�� Ż��\n4. �ڷΰ���");
		int choice = sc.nextInt();
		if (choice != 4) {
			if (choice == 3) {
				//ȸ��Ż��
				pdao.deleteAll(userid);
				if(udao.leaveId()) {
					System.out.println(userid+"�� �׵��� �����߽��ϴ�.");
					Session.setData("login_id",null);
				}
			} else {
				//ȸ������ ����
				boolean check = false;
				String newData = sc.next();
				switch (choice) {
				case 1:
					//��й�ȣ(1����)
					check = udao.updateUser(userid,1,newData);
					break;
				case 2:
					//�ڵ��� ��ȣ(4����)
					check = udao.updateUser(userid,4,newData);
					break;
				}
				if(check) {
					System.out.println("ȸ�� ���� ���� �Ϸ�!");
				}else {
					System.out.println("ȸ�� ���� ���� ���� / �ٽ� �õ��� �ּ���.");
				}
			}
		}
	}
}











