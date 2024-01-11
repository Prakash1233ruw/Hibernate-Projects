package com.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Account;
import com.entity.Employee2;
import com.util.HibernateUtil;

public class LaunchRetrival {


public static void main(String[] args) {
	Session session=null;
   
   try{
	session=HibernateUtil.getSession();
	if(session!=null) {
		
		Employee2 emp=session.get(Employee2.class, 1);
		System.out.println(emp);
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
