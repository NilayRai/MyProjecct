package com.onetmany.bidirection.mapping;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RetrieveTest {

	public static void main(String[] args) {

		Transaction tx = null;
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();
		String hql = "from Employer emp";
		Query query = session.createQuery(hql);
		System.out.println("Retrieve Data using Employer****");
		List<Employer> list = query.list();
		System.out.println(list);
		Iterator<Employer> itr = list.iterator();

		while (itr.hasNext()) {
			Employer employer = (Employer) itr.next();
			System.out.println("Employer_Name : " + employer.getEmployerName());
		}
		tx.commit();

	}

}
