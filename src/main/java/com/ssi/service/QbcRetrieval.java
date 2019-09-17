package com.ssi.service;



import java.util.List;

import org.hibernate.Criteria;

import com.ssi.model.Student;
import com.ssi.utility.Util;

public class QbcRetrieval{

	public static void main(String[] args) {
		Criteria cr=Util.getSF().openSession().createCriteria(Student.class);

		List<Student> students=cr.list();
		
		for(Student student:students){
			System.out.println(student.getRollno()+","+student.getName()+","+student.getAge()+","+student.getMobileno());
		}
		
		
	}
}

