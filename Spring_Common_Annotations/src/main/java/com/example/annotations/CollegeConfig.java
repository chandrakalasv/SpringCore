package com.example.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.annotations") 
@PropertySource("classpath:college-file.properties")
public class CollegeConfig {
	
	/*
	 * @Bean() // collegeBean is the bean id public Teacher mathTeacherBean() {
	 * return new MathTeacher(); }
	 * 
	 * 
	 * @Bean() // collegeBean is the bean id public Principal principalBean() {
	 * return new Principal(); }
	 * 
	 * 
	 * @Bean() public College collegeBean() { College college = new College();
	 * college.setPrincipal(principalBean()); college.setTeacher(mathTeacherBean());
	 * return college; }
	 */

}
