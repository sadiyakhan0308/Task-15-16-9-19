package com.ssi.service;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ssi.utility.Util;

public class HqlFilteration 
{
	public static void main(String[] args) {

		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
		Query query=session.createQuery("select rollno,name,age from Student order by rollno desc");
		List<Object[]> students=query.list();
		
		for(Object ar[]:students){
			for(Object obj:ar){
				System.out.println(obj);
			}
			System.out.println("__________________________________");
		}
		session.close();
	}

}