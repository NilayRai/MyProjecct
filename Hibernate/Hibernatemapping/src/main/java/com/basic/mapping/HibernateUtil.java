package com.basic.mapping;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateUtil {
	public static SessionFactory factory;
	static {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		factory = cfg.buildSessionFactory();
	}
	public static SessionFactory getsessionfactory() {
		return factory;
	}
}
