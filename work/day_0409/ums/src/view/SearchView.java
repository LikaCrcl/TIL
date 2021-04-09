package view;

import java.util.Scanner;

import dao.ProductDAO;

public class SearchView {
	public SearchView() {
		ProductDAO pdao = new ProductDAO();
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 키워드 : ");
		String keyword = sc.next();
		System.out.println(pdao.search(keyword));
		System.out.print("자세히 볼 상품번호 : ");
	}
}
