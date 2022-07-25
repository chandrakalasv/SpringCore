package com.example.beanlifecycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");
		/* StudentDao student = context.getBean("student", StudentDao.class); */
		Hello hello = context.getBean("hello", Hello.class);
		hello.sample();
		/* student.selectAllRows(); */
		context.close();
		
	}
}
