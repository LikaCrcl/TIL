package bms;

import java.util.Random;

public class BankManager {
	static Bank[][] arUser = new Bank[3][1000];
	static int[] arCnt = {0,0,0};
	
	void join(int bankChoice, String pw, String name) {
		//계좌 개설하는 알고리즘 구현
		Random r = new Random();
		
		//"10000"~"99999"
		//0 ~ 89999
		String account = r.nextInt(90000)+10000+"";
		boolean flag = true;
		//중복체크
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
			//국민은행
			arUser[ 0 ][     arCnt[0]     ] = new Kookmin(account, pw, name);
			arCnt[0]++;
			break;
		case 2:
			//신한은행
			arUser[1][     arCnt[1]     ] = new Shinhan(account, pw, name);
			arCnt[1]++;
			break;
		case 3:
			//우리은행
			arUser[2][     arCnt[2]     ] = new Woori(account, pw, name);
			arCnt[2]++;
			break;
		}
		System.out.println(name+"님 가입을 환영합니다!\n계좌번호 : "+account);
		
	}
	Bank login(String account, String pw) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < arCnt[i]; j++) {
				if(arUser[i][j].account.equals(account)) {
					if(arUser[i][j].pw.equals(pw)) {
						//arUser[i][j] : 로그인 시도하는 그 객체
						return arUser[i][j];
					}
				}
			}
		}
		return null;
	}
	
}












