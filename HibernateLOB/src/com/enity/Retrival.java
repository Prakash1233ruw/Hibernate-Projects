package com.enity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Retrival {
public static void main(String[] args) throws IOException  {
	SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Profiles.class).buildSessionFactory();
	   Session session = sessionFactory.openSession();
	   
	 Profiles p = session.get(Profiles.class, 1);
	   System.out.println(p);
	   
	   System.out.println("profile id is:"+p.getId());
	   System.out.println("profile name is:"+p.getName());
	   
	   byte []img=p.getImg();
	   FileOutputStream fos=new FileOutputStream("itachi.jpg");
	   fos.write(img);
	   
	 char text[]=  p.getCharfile();
	 fos.flush();
	 FileWriter fw=new FileWriter("java.txt");
	 fw.write(text);
	 fw.flush();
	   fos.close();
	   session.close();
	   sessionFactory.close();
}
}
