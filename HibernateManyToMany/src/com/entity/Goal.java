package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Goal {
	@Id
private String goalId;
private String goalName;
private String duration;


public Goal() {
	System.out.println("goal zero para constructer");
}

}
