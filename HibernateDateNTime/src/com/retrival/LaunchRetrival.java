package com.retrival;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.time.Implementers;

public class LaunchRetrival {
public static void main(String[] args) {
	SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Implementers.class).buildSessionFactory();
	Session session = sessionFactory.openSession();
	Integer id=2;
	Implementers imp = session.get(Implementers.class, id);
  if(imp!=null) {
	  System.out.println(imp);
  }else {
	  System.out.println("id :"+id+" is not found ");
  }
}
}
