package view;

import java.util.Scanner;

import dao.ProductDAO;

public class SearchView {
	public SearchView() {
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� Ű���� : ");
		String keyword = sc.next();
		System.out.println(pdao.search(keyword));
		System.out.print("�ڼ��� �� ��ǰ��ȣ : ");
	}
}
