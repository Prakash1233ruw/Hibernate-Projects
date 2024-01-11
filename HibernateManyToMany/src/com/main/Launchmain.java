package com.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Goal;
import com.entity.Person;
import com.utility.HibernateUtil;

public class Launchmain {
	
 

public static void main(String[] args) {
	
	 Session session=null;
	 Transaction transaction=null;
	 boolean flag=false;
	 try {
		 System.out.println("one");
	 session = HibernateUtil.getSession();
	 System.out.println("control");
	 if(session!=null) {
		 System.out.println("1");
		 transaction=session.beginTransaction();
		 System.out.println("2");
		 Goal goal1=new Goal("2r","hokage","2decades");
		 Goal goal2=new Goal("45r","power","10decades");
		 Goal goal3=new Goal("we4r","Java developer","2decades");
		 
		 Set<Goal> go=new HashSet<>();
		 go.add(goal1);
		
		 go.add(goal3);
		 
		 Set<Goal> go2=new HashSet<>();
		 go2.add(goal1);
		 go2.add(goal2);
		 
		 
		 Set<Goal> go3=new HashSet<>();
		
		 go3.add(goal2);
		 go3.add(goal3);
		 System.out.println("3");
		 Person p1=new Person("naruto","leaf",go);
		 Person p2=new Person("konahamaru","leaf" ,go2);
		 Person p3=new Person("gara","sand",go);
		 Person p4=new Person("obito","leaf",go3);
		 System.out.println("4");
		 session.save(p1);
		 session.save(p2);
		 session.save(p3);
		 session.save(p4);
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
			 System.out.println("cool");
		 }else {
			 transaction.rollback();
			 System.out.println("never giveup");
		 }
		 HibernateUtil.closeSession(session);
		 HibernateUtil.closeSessionFactory();
		 
	 }
	 
}
}
