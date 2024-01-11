package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name="work")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String city;
	private Double salary;
	
	
	public Employee() {
		System.out.println("Employee 0 para constructer for hibernate");
	}
	public Employee(String name, String city, Double salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

}
