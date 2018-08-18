package com.onetmany.unidirection.mapping;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory factory;
	static {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.otm.unidirection.xml");
		factory = cfg.buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
