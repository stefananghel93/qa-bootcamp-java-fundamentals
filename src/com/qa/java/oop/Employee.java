package com.qa.java.oop;

public class Employee {
	
	//State
	int id;
	String name;
	float salary;
	String department;
	byte age;
	char gender;
	float incrementedPercentage;
	
	static final String COMPANY_NAME = "QA"; // class specific
	static final double COMPANY_REVENUE = 8723483.231;
	static final String COMPANY_MAIL = "contact@qa.com";
	

	public Employee(int id, String name, float salary, String department, byte age, char gender, float incrementPercentage) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.age = age;
		this.gender = gender;
	}

	//No argument consructor
	
//	Employee(){
//		System.out.println("employee() constructor is called..");
//		id =111;
//		name="emp1";
//		salary=1231.5f;
//		department = "dev";
//		age = 25;
//		gender = 'M';
//		
		// Argument constructor
		
	void displayEmpInfo() {
		

		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Gender: " + gender);
	}
	 float incrementedSalary() {
		return (salary * incrementedPercentage /100);
	}
	
	static void companyInfo() {
		System.out.println("Company Name: " + COMPANY_NAME );
		System.out.println("Company Name: " + COMPANY_REVENUE );
		System.out.println("Company Name: " + COMPANY_MAIL );
	}
	}
	

