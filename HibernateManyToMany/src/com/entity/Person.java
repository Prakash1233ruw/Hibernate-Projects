package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Person {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Integer id;
 private String name;
 private String city;
 @ManyToMany(cascade=CascadeType.ALL)
 private Set<Goal> goal;
 
 public Person() {
	 System.out.println("this is 0 para constructer");
 }
 public Person(String name,String city,Set<Goal> goal) {
	 this.name=name;
	 this.city=city;
	 this.goal=goal;
 }
}
