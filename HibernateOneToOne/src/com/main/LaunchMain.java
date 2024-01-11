package com.main;

import org.hibernate.HibernateException;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Account;
import com.entity.Employee2;
import com.util.HibernateUtil;

public class LaunchMain {


public static void main(String[] args) {
	Session session=null;
   Transaction transaction=null;
   boolean flag=false;
   try{
	session=HibernateUtil.getSession();
	if(session!=null) {
		transaction=session.beginTransaction();
		Account ac=new Account();
		ac.setAccNo("it89");
		ac.setName("goku");
		ac.setAccType("saving");
		
		Employee2 emp=new Employee2();
		emp.setName("goku");
		emp.setCity("leaf");
		emp.setSalary(232344.5);
		
		emp.setAccount(ac);
		
		session.save(emp);
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
			}
			else {
				transaction.rollback();
				System.out.println("not able to store the data in db");
			}
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
}
}
