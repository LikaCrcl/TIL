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
			System.out.println("1. 상품추가\n2. 상품수정\n3. 상품삭제\n4. 상품목록\n5. 상품검색\n6. 내 정보수정\n7. 로그아웃");
			int choice = sc.nextInt();
			if(choice == 7) {
				System.out.println(userid+"님 안녕히가세요.");
				Session.setData("login_id", null);
				break;
			}
			switch (choice) {
			case 1:
				//상품추가
				new AddProductView();
				break;
			case 2:
				//상품수정
				new ModifyProductView();
				break;
			case 3:
				//상품삭제
				System.out.println(pdao.showList());
				System.out.print("삭제할 상품번호 : ");
				int prodnum = sc.nextInt();
				if(pdao.deleteProduct(prodnum)) {
					System.out.println(prodnum+"번 상품 삭제 완료!");
				}else {
					System.out.println("삭제 실패 / 다시 시도해 주세요.");
				}
				break;
			case 4:
				//상품목록
				System.out.println("======"+userid+"님의 상품목록======");
				System.out.println(pdao.showList());
				System.out.println("================================");
				break;
			case 5:
				//상품검색
				new SearchView();
				break;
			case 6:
				//내 정보수정
				new ModifyUser();
				break;
			}
		}
	}
}













