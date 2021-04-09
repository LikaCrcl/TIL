package view;

import java.util.Scanner;

import dao.UserDAO;
import dto.UserDTO;

public class JoinView {
	public JoinView() {
		Scanner sc = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		System.out.print("���̵� : ");
		String userid = sc.next();
		if (udao.checkId(userid)) {
			System.out.print("��й�ȣ : ");
			String userpw = sc.next();
			System.out.print("�̸� : ");
			String username = sc.next();
			System.out.print("���� : ");
			int userage = sc.nextInt();
			System.out.print("�ڵ��� ��ȣ : ");
			String userphone = sc.next();
			System.out.print("�ּ� : ");
			// ����� ������ ���ﵿ
			// sc.next() : �����
			// sc.nextLine() : ����� ������ ���ﵿ
			sc = new Scanner(System.in);
			String useraddr = sc.nextLine();
			UserDTO user = new UserDTO(userid, userpw, username, userage, userphone, useraddr);
			if (udao.join(user)) {
				System.out.println(userid + "�� ȸ�������� ���ϵ帳�ϴ�.");
			} else {
				System.out.println("ȸ������ ���� / �ٽ� �õ��� �ּ���.");
			}
		}else {
			System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
		}
		// 1.JoinView���� ������ �Է¹ޱ�
		// 2.�Է¹��� �����͵� DTO�� ����
		// 3.����� DTO��ü DAO�� �ִ� �޼ҵ忡 �Ѱ��ֱ�
		// 4.DAO�� �޼ҵ� ������ ������� �۵� �� DB�� �߰��ϱ� ��û
		// 5.���������� �߰��Ǿ����� ���θ� �Ǵ��Ͽ� JoinView�� ��� ����(true/false)
		// 6.JoinView������ ���ϵ� true/false�� ���Ͽ� �帧 �����ֱ�
	}

}
