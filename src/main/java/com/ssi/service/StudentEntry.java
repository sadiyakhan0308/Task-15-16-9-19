package com.ssi.service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.ssi.model.Student;
import com.ssi.utility.Util;

public class StudentEntry {


	public static void main(String[] args) {
		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
	Student s1=new Student(1,"sadiya",18,0732);
	Student s2=new Student(2,"ashi",17,0733);
	Student s3=new Student(3,"anjali",25,0734);
	Student s4=new Student(4,"poo",22,0735);
		Transaction tr=session.beginTransaction();
		session.save(s1); session.save(s2);
		session.save(s3); 
		session.save(s4);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");
	}

}
