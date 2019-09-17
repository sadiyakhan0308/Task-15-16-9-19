package com.ssi.service;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ssi.model.Student;
import com.ssi.utility.Util;

public class HqlDemo {

	public static void main(String[] args) {

		Session session=Util.getSF().openSession();
		Query query=session.createQuery("from Student where age>=22 order by age desc ");
		List<Student> students=query.list();
		
		for(Student student:students){
			System.out.println(student);
		}
		
		
		
		session.close();
	}

}