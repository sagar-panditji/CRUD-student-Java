package com.springboot.LearnRest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.Student;
import com.student.StudentCRUD;

@SpringBootTest
class LearnRestApplicationTests {

	@Autowired
	private StudentCRUD crud;
	@Test
	public void saveStudent() {
		Student s=new Student(1,"radhashyam");
		crud.save(s);
	}
	
	

}
