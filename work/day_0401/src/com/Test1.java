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
		if (this.status == false) { // ��ȣ �� �κ��� !status �� ���ִ°� �� ����. !�� not �������ε� status�� �⺻���� false�� �����Ǿ�������(�õ��� ���� ������) false�϶� if���� ���;� �ϹǷ� !status�� ���ָ� ��.
									// �׷��� ���ָ� �õ��� ���� ���� ��(status == true�� ��)�� if���� ������ �ʰ� ��.
			this.status = true;
			System.out.println(brand + " �õ� ��");
		}
		else {
			System.out.println("�õ� �̹� ��������");
		}
			
	}
	
	void engineStop() {
		if (this.status == true) { // ���� ��ȣ �� �κе� status ��� ���� �� ����.
			this.status = false;
			System.out.println(brand + " �õ� ��");
		}
		else {
			System.out.println("�õ� �̹� ��������");
		}
	}
	
}