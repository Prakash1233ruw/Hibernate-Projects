package com.hiber.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.entity.Student;



public class LaunchAppMain{

	public static void main(String[] args) 
	{
		//Inform JVM to activate Hibernate
		Configuration config = new Configuration();
		config.configure();
		
		//Creating SessionFactory to hold all other required objects for hibernate
        SessionFactory sessionFactory = config.buildSessionFactory();
        
        //Persistence operation
       Session session = sessionFactory.openSession();
       //Only for non select operation transaction must be there
       Transaction transaction = session.beginTransaction();
       
       //Create Persistence Object
       Student st=new Student();
       st.setId(3);
       st.setName("sasuke Uchiha");
       st.setAge(24);
       st.setCity("HiddenLeaf");
       
       //Perform persistence operation
//       session.update(st);
       session.saveOrUpdate(st);
       
       
       //commit the operation
       transaction.commit();
       
       session.close();
       sessionFactory.close();
       
       
       
       
	}

}