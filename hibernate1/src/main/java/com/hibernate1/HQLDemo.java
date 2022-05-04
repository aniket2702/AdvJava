package com.hibernate1;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		SessionFactory factory=cfg.configure().buildSessionFactory();
		Session s=factory.openSession();
		
		String q="from Employee where salary in (select max(salary) from Employee)";
		Query q1=s.createQuery(q);
		
		List<Employee> list=q1.getResultList();
		
		for(Employee e:list) {
			System.out.println(e.getName());
		}	
		
		/*s.beginTransaction();
		String q2="update Employee set salary=15000 where name='abc'";
		Query q3=s.createQuery(q2);
		Integer r=q3.executeUpdate();
		System.out.print("records updated "+r);
		s.getTransaction().commit();*/
		
		/*s.beginTransaction();
		String q2="delete from Employee where name='abc'";
		Query q3=s.createQuery(q2);
		Integer r=q3.executeUpdate();
		System.out.print("records updated "+r);
		s.getTransaction().commit();*/
	}
}
