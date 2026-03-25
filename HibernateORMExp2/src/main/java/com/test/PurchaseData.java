package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PurchaseData {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	Transaction t = session.beginTransaction();
	Customer cust = new Customer();
	cust.setCust_name("Rohhhit");
	cust.setCut_company("BhhhCC");
	emp.setEmp_city("Mumbhhhai");
	session.persist(emp);
	t.commit();
	Employee obj = session.find(Employee.class,3 );
	System.out.println(obj.getId()+" "+obj.getEmp_name()+" "+obj.getEmp_company()+" "+obj.getEmp_city());
	obj.setEmp_name("Sharma");
	obj.setEmp_company("PWC");
	obj.setEmp_city("Bangalore");
	//session.persist(obj);
//	session.remove(obj);
//	t.commit();
	System.out.println("Done"); 
	session.close();
	
	
}
}