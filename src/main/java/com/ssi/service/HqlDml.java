package com.ssi.service;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.utility.Util;

public class HqlDml {

	public static void main(String[] args) {

		String hql="update age set age=10";
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		Query query=session.createQuery(hql);
		int n=query.executeUpdate();
		tr.commit();
		System.out.println(n+" rows modified");
		session.close();

	}

}
