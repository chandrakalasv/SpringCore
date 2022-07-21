package com.example.di;

public class Student {
	
	private String studentName;
	private int id;
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	void display() {
		System.out.println("student name is " + studentName + " " + "id is" + id);
	}
}
