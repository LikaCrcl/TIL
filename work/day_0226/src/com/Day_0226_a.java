package com;

public class Day_0226_a {
	
	static String text = "abcde";

	public static void main(String[] args) {
		
		// substring
		String a = "hello".substring(1); // String을 시작인덱스(여기선 1)부터 잘라서 가져오는 함수
		System.out.println(a); // substring으로 1을 썼으므로 결과값은 ello
		
		String b = "hello".substring(1, 4); // String을 시작인덱스부터 종료인덱스까지 자르는 함수
		System.out.println(b); // ell
		
		// for문과 String을 사용하여 char[]에 넣은 다음 리턴값으로 처리하기 예제
		// 못 풂
		// 아니근데 toCharArray2에서 n이 0, 1, 2일때 값을 직접 다 정해줬는데 그러면 여기서 String은 어디에 쓰인거임? String의 의미가 없잖아 시발
		// String을 char로 변환하되 toCharArray를 쓰지않는 거창한 방법이 있는줄 알고 고민 ㅈㄴ하고있었는데 개뿔 그딴거 없었음 이거 왜한건지 1도 이해안됨
		char[] d = toCharArray2();
		System.out.println(d);
		
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		
		
	}
	
	static char[] toCharArray2() {
		char[] n = new char[text.length()-2];
		n[0] = 'a';
		n[1] = 'b';
		n[2] = 'c';
		return n;
	}

}
