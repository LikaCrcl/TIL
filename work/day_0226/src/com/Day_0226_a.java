package com;

public class Day_0226_a {
	
	static String text = "abcde";

	public static void main(String[] args) {
		
		// substring
		String a = "hello".substring(1); // String을 시작인덱스(여기선 1) 전까지 잘라서 가져오는 함수. 시작인덱스 포함함
		System.out.println(a); // substring으로 1을 씀. 1에 해당하는 값은 e 이므로 e 앞의 h는 잘림. 결과값은 ello
		
		String b = "hello".substring(1, 4); // String을 시작인덱스부터 종료인덱스까지 자르는 함수. 시작인덱스 포함함. 종료 인덱스는 포함하지 않음
		System.out.println(b); // ell
		
		// for문과 String을 사용하여 char[]에 넣은 다음 리턴값으로 처리하기 예제 (toCharArray 사용x)
		// 못 풂
		// 아니근데 toCharArray2에서 n이 0, 1, 2일때 값을 직접 다 정해줬는데 그러면 여기서 String은 어디에 쓰인거임? String의 의미가 없잖아 시발
		// String을 char로 변환하되 toCharArray를 쓰지않는 거창한 방법이 있는줄 알고 고민 ㅈㄴ하고있었는데 개뿔 그딴거 없었음 이거 왜한건지 1도 이해안됨
		char[] d = toCharArray2();
		System.out.println(d);
		
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		// (String).charAt(index)
		char aa = text.charAt(0);
		System.out.println(aa); // String의 index 번째에 위치한 character를 출력해주는 함수 
		
		// String[] x = (String a).split("(String b)");
		String[] bb = text.split("c");
		System.out.println(bb[0]); // ab
		System.out.println(bb[1]); // de
		// (String a)에서 "(String b)" 을 제외한 각각의 값들을 배열에 입력하는 함수.
		// 위에서 c를 기준삼았기 때문에 배열에 2개의 값이 입력됨. (ab / c / de)
		// 기준 "(String b)"이 (String a)에 없다면 (String a) 전체를 가져옴.
		// "(String b)" 에 ""을 입력하면 (String a)의 각각의 문자 하나하나를 짤라서 배열에 입력함 ex) "abcde".split(""); => a, b, c, d, e
		
		// split 연습
		System.out.println("split연습");
		String[] test_split = "ab;cd;ef;gh".split(";");
		System.out.println(test_split.length); // ab, cd, ef, gh의 4.
		for (int i = 0; i < test_split.length; i++) {
			System.out.println(test_split[i]); // 0 : ab, 1 : cd, 2 : ef, 3 : gh
		}
		
		String[] test_split2 = "abcdefa".split("a");
		System.out.println("나옴?"+test_split2[0]); // "" 출력됨
		
		// String x = (String a).strip();
		String a_strip = " abc ".strip();
		System.out.println("부터"+a_strip+"까지"); // (String a)의 앞 뒤에 있는 공백(" ")을 없애주는 함수
		
		String a2_strip = " a b c ".strip();
		System.out.println(a2_strip); // 맨 앞, 맨 뒤만 없애줌
		
		// (String a) = (String a).replace('a', 'b');
		// String a 에서 'a'를 'b'로 치환하는 함수
		String a_replace = "hello";
		a_replace = a_replace.replace('h', 'p');
		System.out.println(a_replace); // pello 출력
		
		// toUpperCase, toLowerCase
		// (String a) = (String a).toUpper(Lower)Case();
		// (String a)를 전부 Upper의 경우 대문자로, Lower의 경우 소문자로 바꿔주는 함수
		String a_case = "hi im noob";
		a_case = a_case.toUpperCase();
		System.out.println(a_case); // HI IM NOOB
		a_case = a_case.toLowerCase();
		System.out.println(a_case); // hi im noob
		
		a_case = "Hi Im Noob";
		a_case = a_case.toUpperCase();
		System.out.println(a_case); // 섞여있어도 전부 대문자로
		
		// 예문에서 '의', '가', '는', '라' 각각 제일 많이 나온 순서대로 String 배열에 넣어서 출력하기 예제
		// 못풂
		String example = "표제어의 범위에 따라 백과사전의 종류가 나뉘는데, 넓은 범위를 갖는 표제어들로 백과사전을 구성하는 것을 대항목주의라고 하고 상대적으로 좁은 범위의 표제어를 이용하는 것을 소항목주의라고 한다.";
		String[] answer = new String[example.length()];
				
		for (int i = 0; i < example.length(); i++) {
			if (example.charAt(i) == '의') { 
				answer[i] = "의";
			}
			else if (example.charAt(i) == '가') {
				answer[i] = "가";
			}
			else if (example.charAt(i) == '는') {
				answer[i] = "는";
			}
			else if (example.charAt(i) == '라') {
				answer[i] = "라";
			}
			else if (example.charAt(i) == '을') {
				answer[i] = "을";
			}
		}
				
		for (int i = 0; i < answer.length; i++) {
//			System.out.println(answer[i]);
		}
		
		// 까지 내 시도
		System.out.println();
		System.out.println("예제 답");
		System.out.println();
		
		String[] answer2 = new String[5];
		
		for (int i = 0; i < answer2.length; i++) {
			answer2[i] = "";
		}
		
		char[] ch = example.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '의') {
				answer2[0] += ch[i];
			}
			else if (ch[i] == '가') {
				answer2[1] += ch[i];
			}
			else if (ch[i] == '는') {
				answer2[2] += ch[i];
			}
			else if (ch[i] == '라') {
				answer2[3] += ch[i];
			}
			else if (ch[i] == '을') {
				answer2[4] += ch[i];
			}
		}
		
		for (int i = 0; i < answer2.length; i++) {
			System.out.println(answer2[i]+" : "+answer2[i].length());
		}
				
		for (int i = 0; i < answer2.length; i++) {
			for (int j = 0; j < answer2.length; j++) {
				if (answer2[i].length() > answer2[j].length()) {
					String temp = answer2[j];
					answer2[j] = answer2[i];
					answer2[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < answer2.length; i++) {
			System.out.println(answer2[i]+" : "+answer2[i].length());
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
