package com.delete.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pr.entity.Student;

public class LaunchApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    Integer id=5;
	   Student student=session.get(Student.class, id) ;
	   if(student!=null) {
		   System.out.println("if block");
		   Transaction transaction = session.beginTransaction();
		   
		   session.delete(student);
		   transaction.commit();
	   }else {
		   System.out.println("record not found with id :" +id);
	   }
	   session.close();
	   sessionFactory.close();
	
	 
	
	
	}

}
