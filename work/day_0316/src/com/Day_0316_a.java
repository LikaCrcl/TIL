package com;

import java.util.HashMap;

import test.Bakery2;

public class Day_0316_a extends Bakery2 { // �� Ŭ����(Bakery2)�� �� Ŭ����(Day_0316_a)�� �θ� Ŭ����(super��� �Ѵٰ� ��)

	public static void main(String[] args) {
		
		// class�����
		// Bakery ����
		
		// data �����
		Bakery sic = new Bakery("�Ļ�", 4500, "�Ϸ�", 4.30, 30.1, 100);
		Bakery garlic = new Bakery("���û�", 3000, "6�ð�", 3.30, 50.2, 80);
		Bakery pizza = new Bakery("���ڻ�", 5000, "8�ð�", 5, 72.5, 90);
		Bakery morning = new Bakery("��׻�", 2500, "�Ϸ�", 4, 28.9, 60);
		Bakery baguette = new Bakery("�ٰ�Ʈ", 3000, "5�ð�", 4.30, 30.4, 50);
		Bakery twist = new Bakery("�ʹ��", 2000, "3�ð�", 2.30, 58.3, 65);
		Bakery danpat = new Bakery("���ϻ�", 2000, "3�ð�", 2.50, 49.2, 63);
		Bakery soboru = new Bakery("�Һ���", 2500, "4�ð�", 2, 39.5, 59);
		
		Bakery[] bread = new Bakery[] {sic, garlic, pizza, morning, baguette, twist, danpat, soboru};
		
		// �迭ó���ϱ�
		int max = 8;
		
		String[] bread_name = new String[] {"�Ļ�", "���û�", "���ڻ�", "��׻�", "�ٰ�Ʈ", "�ʹ��", "���ϻ�", "�Һ���"};
		int[] bread_price = new int[] {4500, 3000, 5000, 2500, 3000, 2000, 2000, 2500};
		String[] bread_date = new String[] {"�Ϸ�", "6�ð�", "8�ð�", "�Ϸ�", "5�ð�", "3�ð�", "3�ð�", "4�ð�"};
		double[] bread_runTime = new double[] {4.3, 3.3, 5.0, 4.0, 4.3, 2.3, 2.5, 2.0};
		double[] bread_calorie = new double[] {30.1, 50.2, 72.5, 28.9, 30.4, 58.3, 49.2, 39.5};
		int[] bread_rate = new int[] {100, 80, 90, 60, 50, 65, 63, 59};
		
		// �̻��ϰ� �ƴµ� �� �ؿ��� private ���� Ǫ���� getter ����, �׷��ٰ� �� �迭 �ٸ� Ŭ������ �Űܺ����� �̷���
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
		
		// HashMap�� �ֱ�
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
		
		// ���������ڸ� private�� �����Ͽ� name, price �� ��������� ���� ������ �� ���� �� HashMap�� �ֱ�
		// Bakery class�� getter ����
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
		
		// for each�� ����ϸ� ��
		
		// setter ����Ͽ� price 10%�� ����
		for (int i = 0; i < max; i++) {
//			int temp = (int) (bread_total[i].getPrice()-(bread_total[i].getPrice()*((double)1/10)));
			// 1/10�� �׳� ����ϰԵǸ� int�� ��µǾ� 0�� ��. ���� double�� ����ȯ�� ����� �ϰ� int�� double�� �����ϸ� double�� �ǹǷ� �ֻ����� int�� �ٽ� ����ȯ.
			// �� �̷��� ������ �� �ʿ� ����
			int temp = bread_total[i].getPrice();
			bread_total[i].setPrice(temp - temp/10);
			// ���ʿ� �Ҽ��� �Ʒ��� �������� �ʾƼ� ����ϴµ� ���� ����
//			System.out.println(bread_total[i].getPrice());
		}
		
		// default protected ������
		// default�� ���� ��Ű�� ������ �־�� ȣ�� ������. ���� ����� ��Ű���� �Ұ���
		// �ݸ� protected�� ���� ��Ű�� ���� ���� Ŭ������ �׳� ȣ���� �Ұ����ϰ�, ��ӽ�Ű�� �Ǹ� ȣ���� ��������.
		
		// ���������� ����
		Bakery2 bakery2 = new Bakery2();
//		bakery2.name; �� Bakery2�� ��ӽ����������� ������ �ȵ�.
		
		Day_0316_a day = new Day_0316_a();
		day.name = "hello";
//		System.out.println(day.name); // �̷����ϸ� ��.
		// ���� protected�� ��ӽ�Ű�� ȣ�� ���������ٴ� ���� �ڼ� Ŭ�������� ȣ���� �ȴٴ� ����
		// ���⼭�� Bakery2�� �ڼ�Ŭ������ Day_0316_a�� ���̹Ƿ� ��ó�� ���ָ� name�� ���� ��������.
		
		// ���� protected�� ��� ������ �κ��̰� default�� ���� ���� ��Ű�� ���� �־�߸� ȣ�� ������.
		
		Bakery2 day2 = new Day_0316_a(); // Bakery2�� Day_~~ �� �����ֱ� ������ ��ü ���� ������.
		// ������ ���ʿ� Bakery2 Ŭ�����̱� ������ ����������� ������ ���� �Ұ���.
		
		day.name = bread_total[0].getName();
//		System.out.println(day.name);
		
		// Bakery2�� data �ű� �� �ٽ� �迭�� ǥ���غ���
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
		
		System.out.println("HashMap ���");
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

// class / ���� ������ / HashMap / ��� ����, protected ������� ��� �̿��Ͽ� �ҷ�����
