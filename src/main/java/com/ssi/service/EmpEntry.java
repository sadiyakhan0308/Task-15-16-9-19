package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ssi.model.Emp;
import com.ssi.model.Laptop;
import com.ssi.model.Vehicle;
import com.ssi.utility.Util;

public class EmpEntry {

	public static void main(String[] args) {
		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
	
		Emp e1=new Emp(110,"AAA",50000, new Laptop("L1"),new Vehicle("V112"));
		Emp e2=new Emp(111,"BBB",60000, new Laptop("L12"),new Vehicle("V113"));
		Emp e3=new Emp(112,"CCC",70000, new Laptop("L3"),new Vehicle("V113"));
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		session.save(e3); 
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");
	}

}
