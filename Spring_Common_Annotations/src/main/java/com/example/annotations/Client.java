package com.example.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College collegeBean = context.getBean("collegeBean", College.class);
		System.out.println("object created by spring using component annotation" + " " + collegeBean);
		
	}


}
