package com.main;

import java.util.HashSet;

import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Department;
import com.entity.Employee;
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
			Department dep = session.get(Department.class, "in5n8") ;
			System.out.println(dep);
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
