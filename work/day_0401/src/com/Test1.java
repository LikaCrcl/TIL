package com;

public class Test1 {

	public static void main(String[] args) {
		
		Car mycar = new Car("Ferrari", "red", 65000);
		Car momcar = new Car("K5", "white", 5000);
		Car dadcar = new Car(30000);
		
		mycar.engineStart();
		mycar.engineStart();
		mycar.engineStart();
		System.out.println();
		mycar.engineStop();
		mycar.engineStop();
		
		boolean a = true;
		System.out.println(!a);
		
	}

}

class Car {
	String brand;
	String color;
	int price;
	boolean status;
	
	public Car() {
		
	}
	
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Car(int price) {
		this.price = price;
	}
	
	void engineStart() {
		if (this.status == false) { // 괄호 안 부분을 !status 로 해주는게 더 좋음. !는 not 연산자인데 status가 기본으로 false로 설정되어있으니(시동이 꺼져 있으니) false일때 if문을 들어와야 하므로 !status로 써주면 됨.
									// 그렇게 써주면 시동이 켜져 있을 때(status == true일 때)는 if문에 들어오지 않게 됨.
			this.status = true;
			System.out.println(brand + " 시동 켬");
		}
		else {
			System.out.println("시동 이미 켜져있음");
		}
			
	}
	
	void engineStop() {
		if (this.status == true) { // 여기 괄호 안 부분도 status 라고 써줄 수 있음.
			this.status = false;
			System.out.println(brand + " 시동 끔");
		}
		else {
			System.out.println("시동 이미 꺼져있음");
		}
	}
	
}