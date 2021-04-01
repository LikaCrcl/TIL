package com;

public class Test3 {

	public static void main(String[] args) {
	
		SuperCar mycar = new SuperCar("Ferrari", "Red", 65000);
		mycar.engineStart();
		
	}

}

class SuperCar extends Car {
	
	String pw;
	
//	public SuperCar() {
//		super();
//	}
	// 이 SuperCar() 메소드는 따로 써주지 않아도 자동 생성되고, 부모클래스의 생성자 super() 또한 따로 써주지 않아도 Car를 상속받고있기 때문에 자동생성됨.
	
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
		// 상속받고 있지 않다면 이 아래를 써줘야하지만 상속받고있으니 생성자 super로 보냄. super는 brand, color, price에 부합하는 메소드인 Car(String, String, int)를 호출해줌.
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
	}

	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}
	
	// 위 SuperCar 직접치기 귀찮으면 Alt Shift S에서 찾아볼 수 있는데
	// 현재 클래스에 Fields값이 없고 부모클래스에서 fields값을 불러오려면 C를 누르면 됨(Generate ~~~ SuperClass)
	// 현재 클래스에 fields값이 있으면서 부모에서도 불러오고싶으면 O (~~using Fields)를 누르고 뜨는 창 상단에 해당 메소드 선택해주면 됨
	
	// engineStart 바꾸기(Overriding)
	void engineStart() {
		System.out.println(brand + " 음성으로 시동 켜기");
	}
	// 그냥 이렇게 써주면 상속해주는 부모클래스 Car에서 먼저 engineStart를 읽고, 이 SuperCar 클래스에서 다시 engineStart를 읽어 덮어버리기 때문에 이대로 출력이 됨.
	// 이것이 Overriding
	
	// 치기 귀찮으면 공백에 Ctrl+Space해서 해당 메소드 불러와서 새로 초기화(?)해주면 됨
	@Override
	void engineStop() {
		System.out.println(brand + " 음성으로 시동 끄기");
	}
	
	void roofOpen() {
		System.out.println(brand+ " 뚜껑 열기");
	}
	
	void roofClose() {
		System.out.println(brand+" 뚜껑 닫기");
	}
		
}