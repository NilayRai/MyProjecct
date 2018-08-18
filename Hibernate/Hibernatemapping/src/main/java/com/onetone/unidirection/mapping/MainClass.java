package com.onetone.unidirection.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainClass {
	public static void main(String[] args) {
		Transaction tx = null;
		SessionFactory sf = HibernateUtil.getsessionfactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();
		NewAddress adr = new NewAddress("Delhi");
		NewStudent nsd = new NewStudent("Nilay", adr);
		session.save(nsd);
		tx.commit();
		session.close();
	}

}
