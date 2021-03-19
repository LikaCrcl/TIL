package com.service;

import java.util.ArrayList;

import com.data.House_db;
import com.inter.Table;
import com.sm.House_sm;

public class House_service implements Table {
	
	House_db db = new House_db();
	
	ArrayList<House_sm> house_list = new ArrayList<>();
	House_sm[] house_array = new House_sm[db.total_house_size.length];
	
	public House_service() {
		
		for (int i = 0; i < db.total_house_size.length; i++) {
			House_sm sm = new House_sm(	db.total_house_size[i], 
										db.total_house_room[i],
										db.total_house_toilet[i],
										db.total_house_gagu[i],
										db.total_house_elec[i],
										db.total_name[i]);
			house_list.add(sm);
			house_array[i] = sm;
		}
	
	}

	@Override
	public void a() {
		
		for (int i = 0; i < house_list.size(); i++) {
			System.out.println(house_list.get(i).toString());
		}
		
	}
	
	public ArrayList<House_sm> GetArrayList() {
		return house_list;
	}
	
	public House_sm[] GetArray() {
		return house_array;
	}

}
