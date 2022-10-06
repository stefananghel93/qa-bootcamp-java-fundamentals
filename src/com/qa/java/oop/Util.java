package com.qa.java.oop;

public class Util {

	static String getStudentName(Student student) {
		student.name = "student111";
		System.out.println("In getStudentName: " + student.name);
		return student.name;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//Call By Reference
		
		Student student = new Student(111,"student1");
		
		System.out.println("In main: " + student.name);
		
		System.out.println("Student name: " + getStudentName(student));
	}
	

	

}
