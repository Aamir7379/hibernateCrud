package com.jsoftteTechnology.DemoProject;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        System.out.println( "Student_data" );
        
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        
        Student student=new Student();
        student.setId(1);
        student.setName("Aamir");
        student.setPassword("xyz");
     
        Student_Address address=new Student_Address();
        address.setAddress_id(0);
        address.setCity("azamgarh");
        address.setPost_office("raunapar");
        address.setStreet("arshad pan");
        address.setDate(new Date());
       
        //image  added 
        FileInputStream fis=new FileInputStream("src/main/java/danish.jpg");
        byte[]store=new byte[fis.available()];
        fis.read(store);
        address.setImage(store);
        
        session.save(student);
        session.save(address);
        transaction.commit();
        session.close();
    }
    
}
