package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="dep")
public class Department {
     @Id
	private String depid;
    private String name;
   
    @OneToMany(cascade=CascadeType.ALL)//tends to composition connected
    private Set<Employee>employee;
    
    public Department() {
    	System.out.println("Depart 0 para constructer for hybernate");
    }
}
