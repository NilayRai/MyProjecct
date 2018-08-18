package com.onetmanybi.direction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StorePost {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getsessionfactory();
		Session session = null;
		Transaction tx = null;

		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();

			Post post = new Post("First Post");
			post.getComments().add(new PostComment("My First ReviewA",post));
			post.getComments().add(new PostComment("My Second Review",post));
			post.getComments().add(new PostComment("My Third Review",post));
			
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
