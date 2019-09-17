package com.ssi.service;



import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.utility.Util;

public class HqlParameterIndex {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno : ");
		int rollno=sc.nextInt();
		System.out.println("Enter  Age : ");
		int age=sc.nextInt();
		
		String hql = "update Student set rollno=rollno+?0 where age=?1";
		Session session = Util.getSF().openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery(hql);
		
		query.setParameter(0, rollno);
		query.setParameter(1, age);
		
		int n = query.executeUpdate();
		tr.commit();
		System.out.println(n + " rows modified");
		session.close();

	}
}