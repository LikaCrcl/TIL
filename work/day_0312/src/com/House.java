package com;

public class House {
	
	House () {
		System.out.println("test"); // default ������
	}
	
	House (String print) {
		System.out.println(print); // �������� ������ ��
	}
	
	public House (int house_size, int house_room, int house_toilet, String house_gagu, String house_elec, String house_host) {
		
		this.house_size = house_size;
		this.house_room = house_room;
		this.house_toilet = house_toilet;
		this.house_gagu = house_gagu;
		this.house_elec = house_elec;
		this.house_host = house_host;
		// this�� ������ �� �ڸ��� ǥ�����ִ� �����̶�� ���� �ɵ�. Day���Ͽ��� class ������ inho_1���� ��������� ������ this�� inho_1�� ġȯ�Ǵ� ����?
		// Ǯ�� �� ���ڸ� inho_1.house_size = house_size; �� �Ǵ� ������.
		// ���� ���� �� �� ������ this ���� ������ �� Ŭ������ ���������̰� = ���� ������ () ���� ���� �Է����� ��������
		
	}
	
	int house_size;
	int house_room;
	int house_toilet;
	String house_gagu;
	String house_elec;
	String house_host;

}
