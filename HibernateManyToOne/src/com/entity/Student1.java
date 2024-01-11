package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Student1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//primary key/unique value
private Integer id;
	private String name;
	private String city;
	@ManyToOne(cascade=CascadeType.ALL)
	private Branch branch;
	
	public Student1() {
		System.out.println("student1 0 parar constructer");
	}
	
	public Student1(String name, String city, Branch branch) {
		super();
		this.name = name;
		this.city = city;
		this.branch = branch;
	}


}
