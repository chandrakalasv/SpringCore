package com.example.ioc;

public class VodaFone implements Sim {
	@Override
	public void calling() {
		System.out.println("calling using vodafone mobile");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using vodafone sim ");
		
	}

}
