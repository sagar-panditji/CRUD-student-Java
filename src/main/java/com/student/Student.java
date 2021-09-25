package com.student;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data // it generates getters and setters
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	//@Embedded
	//private StudentAddress sd;
	
	@Override
	public String toString() {
		return id+" "+name;
	}
	
	public Student() {
		super();
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
