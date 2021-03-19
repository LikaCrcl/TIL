package com.service;

import java.util.ArrayList;

import com.data.Animal_db;
import com.inter.Table;
import com.sm.Animal_sm;

public class Animal_service implements Table {
	
	Animal_db db = new Animal_db();
	
	ArrayList<Animal_sm> animal_list = new ArrayList<>();
	Animal_sm[] animal_arr = new Animal_sm[db.name_array.length];
	
	public Animal_service() {
		
		for (int i = 0; i < db.name_array.length; i++) {
			Animal_sm sm = new Animal_sm(db.name_array[i],
										 db.age_array[i],
										 db.gender_array[i],
										 db.speed_array[i],
										 db.type_array[i],
										 db.weight_array[i]);
			animal_list.add(sm);
			animal_arr[i] = sm;
		}
		
	}

	@Override
	public void a() {
		
		for (int i = 0; i < db.name_array.length; i++) {
			System.out.println(animal_list.get(i).toString());
		}
		
	}
	
	public ArrayList<Animal_sm> GetArrayList() {
		return animal_list;
	}
	
	public Animal_sm[] GetArray() {
		return animal_arr;
	}

}
