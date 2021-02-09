package com;

public class Hello {

	public static void main(String[] args) {
		
		// 주석 처리 한 줄은 줄 맨 앞에 //, 여러 줄은 /* ~ */, 특정 줄은 다중선택 후 Ctrl + /
		// 무언가를 만들 땐 최종 버전을 따로 복제해서 주석을 다 지워줘야 좋음.
		// 정수형 byte(1byte), short(2byte), int(4byte), long(8byte) - 연산 시 기본형은 int
		// 실수형 float(4byte), double(8byte) - 연산 시 기본형은 double , float으로 숫자를 나타냈을 때 소숫점 아래 6번째 자리까지만 정확함. 0.1415926535에서 2까지만 정확. 이를 정밀도 7 이라고 한다고 함.
		// 위 float의 정밀도 측정을 할 때 1.123456789f와 0.123456789f의 결과값은 다름. 왜인지는 모르겠음
		// 문자형 char(2byte) <- 연산하게되면(ex 'a'+'a') ASCII코드로 바꿔서 정수형(int)으로 연산함 
		// 비교형 boolean(1byte) 까지 기본타입(Primitive Type) 8개.
		
		// 참조타입(Reference Type) - 위 8가지 제외 나머지 모두 참조타입 ex) 문자열 String
		
		byte b;
		b = 127;
		
		System.out.println(b+1); // 연산
		System.out.println("127"+1); // 결합 (연산x)
		
		byte c = 4;
		byte d = 4; // 같은 형이면 byte c,d; 이런식으로 선언해도 상관없음
		
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c/d);
		System.out.println(c*d);
		System.out.println("---------");
		System.out.println(4/2.0); // double형으로 표시됨
		
		char e = 'A';
		
		System.out.println(e-1); // ASCII code
		
		short f = 1;
		int g = 20000000; // 정수형의 기본형
		long h = 20000000000L; // L은 접미사. long h=20000000000; 은 틀림
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		long i = g*1000;
		
		System.out.println(i); // long i = g*1000; 에서 좌항은 long, 우항은 int(정수형의 연산은 기본형이 int)이기 때문에 원하는 값이 안나옴. 우항을 long으로 명시적 형변환 해줘야 함.
		
		long j = (long)g*1000;
		
		System.out.println(j);
		
		int k = 100;
		
		System.out.println("hello : "+k+k); // String + int = String 이라 100100으로 나옴. hello : 200을 나타내고 싶으면 "hello : "+(k+k)
		
		char l = 'A';
		String m = "A"; // char l = ''; (X), String m = ""; (O)
		
		System.out.println(l+m); // char + String => String + String.
		
		char n = 'A'+'0';
		
		System.out.println(n);
		System.out.println('A'+'0');
		System.out.println((char)'A'+'0'); // 'A' 는 char로 변환됐지만 뒤의 '0' 가 int라서 int로 결과 도출됨
		System.out.println((char)('A'+'0'));
		
		String bin = Integer.toBinaryString(10);		
		String oct = Integer.toOctalString(10); // 이 세 코드로 인해 나오는 값들은 전부 String임
		String hex = Integer.toHexString(16);
		
		System.out.println(bin); // 2진수
		System.out.println(oct); // 8진수
		System.out.println(hex); // 16진수
		
		int int_bin = 0b1010; // 0bOOOO 2진수 표기법 ex) 0b1111
		int int_oct = 012; // 0OO 8진수 표기법 ex) 011
		int int_hex = 0xa; // 0xO 16진수 표기법 ex) 0xf
		
		System.out.println(int_bin);
		System.out.println(int_oct);
		System.out.println(int_hex);
		
		System.out.printf("%d\n%s\n%f", 100, "100", 3.14f); // \n : 줄바꿈, 앞 인자 100은 %d를 받고 뒷 인자 "100"은 %s를 받음. 그 뒤로도 계속 순서대로.
		// %d = decimal이라서 그냥 100, %s = String 이라서 "100", %f = float 이라서 3.14f.
		
		System.out.println();
		System.out.printf("[%-5d]\n", 100);
		System.out.printf("[%5d]\n", 100);
		
		float o = 3.141234567f;
		
		System.out.println(o);
		
		double p = 3.141234567;
		
		System.out.println(p);
		
		// 형 변환
		
		byte q = 127;
		short r = q;
		int s = r;
		long t = s;
		
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
		
		byte u;
		short v = 128;
		u = (byte)v;
		
		System.out.println(u); // overflow : max + 1 = min, min - 1 = max
		// ex) byte의 min : -128, max : 127. 위의 128은 byte max + 1. 따라서 위 print 결과는 -128
		
		float w = 3.94f;
		int x = (int)w;
		
		System.out.println(x); // float을 int로 형 변환 시 소숫점 아래 전부 버림
		
	}

}
