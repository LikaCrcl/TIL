package bms;

import java.util.Random;

public class BankManager {
	static Bank[][] arUser = new Bank[3][1000];
	static int[] arCnt = {0,0,0};
	
	void join(int bankChoice, String pw, String name) {
		//���� �����ϴ� �˰��� ����
		Random r = new Random();
		
		//"10000"~"99999"
		//0 ~ 89999
		String account = r.nextInt(90000)+10000+"";
		boolean flag = true;
		//�ߺ�üũ
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < arCnt[i]; j++) {
				if(arUser[i][j].account.equals(account)) {
					account = r.nextInt(90000)+10000+"";
					flag =false;
					break;
				}
			}
			if(!flag) {
				i = -1;
				flag = true;
			}
		}
		
		switch(bankChoice) {
		case 1:
			//��������
			arUser[ 0 ][     arCnt[0]     ] = new Kookmin(account, pw, name);
			arCnt[0]++;
			break;
		case 2:
			//��������
			arUser[1][     arCnt[1]     ] = new Shinhan(account, pw, name);
			arCnt[1]++;
			break;
		case 3:
			//�츮����
			arUser[2][     arCnt[2]     ] = new Woori(account, pw, name);
			arCnt[2]++;
			break;
		}
		System.out.println(name+"�� ������ ȯ���մϴ�!\n���¹�ȣ : "+account);
		
	}
	Bank login(String account, String pw) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < arCnt[i]; j++) {
				if(arUser[i][j].account.equals(account)) {
					if(arUser[i][j].pw.equals(pw)) {
						//arUser[i][j] : �α��� �õ��ϴ� �� ��ü
						return arUser[i][j];
					}
				}
			}
		}
		return null;
	}
	
}












