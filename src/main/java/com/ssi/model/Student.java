
package com.ssi.model;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private int age;
	private long mobileno;
	public Student(int rollno, String name, int age, long mobileno) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", mobileno=" + mobileno + "]";
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public Student() {
		super();
	}
	

}