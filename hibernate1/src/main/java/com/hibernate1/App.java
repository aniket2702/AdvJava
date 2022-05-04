package com.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration(); 
        SessionFactory factory=cfg.configure().buildSessionFactory();
        
        Employee e=new Employee();
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e.setId(1);
        e.setName("xyz");
        e.setDate("28-03-2001");
        e.setDepartment("tech");
        e.setDesignation("senior");
        e.setManager("pqr");
        e.setSalary(10000);
        e.setTax(1000);
        
        e1.setId(2);
        e1.setName("igh");
        e1.setDate("30-03-2001");
        e1.setDepartment("finance");
        e1.setDesignation("junior");
        e1.setManager("pqr");
        e1.setSalary(20000);
        e1.setTax(1000);
        
        e2.setId(3);
        e2.setName("rohit");
        e2.setDate("28-03-2001");
        e2.setDepartment("marketing");
        e2.setDesignation("senior");
        e2.setManager("pqr");
        e2.setSalary(25000);
        e2.setTax(200);
        
        e3.setId(4);
        e3.setName("rana");
        e3.setDate("28-03-2005");
        e3.setDepartment("tech");
        e3.setDesignation("senior");
        e3.setManager("pqr");
        e3.setSalary(30000);
        e3.setTax(1500);
        
        Session session=factory.openSession();
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
        
        
        session.beginTransaction();
        session.save(e1);
        session.getTransaction().commit();
        
        
        session.beginTransaction();
        session.save(e2);
        session.getTransaction().commit();
        
        
        session.beginTransaction();
        session.save(e3);
        session.getTransaction().commit();
        
        System.out.println(factory);

    }
}
