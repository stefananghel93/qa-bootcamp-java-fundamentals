package com.qa.java.oop;

public class Main {

	public static void main(String[] args) {
		
		//create an object
		System.out.println(Employee.companyInfo());
		
		Employee emp;
		emp = new Employee(111, "emp1", 34567.45f, "dev", (byte) 25, 'M', 8.5f);
		
	   // emp.displayEmpInfo();
		
		Employee emp1;
		emp1 = new Employee(121, "emp2", 34237.45f, "qa", (byte) 27, 'F', 7f );
		
		//emp1.displayEmpInfo();
		emp1.incrementedSalary();
		
		System.out.println(emp.incrementedSalary());
		
		/*System.out.println(emp.name);
		System.out.println(emp.salary);
		System.out.println(emp.gender);
		
		emp.id = 111;
		emp.name = "emp1";
		emp.department = "development";
		emp.age = 25;
		emp.salary = 34534.34f;
		emp.gender = 'M';
		
		System.out.println("ID: " + emp.id);
		System.out.println("Name: " + emp.name);
		System.out.println("Department: " + emp.department);
		System.out.println("Age: " + emp.age);
		System.out.println("Salary: " + emp.salary);
		System.out.println("Gender: " + emp.gender);
		
		System.out.println("-------------------------------");
		
		Employee emp2;
		emp2 = new Employee();
		
		emp2.id = 222;
		emp2.name = "emp2";
		emp2.department = "QA";
		emp2.salary = 564645.3f;
		emp2.age = 30;
		emp2.gender = 'M';
		
		System.out.println("ID: " + emp2.id);
		System.out.println("Name: " + emp2.name);
		System.out.println("Department: " + emp2.department);
		System.out.println("Age: " + emp2.age);
		System.out.println("Salary: " + emp2.salary);
		System.out.println("Gender: " + emp2.gender);*/
		
		
	}

}
