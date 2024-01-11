package com.enity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class Profiles {
	@Id
private Integer id;
	
private String name;
@Lob
@Column(name="IMAGE")
private byte[] img;
@Lob
@Column(name="Document")
private char[] charfile;

public Profiles() {
	System.out.println("Zero param constructor for hibernate");
}

}
