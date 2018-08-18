package com.onetmany.bidirection.mapping;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory factory;
	static {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.otm.bidirection.xml");
		factory = cfg.buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
