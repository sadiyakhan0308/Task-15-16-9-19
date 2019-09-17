package com.ssi.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.ssi.model.Student;
import com.ssi.utility.Util;

public class QbcProjection {

	public static void main(String[] args) {


		SessionFactory sf=Util.getSF();
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Student.class);
		
			ProjectionList pList=Projections.projectionList();
			Projection proj1=Projections.property("rollno");
			Projection proj2=Projections.property("name");
			Projection proj3=Projections.property("age");
			Projection proj4=Projections.property("mobileno");
			pList.add(proj1); pList.add(proj2); pList.add(proj3);pList.add(proj4);
			cr.setProjection(pList);
			
			List<Object[]> students=cr.list();
			
			
			for(Object ar[]:students){	
				
				for(Object obj:ar){		
					System.out.println(obj);
				}
				System.out.println("____________________________");
			}
			
			
			session.close();

	}

}