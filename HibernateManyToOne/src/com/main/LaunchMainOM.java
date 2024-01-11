package com.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Branch;
import com.entity.Student1;
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
	
	if(session!=null) {
	
	 transaction = session.beginTransaction();
	 Branch branch=new Branch();
	 branch.setBid("ts44");
	 branch.setBranchName("development");
	 branch.setBranchLocation("bengaluru");
	 
	 Student1 st=new Student1("madara","leaf",branch);
	 Student1 st2=new Student1("tonyStank","new york",branch);
	 Student1 st3=new Student1("sandeep","cpl",branch);
	 
	session.save(st);
	session.save(st2);
	session.save(st3);
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
