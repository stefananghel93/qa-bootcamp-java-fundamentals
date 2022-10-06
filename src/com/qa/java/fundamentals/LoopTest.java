package com.qa.java.fundamentals;

public class LoopTest {

	public static void main(String[] args) {
		//while the given condition is true
		//Print from1 to 10
		
		int no=1;
		while(no<=10) {
			System.out.println(no);
			no++;
		}
		
		System.out.println("------------------------------------------");
		
		//do-while 
		
		int n =1;
		do { System.out.println(n);
		     n++;
		}while (n <=10);
		//dif between while and do-while
		//if the condition is false do-while executes once
		
		
		System.out.println("------------------------------------------");
		
		
		for(int i =1; i <=10; i++) {
			
			//if (i ==5)
				//break;
			System.out.println(i);
		}
		
        
	}

}
