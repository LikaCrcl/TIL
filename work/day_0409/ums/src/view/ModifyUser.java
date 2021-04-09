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
		System.out.println("1. 비밀번호 수정\n2. 핸드폰 번호 수정\n3. 회원 탈퇴\n4. 뒤로가기");
		int choice = sc.nextInt();
		if (choice != 4) {
			if (choice == 3) {
				//회원탈퇴
				pdao.deleteAll(userid);
				if(udao.leaveId()) {
					System.out.println(userid+"님 그동안 감사했습니다.");
					Session.setData("login_id",null);
				}
			} else {
				//회원정보 수정
				boolean check = false;
				String newData = sc.next();
				switch (choice) {
				case 1:
					//비밀번호(1번방)
					check = udao.updateUser(userid,1,newData);
					break;
				case 2:
					//핸드폰 번호(4번방)
					check = udao.updateUser(userid,4,newData);
					break;
				}
				if(check) {
					System.out.println("회원 정보 수정 완료!");
				}else {
					System.out.println("회원 정보 수정 실패 / 다시 시도해 주세요.");
				}
			}
		}
	}
}











