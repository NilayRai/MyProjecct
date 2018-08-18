package com.onetmany.unidirection.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StorePost {

	public static void main(String[] args) {
		Transaction tx = null;
		Session session = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();

			Post post = new Post("First Post");
			post.getComments().add(new PostComment("My First Review"));
			post.getComments().add(new PostComment("My Second Review"));
			post.getComments().add(new PostComment("My Third Review"));

			session.save(post);

			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
