package com.qa.java.fundamentals;

public class IfElseTest {

	public static void main(String[] args) {
	   //Write a code to check whether the given no is an even number or not
		int no;
		no =12313;
		if(no % 2 == 0) {
		    System.out.println(no + " is an even number");
		    
		}
		else {
			System.out.println(no + "is an odd number");
			
		}
		
		System.out.println("------------------------------------------");
		/* if an employee belongs to dev department and his experience is greater than 
		   5 years, then his increment percentage is 10%
		   else if an employee belongs to qa dep an his experience is greater than
		   5 years, then his increment percentage is 8%
		   else
		   employee increment percentage is 5%.*/
		
		char empDept = 'D';
		float empSalary = 34534.34f;
		byte empExp = 10;
		float incrementPercentage;
		
		if(empDept =='D' && empExp > 5) {
			incrementPercentage = 10.0f;
			
		}else if (empDept == 'Q' && empExp > 5) {
			incrementPercentage = 8.0f;
			
		}else {
			incrementPercentage = 5.0f;
		}
		   
		 float empTotalSalary;
		 empTotalSalary = empSalary + (empSalary * incrementPercentage/100);
		 
		 System.out.println("Total salary after increment is: " + empTotalSalary);
		 
		 System.out.println("------------------------------------------");
		 
		 
		 //Menu Driven application
		 byte day;
		 day=9;
		 
		 switch(day) {
		 case 1:
			 System.out.println("Day 1 Schedule");
			 break;
		 case 2:
			 System.out.println("Day 2 Schedule");
			 break;
		 case 3:
			 System.out.println("Day 3 Schedule");
			 break;
		 case 4:
			 System.out.println("Day 4 Schedule"); 	
			 break;
		 case 5:
			 System.out.println("Day 5 Schedule");
			 break;
		 case 6:
			 System.out.println("Day 6 Schedule");
			 break;
		 case 7:
			 System.out.println("Day 7 Schedule");
			 break;
		 default:
			 System.out.println("Schedule not found");
				 
			 System.out.println("------------------------------------------");
			 
			 
			 
		 }
		 

	}

}
