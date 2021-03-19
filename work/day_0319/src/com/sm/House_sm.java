package com.sm;

public class House_sm {
	
	public House_sm() {
		
	}
	
	public House_sm(int size, int room, int toilet, String gagu, String elec, String name) {
		super();
		this.size = size;
		this.room = room;
		this.toilet = toilet;
		this.gagu = gagu;
		this.elec = elec;
		this.name = name;
	}
	
	// ¿ìÅ¬ Source - toString
	@Override
	public String toString() {
		return "House_sm [size=" + size + ", room=" + room + ", toilet=" + toilet + ", gagu=" + gagu + ", elec=" + elec
				+ ", name=" + name + "]";
	}

	protected int size;
	protected int room;
	protected int toilet;
	protected String gagu;
	protected String elec;
	protected String name;

}
