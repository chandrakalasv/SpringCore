package com.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	
	 @Value("${college.Name}") 
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;
	
//	@Value("${college.Name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	/*
	 * public void setTeacher(Teacher teacher) { this.teacher = teacher; }
	 */
	/*
	 * public College(Principal principal) { this.principal = principal; }
	 */
	/*
	 * public void setPrincipal(Principal principal) { this.principal = principal; }
	 */
	void show() {
		principal.display();
		teacher.teach();
		System.out.println("college name is" + collegeName);
		System.out.println("this method calling");
	}

}
