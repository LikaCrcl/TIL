package view;

import java.util.Scanner;

import dao.UserDAO;
import dto.UserDTO;

public class JoinView {
	public JoinView() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		System.out.print("아이디 : ");
		String userid = sc.next();
		if (udao.checkId(userid)) {
			System.out.print("비밀번호 : ");
			String userpw = sc.next();
			System.out.print("이름 : ");
			String username = sc.next();
			System.out.print("나이 : ");
			int userage = sc.nextInt();
			System.out.print("핸드폰 번호 : ");
			String userphone = sc.next();
			System.out.print("주소 : ");
			// 서울시 강남구 역삼동
			// sc.next() : 서울시
			// sc.nextLine() : 서울시 강남구 역삼동
			sc = new Scanner(System.in);
			String useraddr = sc.nextLine();
			UserDTO user = new UserDTO(userid, userpw, username, userage, userphone, useraddr);
			if (udao.join(user)) {
				System.out.println(userid + "님 회원가입을 축하드립니다.");
			} else {
				System.out.println("회원가입 실패 / 다시 시도해 주세요.");
			}
		}else {
			System.out.println("중복된 아이디가 있습니다.");
		}
		// 1.JoinView에서 데이터 입력받기
		// 2.입력받은 데이터들 DTO로 포장
		// 3.포장된 DTO객체 DAO에 있는 메소드에 넘겨주기
		// 4.DAO의 메소드 내에서 기능적인 작동 후 DB에 추가하기 요청
		// 5.정상적으로 추가되었는지 여부를 판단하여 JoinView에 결과 리턴(true/false)
		// 6.JoinView에서는 리턴된 true/false를 통하여 흐름 나눠주기
	}

}
