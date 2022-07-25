package com.example.beanlifecycle;

import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside init method"); 	
	}
	/*public void init() {
		System.out.println("inside init method"); 
	}
	public void destroy() {
		System.out.println("inside destroy method"); 
	}
	*/

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destroy method"); 
	}
	
	public void sample() {
		System.out.println("inside sample method"); 
	}

}
