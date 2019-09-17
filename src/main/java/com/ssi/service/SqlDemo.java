package com.ssi.service;



import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ssi.model.Student;
import com.ssi.utility.Util;

public class SqlDemo {
	public static void main(String args[]){
		
		String sql="select * from student";
		
		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
		SQLQuery query=session.createSQLQuery(sql);
		query.addEntity(Student.class);
		
		
		List<Student> students=query.list();
		for(Student student:students){
			System.out.println(student);
		}
		
		session.close();
		
	}
}