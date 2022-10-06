package com.qa.java.fundamentals;

public class Operators {

	public static void main(String[] args) {
		short salary;
		salary = 32145;
		
		double incrementedSalary = (short) (salary * 10/100); 
		
		System.out.println("Incremented Salary: " + incrementedSalary);

		double totalSalary;
		totalSalary = salary +incrementedSalary;
		
		System.out.println("Total Salary: " + totalSalary);
		
		int no1,no2;
		no1 = 100;
		no2 = 200;
		System.out.println(++no1);
		System.out.println(no1);
		
		System.out.println(--no2);
		System.out.println(no2);
		
		//
		
	}

}
