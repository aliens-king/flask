package com.learn.demo_hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {
	public static void main(String[] args) {

		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("DELL");

		Student s = new Student();
		s.setName("SID");
		s.setRollNo(1);
		s.setLaptop(laptop);

		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(laptop);
		sess.save(s);
		tx.commit();

	}
}