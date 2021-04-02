package review;

import java.util.Scanner;

public class Test2 {
	static int data3;
	int data2;	
	Scanner sc;
	public static void main(String[] args) {
		int data;
		for (int i = 0; i < args.length; i++) {
			
		}
//		System.out.println(data3);
//		System.out.println(data2);
//		sc.next();
//		System.out.println(i);
//		Scanner sc;
//		sc.next();
		Car mycar = new Car("Ferrari","Red",65000);
		Car momcar = new Car("K7", "White", 7000);
//		System.out.println
		Car dadcar = new Car(30000);
		//내 차 시동켜기
		mycar.engineStart();//Ferrari 시동 켜기
		mycar.engineStart();//이미 시동이 켜져있습니다.
		mycar.engineStart();//이미 시동이 켜져있습니다.
		mycar.engineStart();//이미 시동이 켜져있습니다.
		mycar.engineStart();//이미 시동이 켜져있습니다.
		momcar.engineStart();//K7 시동 켜기
		data = 10;
		System.out.println(data+5);
		
		
		
	}
	void f() {
		System.out.println(data2);
		sc.next();
	}
}
class Car{
	String brand;
	String color;
	int price;
	boolean engine;
	
	//Alt+Shift+S > O : 필드 변수들 이용해서 생성자 만들기
	public Car() {}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.engine = false;
	}
	
	public Car(int price) {
		this.price=price;
	}
	
	
	void engineStart() {
		if(!engine) {
			//~~ 할 때 / 엔진이 꺼져있을 때(if)
			System.out.println(brand + " 열쇠로 시동 켜기");
			engine=true;
		}else {
			//그 외
			System.out.println("이미 시동이 켜져있습니다.");
		}
	}
	
	void engineStop() {
		if(engine) {
			System.out.println(brand + " 열쇠로 시동 끄기");
			engine=false;
		}else {
			System.out.println("이미 시동이 꺼져있습니다.");
		}
	}
	
	
}





