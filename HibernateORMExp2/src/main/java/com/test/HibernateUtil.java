package com.test;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

public class HibernateUtil {
static SessionFactory getSessionFactory() {
	
	if(sessionFactory == null) {
		try {
			Configuration configuration = new Confguration();
			Properties settings = new Properties();
			settings.put(Environment.DRIVER, settings)
		}
	}
	
	
	return null;
	
}
}
