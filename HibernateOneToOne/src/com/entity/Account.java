package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Account {
	@Id
private String accNo;
	private String name;
	private String accType;
	
	public Account() {
		System.out.println("Account zero para constructor");
	}
}
