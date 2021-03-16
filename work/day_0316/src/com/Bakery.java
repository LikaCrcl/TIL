package com;

public class Bakery {
	
	public Bakery() {
		
	}
	
	public Bakery(String name, int price, String date, double runTime, double calorie, int rate) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
		this.runTime = runTime;
		this.calorie = calorie;
		this.rate = rate;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getDate() {
		return date;
	}

	public double getRunTime() {
		return runTime;
	}

	public double getCalorie() {
		return calorie;
	}

	public int getRate() {
		return rate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setRunTime(double runTime) {
		this.runTime = runTime;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	private String name;
	private int price;
	private String date;
	private double runTime;
	private double calorie;
	private int rate;

}
