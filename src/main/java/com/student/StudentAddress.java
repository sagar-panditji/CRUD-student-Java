package com.student;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@Embeddable
@Entity
@Data
public class StudentAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hno;
	private String city;
	
	
}
