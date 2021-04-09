package view;

import java.util.Scanner;

import dao.ProductDAO;

public class ModifyProductView {
	public ModifyProductView() {
		Scanner sc = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		System.out.println(pdao.showList());
		System.out.print("수정할 상품 번호 : ");
		String prodnum = sc.next();
		System.out.println("1. 가격 수정\n2. 재고 수정\n3. 설명 수정\n4. 나가기");
		int choice = sc.nextInt();
		if (choice != 4) {
			sc = new Scanner(System.in);
			System.out.print("새로운 데이터 : ");
			String newData = sc.nextLine();
			if(pdao.updateProduct(prodnum,choice,newData)) {
				System.out.println(prodnum+"번 상품 수정 완료!");
			}else {
				System.out.println("수정 실패 / 다시 시도해 주세요.");
			}
		}
		
	}
}











