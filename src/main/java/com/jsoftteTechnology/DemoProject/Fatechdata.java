package com.jsoftteTechnology.DemoProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fatechdata {
public static void main(String[] args) {
Configuration configuration=new Configuration();
configuration.configure("hibernate.cfg.xml");
SessionFactory factory=configuration.buildSessionFactory();
Session session=factory.openSession();

Student st=(Student)session.load(Student.class,1);
System.out.println(st);
factory.close();
session.close();
}
}
