package com;

public class Day_0218 {

	public static void main(String[] args) {
		
		// 상수 누락된게 있는데 상수 선언할 때 변수는 대문자로만 써야함
		// ex) final int NUM = 1;
		// 어제 switch에서 배운 default 보충
		// default는 if에서의 else와 비슷한 특성을 가지고 있음. (모두 false면 출력함)
		// 어제 전역, 지역, 매개변수 보충
		// 전역 : class 바로 안에서 선언한 것
		// 지역 : class 안의 method 안에서 선언한 것
		// 매개 : method 선언 때 () 안에 선언한 것 ex) for (int i, i < 0, i++) 에서의 i 등
		
		// switch 보충
		int key_v = 0; 
		switch (key_v) {
		case 1-1: // case에 연산자가 올 수도 있다.
			
			break;

		default:
			break;
		}
		
		// for문과 method를 이용한 간단한 계산기
		calculator(10);
		
		// 구구단 2단~9단 출력 예제
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println((i+"*"+j+"="+(i*j)));
			}
		}
		
		// method 이용 구구단 출력 예제
		for (int i = 2; i < 10; i++) {
				calculator(i);
		}
		
		// swap 이용 x에 60, y에 30 넣기
		int x = 30;
		int y = 60;
		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x : "+x+" y : "+y);
		
		// while문
		
		String name = "helloworlds";
		int n = name.length(); // name.length(); <- String의 글자 수를 int로 나타내주는 함수. n = 11
		int count = 0;
		
		while (count < n) { // for문 처럼 ()안의 조건이 true일 때 while 안의 줄들을 순서대로 읽어나감. 
			System.out.println(count+" : test");
			if (count == 3) { // 이 안에 if를 쓸 수도 있음
				break; // 여기서 break되는 조건은 count가 3이 됐을 땐데, 그 땐 이 if문을 빠져나가는게 아니라 while문 전체를 빠져나감.
			}
			count++;
		} // break가 발동?하게되면 여기로 오게되는 것임.
		
		// for문과 다른점은 for에선 i++ 등을 써서 i에 증감을 설정해주는데 while은 위에 쓴 것 처럼 count++;을 써주지 않으면 count가 증감하지 않으므로 초기 설정된 count값에서 무한히 계속 돌게 됨.
		// 여기서의 경우 count++;를 뺀다면 콘솔에 "0 : test"가 계속 무한히 출력되게 됨
		
		// while문으로 2단~9단 출력 예제
		int num = 2;
		int num2 = 1;
		
		while (num < 10) {
			while (num2 < 10) {
				System.out.println(num+"*"+num2+"="+(num*num2));
				num2++;
			}
			num++;
			num2=1; // 원래 이거 안쓰고 num++; 에서 끝내고 낑낑대고있었는데 이 줄에 println("0"); 해보고 깨달았음
			// 문제는 저 안에있는 while문의 num2는 1로 다시 돌아오지 않고 10에서 멈춰있다는 거였음
			// 그래서 다시 1로 초기화시켜줬더니 정상작동
		}
		
	}
	
	static void calculator(int n) {
		int number = n;
		for (int i = 1; i < 10; i++) {
			System.out.println(number+"*"+i+"="+number*i);
		}
	}

}
