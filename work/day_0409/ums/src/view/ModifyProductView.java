package view;

import java.util.Scanner;

import dao.ProductDAO;

public class ModifyProductView {
	public ModifyProductView() {
		Scanner sc = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		System.out.println(pdao.showList());
		System.out.print("������ ��ǰ ��ȣ : ");
		String prodnum = sc.next();
		System.out.println("1. ���� ����\n2. ��� ����\n3. ���� ����\n4. ������");
		int choice = sc.nextInt();
		if (choice != 4) {
			sc = new Scanner(System.in);
			System.out.print("���ο� ������ : ");
			String newData = sc.nextLine();
			if(pdao.updateProduct(prodnum,choice,newData)) {
				System.out.println(prodnum+"�� ��ǰ ���� �Ϸ�!");
			}else {
				System.out.println("���� ���� / �ٽ� �õ��� �ּ���.");
			}
		}
		
	}
}











