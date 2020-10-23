package com.learn.demo_hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AlienName an = new AlienName();
		Alien al = new Alien();
		
		an.setFname("Sudhanshu");
		an.setMname("shekhar");
		an.setLname("chaturvedi");
		al.setAid(101);
		al.setColor("Black");
		al.setAname(an);
		// Configuration con = new
		// Configuration().configure().addAnnotatedClass(Alien.class);
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(al);
		// to fetch data
		// al = session.get(Alien.class, 102);
		tx.commit();
		System.out.println(al);
	}
}
