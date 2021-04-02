package review;

public class Test4 {
	public static void main(String[] args) {
		SuperCar mycar = new SuperCar("Ferrari","Red",65000,"abcd1234");
		mycar.engineStart();
	}
}
class SuperCar extends Car{
	String pw;
	public SuperCar() {
		//Car클래스의 생성자 호출
		//super : 부모클래스의 이름
		super();
	}
	
	//Alt + Shift + S > O : pw는 본인의 필드이므로 using fields를 이용한다
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}

	//Alt + Shift + S > C : 부모 클래스에 선언되어 있는 생성자 받아서 만들기
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	
	void engineStart() {
		System.out.println(brand + " 음성으로 시동 켜기");
	}
	
	//어노테이션 
	@Override
	void engineStop() {
		System.out.println(brand + " 음성으로 시동 끄기");
	}
	

	void roofOpen() {
		System.out.println(brand+" 뚜껑열기");
	}
	void roofClose() {
		System.out.println(brand+" 뚜껑닫기");
	}
	
	
	
	
}











