package com.example.value;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${Student.name}")
	private String name;
	
	@Value("${Student.intrestedCourse}")
	private String intrestedCourse;
	
	@Value("${Student.hobby}")
	private String hobby;
	
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	
//	public void setIntrestedCourse(String intrestedCourse) {
//		this.intrestedCourse = intrestedCourse;
//	}
	
	
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//	}

	public void displayStudentInfo() {
		System.out.println("Student name " + name);
		System.out.println("Student intrested course " + intrestedCourse);
		System.out.println("Student hobby " + hobby);
	}

}
