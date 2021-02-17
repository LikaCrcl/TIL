// if문 예제 중 다른사람이 쓴 코드
package day.com;

import java.util.Scanner;

public class Day_0216_method {

	public static void main(String[] args) {
		
		String subs = sub();
		String socs = soc();
		System.out.println(subs+socs);

	}
	
	static String sub() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 입력하세요 : ");
		String sub_ins = sc.next();
		return sub_ins+"과목의 점수는 ";	
		// "과목을 입력하세요 : " 나오고 스캐너 있어서 입력하고선 왜 리턴값이 안나오나 생각해봤는데
		// 이렇게 함수로 불러오면 리턴 값은 다른 함수들 다 처리하고 마지막에 나오는듯?
	}
	
	static String soc() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		String soc_ins = sc.next();
		return soc_ins+"점 입니다.";
		
	}
	
}
