package review;

public class Review2 {

	public static void main(String[] args) {
		
		SuperCar mycar = new SuperCar("McLaren", "Red", 100000, "1234");
		
		System.out.println(mycar.pw);
		
		mycar.engineStart();
		mycar.engineStop();

	}

}

class SuperCar extends Car {
	
	String pw;
	
	SuperCar() {
		super();
	}

	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}
	
	@Override
	void engineStart() {
		System.out.println(brand + " À½¼º ÀÎ½ÄµÊ, ½Ãµ¿ ÄÔ");
	}
	
	@Override
	void engineStop() {
		System.out.println(brand + " À½¼º ÀÎ½ÄµÊ, ½Ãµ¿ ²û");
	}
	
}