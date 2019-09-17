package com.ssi.service;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ssi.utility.Util;

public class HqlParameterized {
	public static void main(String args[]) {
    String hql="update Student set rollno=55 where age=18";
		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
	
		
		Query query=session.createQuery(hql);
		
		
		Transaction tr = session.beginTransaction();
		int n=query.executeUpdate();
		tr.commit();
		session.close();
		System.out.println(n+ " rows modified ");
		
		
		
		
		
		
		
		
	}
}