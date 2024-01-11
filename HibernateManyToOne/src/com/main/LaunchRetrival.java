package com.main;

import java.util.HashSet;


import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.entity.Student1;
import com.util.HibernateUtil;

public class LaunchRetrival {
public static void main(String[] args) {
	System.out.println("one");
	Session session=null;
	
	try {
		System.out.println("2");
	session=HibernateUtil.getSession();
	System.out.println("3");
	if(session!=null) {
	Student1 st1 = session.get(Student1.class,1 )	;
		Student1 st2 = session.get(Student1.class,2 )	;
		Student1 st3 = session.get(Student1.class,3 )	;
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
	}
	}catch(HibernateException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		
		
		HibernateUtil.closeSession();
		HibernateUtil.closeSessionFactory();
	}
	 
	 
}
}
