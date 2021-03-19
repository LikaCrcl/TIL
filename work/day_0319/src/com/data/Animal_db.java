package com.data;

import com.inter.Table;

public class Animal_db implements Table  {
	
	public String[] name_array = new String[] {"사자", "원숭이", "호랑이", "타조", "치타", "기린"};
	public int[] age_array = new int[] {12, 8, 14, 23, 3, 6};
	public String[] gender_array = new String[] {"수", "암", "수", "암", "수", "암"};
	public double[] speed_array = new double[] {12.5, 60, 60, 45.5, 78.6, 12};
	public String[] type_array = new String[] {"초식", "육식", "초식", "육식", "육식", "초식"};
	public double[] weight_array = new double[] {23.3, 100.5, 120.5, 90.6, 66.6, 300.3};
	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

}
