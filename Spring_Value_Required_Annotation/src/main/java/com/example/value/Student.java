package com.example.value;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String name;
	private String intrestedCourse;
	private String hobby;
	
	@Value("chandu")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("java")
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}
	
	@Value("music")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void displayStudentInfo() {
		System.out.println("Student name " + name);
		System.out.println("Student intrested course " + intrestedCourse);
		System.out.println("Student hobby " + hobby);
	}

}
