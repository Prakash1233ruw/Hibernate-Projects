package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class Employee2 {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private Double salary;
private String name;
private String city;
@OneToOne(cascade=CascadeType.ALL)
private Account account;

public Employee2() {
	System.out.println("employee 0 para constructor hybernate");
}
}
