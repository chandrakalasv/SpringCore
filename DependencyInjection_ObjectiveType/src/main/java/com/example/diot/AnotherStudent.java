package com.example.diot;

public class AnotherStudent {
	private int id;
	private MathCheat cheat;
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	
	public void cheating() {
		cheat.mathCheat();
		System.out.println("The id is " + id + " this guy is cheating");
	}

}
