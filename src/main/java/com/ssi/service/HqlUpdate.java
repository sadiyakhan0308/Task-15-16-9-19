package com.ssi.service;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ssi.utility.Util;

public class HqlUpdate {

	public static void main(String[] args) {

		String hql="update Student set age=age+1";
		

		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
		
		Transaction tr = session.beginTransaction();
		Query query=session.createQuery(hql);
		int n=query.executeUpdate();
		tr.commit();
		System.out.println(n+ " rows modified");
		session.close();
		

	}

}