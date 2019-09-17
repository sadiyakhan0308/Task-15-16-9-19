package com.ssi.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.ssi.model.Student;
import com.ssi.utility.Util;

public class QbcFilteration {
	public static void main(String[] args) {

		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Student.class);
		
		
		Criterion crt1=Restrictions.in("rollno", 1,3);
		cr.add(crt1);
		
		Restrictions.gt("rno", 3);
		Restrictions.ge("rno", 3);
	
		
		List<Student> students=cr.list();
		
		for(Student student:students){
			System.out.println(student);
		}
		
		session.close();
	}
}