package com.onetmany.bidirection.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToManyBidirTest {

	public static void main(String[] args) {

		Transaction tx = null;
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();

		Employer employer = new Employer();
		employer.setEmployerName("HCL");

		List<Employee> employees = new ArrayList<Employee>();

		Employee emp1 = new Employee("Rahul", employer);

		Employee emp2 = new Employee("manish", employer);

		session.save(emp1);
		session.save(emp2);

		tx.commit();
		String hql = "from Employee emp";
		Query query = session.createQuery(hql);
		List l = query.list();
		System.out.println(l);
		System.out.println("end of main***");
	}

}
