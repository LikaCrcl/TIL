package view;

import java.util.Scanner;

import dao.ProductDAO;
import dto.ProductDTO;

public class AddProductView {
	public AddProductView() {
		//��ǰ��, ��ǰ����, ��ǰ����, ��ǰ����
		Scanner sc = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		System.out.print("��ǰ �̸� : ");
		String prodname = sc.next();
		System.out.print("��ǰ ���� : ");
		String prodprice = sc.next();
		System.out.print("��ǰ ���� : ");
		String prodamount = sc.next();
		System.out.print("��ǰ ���� : ");
		sc = new Scanner(System.in);
		String prodinfo = sc.nextLine();
		
		ProductDTO product = new ProductDTO(pdao.getNum(), prodname, prodprice, prodamount, prodinfo);
		if(pdao.addProduct(product)) {
			System.out.println("��ǰ �߰� ����!");
		}else {
			System.out.println("��ǰ �߰� ���� / �ٽ� �õ��� �ּ���.");
		}
		
		
	}
}











