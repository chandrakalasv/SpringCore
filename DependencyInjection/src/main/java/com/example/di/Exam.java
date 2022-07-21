package com.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student chandu = context.getBean("chandu", Student.class);
		chandu.display();
		Student priya = context.getBean("priya", Student.class);
		priya.display();
		
	}

}
