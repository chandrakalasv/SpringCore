package com.example.beanlifecycle;

import java.sql.SQLException;

public class Hello {
	public void init() {
		System.out.println("inside init method"); 
	}
	public void destroy() {
		System.out.println("inside destroy method"); 
	}
	

}
