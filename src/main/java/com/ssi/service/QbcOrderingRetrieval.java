package com.ssi.service;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import com.ssi.model.Student;
import com.ssi.utility.Util;

public class QbcOrderingRetrieval {
	public static void main(String[] args) {

		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Student.class);
		
		Order order1=Order.asc("rollno");
		cr.addOrder(order1);
		Order order2=Order.desc("name");
		cr.addOrder(order1);
		
		
		List<Student> students=cr.list();
		
		for(Student student:students){
			System.out.println(student);
		}
		
		session.close();
	}
}
