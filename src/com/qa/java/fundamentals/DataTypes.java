package com.qa.java.fundamentals;

public class DataTypes {

	public static void main(String[] args) {
		byte age;  //age is a variable (address) / computer allocate 1 byte of memory
		age = 25;
		System.out.println("Age is : "+age);
		
		age = 59;
		System.out.println("Age is : "+age);
		
		short salary;
		salary = 30000;
		
		int totalSalary;
		totalSalary = 3423423;
		
		long companyAnnualRevenue;
		companyAnnualRevenue = 324235462363423463L;
		
		System.out.println("Company Revenue: " + companyAnnualRevenue);
		
		
		//Real (Fractional Numbers)
		//4 bytes
		float averageSalary;
		averageSalary = 23423.23F;
		
		// 8 bytes
		double averageAnnualRevenue;
		averageAnnualRevenue = 2342342.234;
		
		char gender;
		gender ='M';
		
		boolean isExists;
		isExists = false;
		
	}

}
