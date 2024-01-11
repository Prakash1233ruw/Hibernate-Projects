package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Branch {
	@Id
private String bid;
	private String branchName;
	private String branchLocation;
	
	public Branch() {
		System.out.println("branch 0 para constructers in hybernate");
	}
	
}
