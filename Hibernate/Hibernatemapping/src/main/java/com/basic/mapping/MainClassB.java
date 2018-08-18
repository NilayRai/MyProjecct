package com.basic.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainClassB {
	public static void main(String[] args) {
		Transaction tx = null;
		SessionFactory sf = HibernateUtil.getsessionfactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();
		Address add1 = (Address) session.load(Address.class, 1);
		System.out.println(add1);
		Address add2 = new Address();
		add2.setaId(2);
		add2.setName("Mahi");
		session.update(add2);
	
		tx.commit();
		session.close();
	}

}
