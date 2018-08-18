package com.basic.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainClassA {
	public static void main(String[] args) {
		Transaction tx = null;
		SessionFactory sf = HibernateUtil.getsessionfactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();
		Address adr = new Address("Nilay");

		session.save(adr);
		tx.commit();
		session.close();
	}

}
