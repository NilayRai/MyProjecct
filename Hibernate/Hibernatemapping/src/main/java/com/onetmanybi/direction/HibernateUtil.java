package com.onetmanybi.direction;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory factory;
	static {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.otmbi.direction.xml");
		factory = cfg.buildSessionFactory();
	}
	public static SessionFactory getsessionfactory() {
		return factory;
	}
}
