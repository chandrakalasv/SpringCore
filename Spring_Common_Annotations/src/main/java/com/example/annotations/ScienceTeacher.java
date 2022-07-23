package com.example.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("science teacher is asha");
		
	}

}
