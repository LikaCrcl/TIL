package com;

public class Day_0302_a {

	public static void main(String[] args) {
		
		// 복습
		// 주소비교
		
		String text = "가나다라마바사아자차카타파하";
		
		String[] text_s = text.split("");
		char[] text_c = text.toCharArray();
		
		if (text_s[0] == "가") {
//			System.out.println("String_true"); // 참조타입은 == 쓰면 주소 비교 (heap 할당)
		}
		if (text_c[0] == '가') {
//			System.out.println("char_true"); // 기본타입은 == 쓰면 value를 비교 (stack 할당)
		}
		
		// 검색 단어가 무수히 많아질 때엔 어떻게 처리해야 할지 생각해보기 예제
		// 못 풂
		String example = "표제어의 범위에 따라 백과사전의 종류가 나뉘는데, 넓은 범위를 갖는 표제어들로 백과사전을 구성하는 것을 대항목주의라고 하고 상대적으로 좁은 범위의 표제어를 이용하는 것을 소항목주의라고 한다.";
		char[] ch = example.toCharArray();
		char[] ch2 = {'가', '의', '는', '라', '을', '백', '나', '데', '넓', '표'};
		String[] string_text = new String[ch2.length];
		
		for (int i = 0; i < string_text.length; i++) {
			string_text[i] = ""; // null 값 안뜨게 하기
		}
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if (ch2[j] == ch[i])
				string_text[j] += ch2[j];
			}
		}
		
		// 부터
		for (int i = 0; i < string_text.length; i++) {
			for (int j = 0; j < string_text.length; j++) {
				if (string_text[i].length() < string_text[j].length()) {
					String temp = string_text[i];
					string_text[i] = string_text[j];
					string_text[j] = temp;
				}
			}
		}
		// 까지는 내림차순 정렬 (if 조건 부호 방향 바꾸면 오름차순)
		
		for (int i = 0; i < string_text.length; i++) {
			System.out.println(string_text[i]);
		}	
		
	}

}
