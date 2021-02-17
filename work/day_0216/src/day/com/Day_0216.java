package day.com;

import java.util.Scanner;

public class Day_0216 {

	public static void main(String[] args) {
		
		// 증감연산자
		int a = 1;
		int b = a++; // a에 후위가 적용되어 다음 호출되는 a는 2임
		
		System.out.println(b); // 위에서 후위로 a++ 가 왔지만 a가 호출되지는 않았기 때문에 1 출력
		System.out.println(a+b); // a=2, b=1
		System.out.println(b); // a의 값은 변했지만 b는 위에서 선언한 그 순간에 멈춰있음
		
		b = ++a; // a는 2였고 전위 적용됨
		
		System.out.println(b); // 3
		
		double c = Math.random()+10;
		System.out.println(c);
		 
		long d = (long) (Math.random()*100);
		System.out.println(d);
		
		System.out.println(Math.round(3.50)); // 반올림
		System.out.println(Math.PI);
		System.out.println(Math.abs(-100)); // 절댓값
		System.out.println(Math.floor(3.14)); // 소수점 이하 버림
		System.out.println(Math.floor(-2.1)); // 음수는 버려서 더 작아지므로 -3.0이 나옴. 올림? 이라고 생각하면 편할듯
		
		// 제어문 - 조건문(if문, switch문), 반복문(for문, while문)
		// if문		 
		// 기본 형식 : if(조건 (ex 3>2 등)){}
		// 조건이 true라면 중괄호 안 코드를 읽고, false라면 중괄호를 읽지 않고 건너뛴다.
		if (4>3) {
			System.out.println("영화보기");
		}
		
		if (4>2)
			System.out.println("ㅎㅇ"); // if문 안에서 하고싶은 행동?이 한 줄 일때는 {}를 생략할 수 있다.
		
		if (3<2)
			System.out.println("ㅗ"); // false라 얘는 출력 안됨 ({} 생략)
			System.out.println("ㅗ2"); // if (3<2)에 포함되는 줄이 아닌 독립적인 print
			
		if (4>3 != 4>3)
			System.out.println("ㅇㅇ"); // 출력 안됨
		else // if문 조건이 false일 때 무언가 하고 싶다면 else
			System.out.println("ㄴㄴ"); // 얘도 한줄이면 {} 생략 가능
		
		// if문을 여러번 쓰고 싶으면 else if (true가 오는 순간 그 아래로 무시되는 점이 || 연산자의 성질과 유사)
		if (false) { // 여기가 true였다면 이 밑의 else if들은 의미 없어짐
			System.out.println("첫째 조건 성립");
		}
		else if (false) { // 여기도 true였으면 밑에 무시
			System.out.println("둘째 조건 성립");
		}
		else if (true) {
			System.out.println("셋째 조건 성립"); // 얘만 출력됨
		}
		
		// 점수가 100점일 때, 90이상 100미만일때, 90미만일 때 각각 출력하는 예제

		// 변수로 세운 코드
		int score=90;
		// 스캐너를 쓸 수도 있음
//		Scanner sc = new Scanner(System.in);
//		int score;
//		
//		System.out.print("점수 입력(숫자만 쓸 것) : ");
//		score = sc.nextInt();
		
		if (score == 100) {
			System.out.println("100점");
		}
		else if (score >= 90) {
			System.out.println("90점 이상 100점 미만");
		}
		else {
			System.out.println("90점 미만");
		}
		
		// 중첩 if문
		// 국영수 100점이면 100점이다 출력, 100점 아닌건 아닌 점수 출력
		int kor=20;
		int eng=60;
		int math=100;
		
		if (kor == 100) {
			if (math == 100) {
				if (eng == 100) {
					System.out.println("전부 100점");
				}
				else {
					System.out.println("국 수 : 100, 영어 : "+eng);
				}
			}
			else if (eng == 100) {
				System.out.println("국 영 : 100, 수학 : "+math);
			}
			else {
				System.out.println("국어 : 100, 영어 : "+eng+", 수학 : "+math);
			}
		}
		else if (math == 100) {
			if (eng == 100) {
				System.out.println("영 수 : 100, 국어 : "+kor);
			}
			else {
				System.out.println("수학 : 100, 국어 : "+kor+", 영어 : "+eng);
			}
		}
		else if (eng == 100) {
			System.out.println("영어 : 100, 국어 : "+kor+", 수학 : "+math);
		}
		else {
			System.out.println("국어 : "+kor+", 영어 : "+eng+", 수학 : "+math);
		}
		
		// 짝홀판독기
		int num = 10;
		
		if (num%2 == 0) { // % : 나머지 연산자
			System.out.println("짝수입니다 "+num);
		}
		else {
			System.out.println("홀수입니다 "+num);
		}
		
		// switch 조건문
		int num2 = 3;
		
		switch (num2) { // num2 자리에는 String, int만 올 수 있음.
			case 1:
				System.out.println("1 : "+num2);
				break; // break; 가 없으면 해당하는 조건 이하 모든줄을 출력함.
			case 2:
				System.out.println("2 : "+num2);
				break; // 만약 num2 = 2 였고 break; 가 없었다면 콘솔에는 2 : 2, 3 : 2, 4 : 2, 5 : 2 가 전부 출력됐을 것임.
			case 3:
				System.out.println("3 : "+num2);
				break; // 대체로 break;를 사용하지만 안 쓰는 경우도 있긴함.
			case 4:
				System.out.println("4 : "+num2);
				break;
			case 5:
				System.out.println("5 : "+num2);
				break;
		}
		
		

	}
}
