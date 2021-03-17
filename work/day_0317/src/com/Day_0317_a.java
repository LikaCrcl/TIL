package com;

import java.util.ArrayList;
import java.util.HashMap;

public class Day_0317_a {

	public static void main(String[] args) {
		
		String[] bread_name = new String[] {"½Ä»§", "¸¶´Ã»§", "ÇÇÀÚ»§", "¸ð´×»§", "¹Ù°ÔÆ®", "²Ê¹è±â", "´ÜÆÏ»§", "¼Òº¸·ç"};
		int[] bread_price = new int[] {4500, 3000, 5000, 2500, 3000, 2000, 2000, 2500};
		String[] bread_date = new String[] {"ÇÏ·ç", "6½Ã°£", "8½Ã°£", "ÇÏ·ç", "5½Ã°£", "3½Ã°£", "3½Ã°£", "4½Ã°£"};
		double[] bread_runTime = new double[] {4.3, 3.3, 5.0, 4.0, 4.3, 2.3, 2.5, 2.0};
		double[] bread_calorie = new double[] {30.1, 50.2, 72.5, 28.9, 30.4, 58.3, 49.2, 39.5};
		int[] bread_rate = new int[] {100, 80, 90, 60, 50, 65, 63, 59};
		
		Bakery[] bakery = new Bakery[bread_name.length];
		ArrayList<Bakery> bakery_list = new ArrayList<Bakery>();
		HashMap<String, Bakery> bakery_hash = new HashMap<>();
		
		for (int i = 0; i < bakery.length; i++) {
			bakery[i] = new Bakery(	bread_name[i],
									bread_price[i],
									bread_date[i],
									bread_runTime[i],
									bread_calorie[i],
									bread_rate[i]);
			System.out.println(bakery[i]);
			bakery_list.add(bakery[i]);
			System.out.println(bakery_list.get(i));
			bakery_hash.put(bakery[i].getName(), bakery[i]);
			System.out.println(bakery_hash.get(bread_name[i]));
		}
		
		for (int i = 0; i < bakery.length; i++) {
			System.out.print("array : "+bakery[i].getName());
			System.out.println(" ArrayList : "+bakery_list.get(i).getName());
		}
		
		for (String n : bakery_hash.keySet()) {
			System.out.println("HashMap : "+bakery_hash.get(n).getName());
		}

	}
		

}

