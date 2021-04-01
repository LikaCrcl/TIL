package review;

public class Review1 {

	public static void main(String[] args) {
		
		Car mycar = new Car("Porsche", "yellow", 20000);
		Car momcar = new Car("Benz", "white", 30000);
		Car dadcar = new Car("BMW", "black", 10000);
		
		Car[] car_array = {mycar, momcar, dadcar};
		
		for (int i = 0; i < car_array.length; i++) {
			System.out.println(car_array[i].brand);
		}
		System.out.println();
		
		mycar.engineStart();
		mycar.engineStart();
		mycar.engineStart();
		mycar.engineStop();
		mycar.engineStop();
		
		System.out.println();
		
		momcar.engineStart();
		momcar.engineStart();
		momcar.engineStop();
		momcar.engineStop();
		
	}

}

class Car {
	
	String brand;
	String color;
	int price;
	boolean engine;
	
	Car() {}
	
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.engine = false;
	}
	
	void engineStart() {
		if (!engine) {
			this.engine = true;
			System.out.println(brand + " 시동 켬");
		}
		else {
			System.out.println(brand+" 시동 켜져 있음");
		}
	}
	
	void engineStop() {
		if (engine) {
			this.engine = false;
			System.out.println(brand + " 시동 끔");
		}
		else {
			System.out.println(brand+" 시동 꺼져 있음");
		}
	}
	
}