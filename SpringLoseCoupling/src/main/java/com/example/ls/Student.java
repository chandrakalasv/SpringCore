package com.example.ls;

public class Student {
	
	private int id;
	private Cheat cheat;
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void cheating() {
		cheat.cheat();
		System.out.println("The id is " + id + " this guy is cheating");
	}
}
