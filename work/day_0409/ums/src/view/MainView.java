package view;

import java.util.Scanner;

import dao.ProductDAO;
import dao.Session;

public class MainView {
	public MainView() {
		Scanner sc = new Scanner(System.in);
		String userid = Session.getData("login_id");
		ProductDAO pdao = new ProductDAO();
		while(true) {
			if(Session.getData("login_id")==null) {
				break;
			}
			System.out.println("1. ��ǰ�߰�\n2. ��ǰ����\n3. ��ǰ����\n4. ��ǰ���\n5. ��ǰ�˻�\n6. �� ��������\n7. �α׾ƿ�");
			int choice = sc.nextInt();
			if(choice == 7) {
				System.out.println(userid+"�� �ȳ���������.");
				Session.setData("login_id", null);
				break;
			}
			switch (choice) {
			case 1:
				//��ǰ�߰�
				new AddProductView();
				break;
			case 2:
				//��ǰ����
				new ModifyProductView();
				break;
			case 3:
				//��ǰ����
				System.out.println(pdao.showList());
				System.out.print("������ ��ǰ��ȣ : ");
				int prodnum = sc.nextInt();
				if(pdao.deleteProduct(prodnum)) {
					System.out.println(prodnum+"�� ��ǰ ���� �Ϸ�!");
				}else {
					System.out.println("���� ���� / �ٽ� �õ��� �ּ���.");
				}
				break;
			case 4:
				//��ǰ���
				System.out.println("======"+userid+"���� ��ǰ���======");
				System.out.println(pdao.showList());
				System.out.println("================================");
				break;
			case 5:
				//��ǰ�˻�
				new SearchView();
				break;
			case 6:
				//�� ��������
				new ModifyUser();
				break;
			}
		}
	}
}













