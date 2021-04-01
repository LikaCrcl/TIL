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
	// �� SuperCar() �޼ҵ�� ���� ������ �ʾƵ� �ڵ� �����ǰ�, �θ�Ŭ������ ������ super() ���� ���� ������ �ʾƵ� Car�� ��ӹް��ֱ� ������ �ڵ�������.
	
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
		// ��ӹް� ���� �ʴٸ� �� �Ʒ��� ����������� ��ӹް������� ������ super�� ����. super�� brand, color, price�� �����ϴ� �޼ҵ��� Car(String, String, int)�� ȣ������.
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
	}

	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}
	
	// �� SuperCar ����ġ�� �������� Alt Shift S���� ã�ƺ� �� �ִµ�
	// ���� Ŭ������ Fields���� ���� �θ�Ŭ�������� fields���� �ҷ������� C�� ������ ��(Generate ~~~ SuperClass)
	// ���� Ŭ������ fields���� �����鼭 �θ𿡼��� �ҷ���������� O (~~using Fields)�� ������ �ߴ� â ��ܿ� �ش� �޼ҵ� �������ָ� ��
	
	// engineStart �ٲٱ�(Overriding)
	void engineStart() {
		System.out.println(brand + " �������� �õ� �ѱ�");
	}
	// �׳� �̷��� ���ָ� ������ִ� �θ�Ŭ���� Car���� ���� engineStart�� �а�, �� SuperCar Ŭ�������� �ٽ� engineStart�� �о� ��������� ������ �̴�� ����� ��.
	// �̰��� Overriding
	
	// ġ�� �������� ���鿡 Ctrl+Space�ؼ� �ش� �޼ҵ� �ҷ��ͼ� ���� �ʱ�ȭ(?)���ָ� ��
	@Override
	void engineStop() {
		System.out.println(brand + " �������� �õ� ����");
	}
	
	void roofOpen() {
		System.out.println(brand+ " �Ѳ� ����");
	}
	
	void roofClose() {
		System.out.println(brand+" �Ѳ� �ݱ�");
	}
		
}