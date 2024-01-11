package com.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Goal;
import com.entity.Person;
import com.utility.HibernateUtil;

public class Retrival {
	
 

public static void main(String[] args) {
	
	 Session session=null;
	 Transaction transaction=null;
	 boolean flag=false;
	 try {
		 System.out.println("one");
	 session = HibernateUtil.getSession();
	 System.out.println("control");
	 if(session!=null) {
		Person per=session.get(Person.class, 1);
		Person per2=session.get(Person.class, 2);
		Person per3=session.get(Person.class, 3);
		System.out.println(per);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(per2);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		System.out.println(per3);
		 flag=true;
	 } 
	 }catch(HibernateException e) {
		e.printStackTrace(); 
	 }
     catch(Exception e) {
		e.printStackTrace(); 
	 }
	 finally {
		 
		 HibernateUtil.closeSession(session);
		 HibernateUtil.closeSessionFactory();
		 
	 }
	 
}
}
