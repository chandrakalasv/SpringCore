package com.example.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/* @ComponentScan(basePackages = "com.example.annotations") */
public class CollegeConfig {
	
	@Bean() // collegeBean is the bean id
	public Principal principalBean() {
		return new  Principal();
	}

	
	@Bean()
	public College collegeBean() {
		College college = new College();
		college.setPrincipal(principalBean());
		return college;
	}

}
