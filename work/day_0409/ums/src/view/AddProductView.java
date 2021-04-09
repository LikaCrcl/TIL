package view;

import java.util.Scanner;

import dao.ProductDAO;
import dto.ProductDTO;

public class AddProductView {
	public AddProductView() {
		//상품명, 상품가격, 상품수량, 상품설명
		Scanner sc = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		System.out.print("상품 이름 : ");
		String prodname = sc.next();
		System.out.print("상품 가격 : ");
		String prodprice = sc.next();
		System.out.print("상품 수량 : ");
		String prodamount = sc.next();
		System.out.print("상품 설명 : ");
		sc = new Scanner(System.in);
		String prodinfo = sc.nextLine();
		
		ProductDTO product = new ProductDTO(pdao.getNum(), prodname, prodprice, prodamount, prodinfo);
		if(pdao.addProduct(product)) {
			System.out.println("상품 추가 성공!");
		}else {
			System.out.println("상품 추가 실패 / 다시 시도해 주세요.");
		}
		
		
	}
}











