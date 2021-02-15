package com;

public class Day_0215 {

	public static void main(String[] args) {
		
		// 대입연산자 +=, -=, *=, /=
		int a = 1;
		a += 1; // 기존 선언된 a 값에 += 뒤에 오는 값을 더한다. 이 경우에서 ex) a += 3;이면 a = 4. -=, *=, /=, %=(나머지) 모두 마찬가지
		System.out.println(a); // 2
		
		// 비교연산자(논리연산자) >, <, >=, <= (* 부등호가 앞에 와야함. =>, =< : X ), !=(틀리다), ==(같다)
		// cf. boolean
		System.out.println(4>3); // true
		System.out.println(4<3); // false
		System.out.println(4>=4); // true
		System.out.println(4!=3); // true
		System.out.println(4==4); // true
		
		// 관계 논리 연산자 && (and, 둘 다), ||(or, 둘 중 하나), &, | (비트 연산자인데 후에 다룰 예정)
//		System.out.println(true && false);
//		System.out.println(true && true);
		System.out.println(4>3 && 3>4); // false. && 연산자 사용 시 좌항과 우항 둘 다 true 여야 true 산출. 둘 중 하나라도 false 라면 false 산출
		System.out.println(4>3 && 5>4); // true
		System.out.println(4>3 || 3>4); // 반면에 || 연산자는 둘 중 하나라도 true 라면 true 산출
		System.out.println(3<=3 && 3>=3 && 3>2); // 여러개도 가능
		System.out.println((3>2 && 2>1) && 5>4); // 순서를 바꾼다거나 하고싶으면 () 로 묶기
		
		// 논리를 좌측 : xx, 우측 : xx 이런식으로 표현해보는 과제
		System.out.printf("%s%b\n%s%b\n%s%b\n", "좌측 : 3>2 ", 3>2, "우측 : 5>4 ", 5>4, "3>2 && 5>4 = ", 3>2 && 5>4); // 직접 생각해서 해본 것
		
		// 메소드를 사용한 해답
		System.out.println(left_bool() && right_bool()); // 지금 이 println이 있는 main 함수 밖에서 선언한 left_bool, right_bool이 대입됨. && 연산자에서 좌항이 false라면 우항은 계산 할 필요가 없어 출력하지 않음.
		System.out.println(left_bool() || right_bool()); // || 연산자의 경우엔 좌항이 true일 때 우항이 필요가 없어지므로 출력되지 않고 true 반환.
		System.out.println(true || true && false); // true가 나오는 이유는 &&, || 연산자가 여러 번 오면 앞부터 읽어가며 뒤를 괄호로 묶는 것 처럼 처리하므로 이 경우 true || (true && false) 로 계산해서 true 반환됨.
		System.out.println("----");
		System.out.println(right_bool() || left_bool() && right_bool()); // 첫 항이 false 라서 그 다음 항을 봐야하는데 묶어서 처리한다고 했으므로 "좌측 :", "우측 :" 가 출력되어 우: 좌: 우: false가 나옴
		System.out.println("----");
		System.out.println(left_bool() && right_bool() || left_bool()); // 여기서도 앞이 true지만 && 라서 뒤도 봐야하므로 묶었고 || 에서 첫항 false이므로 그 뒷 항 까지 읽어옴.
		// 따라서 좌: 우: 좌: true.

	}
	
	static boolean left_bool() {
		System.out.println("좌측 : true");
		return true;
	}
	
	static boolean right_bool() {
		System.out.println("우측 : false");
		return false;
	}

}
