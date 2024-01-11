package com.main;

import java.util.HashSet;

import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Department;
import com.entity.Employee;
import com.util.HibernateUtil;

public class LaunchMainOM {
public static void main(String[] args) {
	System.out.println("one");
	Session session=null;
	Transaction transaction=null;
	boolean flag=false;
	try {
		System.out.println("2");
	session=HibernateUtil.getSession();
	System.out.println("3");
	if(session!=null) {
		System.out.println("4");
	 transaction = session.beginTransaction();
	 Employee emp=new Employee("minato","hidden leaf",6600.66);
	 Employee emp2=new Employee("lufy","sea",12.66);
	 Employee emp3=new Employee("tony stark","new York",144600.66);
	 Set<Employee> set=new HashSet<>();
	 set.add(emp);
	 set.add(emp2);
	 set.add(emp3);
	 
	 Department dep=new Department();
	 dep.setName("power");
	 dep.setDepid("in5n8");
	 dep.setEmployee(set);
	 
	 session.save(dep);
	 System.out.println("5");
	 flag=true;
	}
	}catch(HibernateException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		if(flag) {
			transaction.commit();
		System.out.println("data is saved");
		}else {
			transaction.rollback();
			System.out.println("data is not saved");
		}
		
		HibernateUtil.closeSession();
		HibernateUtil.closeSessionFactory();
	}
	 
	 
}
}
