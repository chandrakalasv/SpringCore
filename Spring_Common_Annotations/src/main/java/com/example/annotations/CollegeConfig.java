package com.example.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/* @ComponentScan(basePackages = "com.example.annotations") */
public class CollegeConfig {
	
	@Bean(name = {"college","collegeBean"})
	public College collegeBean() {
		College college = new College();
		return college;
	}

}
