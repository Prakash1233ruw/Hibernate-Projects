package com.hiber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="shinobhiWorld")
public class Student {
@Id
@Column(name="id")
private Integer id;

@Column(name="name")
private String name;

@Column(name="address")
private String city;

@Column(name="age")
private Integer age;

public Student() {
	System.out.println("no args constructer required for internal use of hybernate");
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
}

}
