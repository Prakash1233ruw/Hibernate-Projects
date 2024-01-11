package com.eager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pr.entity.Student;

public class LaunchEagerLoad {
public static void main(String[] args) {
	Configuration config = new Configuration();
	config.configure();
	SessionFactory sessionFactory = config.buildSessionFactory();
	Session session = sessionFactory.openSession();
	System.out.println(sessionFactory.getClass().getName());
	Student student = session.get(Student.class, 1);
	System.out.println("student id :"+student.getId());
	System.out.println("student name:"+student.getName());
	System.out.println("student age :"+student.getAge());
	System.out.println("student city :"+student.getCity());
	
	Student student1 = session.get(Student.class, 3);
	System.out.println("student id :"+student1.getId());
	System.out.println("student name:"+student1.getName());
	System.out.println("student age :"+student1.getAge());
	System.out.println("student city :"+student1.getCity());
	session.close();
	sessionFactory.close();
}
}
