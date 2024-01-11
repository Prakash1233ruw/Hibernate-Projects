package com.enity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaunchMain {
	public static void main(String[] args) throws IOException {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Profiles.class).buildSessionFactory();
	   Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
      Profiles p=new Profiles();
      p.setId(1);
      p.setName("itachi");
      
     FileInputStream fis=new FileInputStream("D:\\itachi\\Itachi.jpg");
     byte img[]=new byte[fis.available()];
     fis.read(img);
	p.setImg(img);

	String text="Itachi Uchia the god of GenJutsu";
	char cr[]=text.toCharArray();
	p.setCharfile(cr);
	
	session.save(p);
	System.out.println("data is saved");
	fis.close();
	transaction.commit();
	session.close();
	sessionFactory.close();
	}
}
