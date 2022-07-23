package com.example.annotations;

import org.springframework.stereotype.Component;

/*@Component("collegeBean")*/
public class College {
	public Principal principal;
	
	/*
	 * public College(Principal principal) { this.principal = principal; }
	 */


	void show() {
		principal.display();
		System.out.println("this method calling");
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

}
