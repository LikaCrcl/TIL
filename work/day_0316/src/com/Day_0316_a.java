package com;

import java.util.HashMap;

import test.Bakery2;

public class Day_0316_a extends Bakery2 { // 뒤 클래스(Bakery2)가 앞 클래스(Day_0316_a)의 부모 클래스(super라고도 한다고 함)

	public static void main(String[] args) {
		
		// class만들기
		// Bakery 생성
		
		// data 만들기
		Bakery sic = new Bakery("식빵", 4500, "하루", 4.30, 30.1, 100);
		Bakery garlic = new Bakery("마늘빵", 3000, "6시간", 3.30, 50.2, 80);
		Bakery pizza = new Bakery("피자빵", 5000, "8시간", 5, 72.5, 90);
		Bakery morning = new Bakery("모닝빵", 2500, "하루", 4, 28.9, 60);
		Bakery baguette = new Bakery("바게트", 3000, "5시간", 4.30, 30.4, 50);
		Bakery twist = new Bakery("꽈배기", 2000, "3시간", 2.30, 58.3, 65);
		Bakery danpat = new Bakery("단팥빵", 2000, "3시간", 2.50, 49.2, 63);
		Bakery soboru = new Bakery("소보루", 2500, "4시간", 2, 39.5, 59);
		
		Bakery[] bread = new Bakery[] {sic, garlic, pizza, morning, baguette, twist, danpat, soboru};
		
		// 배열처리하기
		int max = 8;
		
		String[] bread_name = new String[] {"식빵", "마늘빵", "피자빵", "모닝빵", "바게트", "꽈배기", "단팥빵", "소보루"};
		int[] bread_price = new int[] {4500, 3000, 5000, 2500, 3000, 2000, 2000, 2500};
		String[] bread_date = new String[] {"하루", "6시간", "8시간", "하루", "5시간", "3시간", "3시간", "4시간"};
		double[] bread_runTime = new double[] {4.3, 3.3, 5.0, 4.0, 4.3, 2.3, 2.5, 2.0};
		double[] bread_calorie = new double[] {30.1, 50.2, 72.5, 28.9, 30.4, 58.3, 49.2, 39.5};
		int[] bread_rate = new int[] {100, 80, 90, 60, 50, 65, 63, 59};
		
		// 이상하게 됐는데 저 밑에서 private 예제 푸느라 getter 만들어서, 그러다가 위 배열 다른 클래스에 옮겨보래서 이래됨
		for (int i = 0; i < max; i++) {
//			bread_name[i] = bread[i].getName();
//			bread_price[i] = bread[i].getPrice();
//			bread_date[i] = bread[i].getDate();
//			bread_runTime[i] = bread[i].getRunTime();
//			bread_calorie[i] = bread[i].getCalorie();
//			bread_rate[i] = bread[i].getRate();
		}
		
		for (int i = 0; i < max; i++) {
//			System.out.println(bread_name[i]);
//			System.out.println(bread_price[i]);
//			System.out.println(bread_date[i]);
//			System.out.println(bread_runTime[i]);
//			System.out.println(bread_calorie[i]);
//			System.out.println(bread_rate[i]);
		}
		
		Bakery[] bread_total = new Bakery[bread_name.length];
		
		for (int i = 0; i < bread_name.length; i++) {
//			Bakery temp = new Bakery(bread_name[i], bread_price[i], bread_date[i], bread_runTime[i], bread_calorie[i], bread_rate[i]);
//			bread_total[i] = temp;
		}
		
		for (int i = 0; i < bread_total.length; i++) {
//			System.out.println(bread_total[i].name);
		}
		
		// HashMap에 넣기
		HashMap<String, Bakery> bakery_hash = new HashMap<>();
		
		for (int i = 0; i < bread_total.length; i++) {
			bakery_hash.put(bread[i].getName(), bread_total[i]);
		}
		
//		for (Bakery i : bakery_hash.keySet()) {
//			System.out.println("name : "+bakery_hash.get(i).name);
//			System.out.println("price : "+bakery_hash.get(i).price);
//			System.out.println("date : "+bakery_hash.get(i).date);
//			System.out.println("runtime : "+bakery_hash.get(i).runTime);
//			System.out.println("calorie : "+bakery_hash.get(i).calorie);
//			System.out.println("rate : "+bakery_hash.get(i).rate);
//			System.out.println();
//		}
		
		// 접근제한자를 private로 설정하여 name, price 등 멤버변수에 직접 접근할 수 없을 때 HashMap에 넣기
		// Bakery class에 getter 생성
		for (int i = 0; i < max; i++) {
			Bakery temp = new Bakery(bread[i].getName(),
						bread[i].getPrice(),
						bread[i].getDate(),
						bread[i].getRunTime(),
						bread[i].getCalorie(),
						bread[i].getRate());
			bread_total[i] = temp;
		}
		
		for (int i = 0; i < max; i++) {
			bakery_hash.put(bread_total[i].getName(), bread_total[i]);
		}
		
		// for each로 출력하면 됨
		
		// setter 사용하여 price 10%씩 빼기
		for (int i = 0; i < max; i++) {
//			int temp = (int) (bread_total[i].getPrice()-(bread_total[i].getPrice()*((double)1/10)));
			// 1/10은 그냥 출력하게되면 int로 출력되어 0이 됨. 따라서 double로 형변환을 해줘야 하고 int와 double을 연산하면 double이 되므로 최상위에 int로 다시 형변환.
			// 는 이렇게 더럽게 할 필요 없음
			int temp = bread_total[i].getPrice();
			bread_total[i].setPrice(temp - temp/10);
			// 애초에 소수점 아래로 내려가질 않아서 계산하는데 문제 없음
//			System.out.println(bread_total[i].getPrice());
		}
		
		// default protected 차이점
		// default는 같은 패키지 내에만 있어야 호출 가능함. 설령 상속을 시키더라도 불가능
		// 반면 protected는 같은 패키지 내에 없는 클래스를 그냥 호출은 불가능하고, 상속시키게 되면 호출이 가능해짐.
		
		// 접근제한자 실험
		Bakery2 bakery2 = new Bakery2();
//		bakery2.name; 은 Bakery2를 상속시켜줬음에도 여전히 안됨.
		
		Day_0316_a day = new Day_0316_a();
		day.name = "hello";
//		System.out.println(day.name); // 이렇게하면 됨.
		// 따라서 protected가 상속시키면 호출 가능해진다는 말은 자손 클래스에서 호출이 된다는 말임
		// 여기서는 Bakery2의 자손클래스가 Day_0316_a인 것이므로 위처럼 해주면 name에 접근 가능해짐.
		
		// 까지 protected일 경우 가능한 부분이고 default는 오직 같은 패키지 내에 있어야만 호출 가능함.
		
		Bakery2 day2 = new Day_0316_a(); // Bakery2에 Day_~~ 가 속해있기 때문에 객체 생성 가능함.
		// 하지만 애초에 Bakery2 클래스이기 때문에 멤버변수에는 여전히 접근 불가함.
		
		day.name = bread_total[0].getName();
//		System.out.println(day.name);
		
		// Bakery2에 data 옮긴 후 다시 배열로 표현해보기
		Bakery[] bakery_array = new Bakery[8];
		HashMap<String, Bakery> bakery_hash1 = new HashMap<>();
		
		for (int i = 0; i < bakery_array.length; i++) {
			Bakery temp = new Bakery(
					day.bread_name[i], 
					day.bread_price[i],
					day.bread_date[i], 
					day.bread_runTime[i],
					day.bread_calorie[i],
					day.bread_rate[i]);
			bakery_array[i] = temp;
		}
		
		for (int i = 0; i < bakery_array.length; i++) {
			bakery_hash1.put(day.bread_name[i], bakery_array[i]);
		}
		
		System.out.println("HashMap 출력");
		System.out.println();
		
		for (String n : bakery_hash1.keySet()) {
			System.out.println("name : "+bakery_hash1.get(n).getName());
			System.out.println("price : "+bakery_hash1.get(n).getPrice());
			System.out.println("date : "+bakery_hash1.get(n).getDate());
			System.out.println("runTime : "+bakery_hash1.get(n).getRunTime());
			System.out.println("calorie : "+bakery_hash1.get(n).getCalorie());
			System.out.println("rate : "+bakery_hash1.get(n).getRate());
			System.out.println();
		}
		
	}
	
}

// class / 접근 제한자 / HashMap / 상속 복습, protected 멤버변수 상속 이용하여 불러오기
