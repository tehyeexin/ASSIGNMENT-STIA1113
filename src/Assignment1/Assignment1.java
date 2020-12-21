package Assignment1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		printbackground();
		printservice();
		printservicecharge();
		printquantityservice();
		in.close();
	}
		public static void printbackground() {
			Scanner in = new Scanner (System.in);
			
			System.out.println("Personal Background");
			System.out.println();
			
			System.out.println("1.");
			System.out.print("Enter your name: ");
			String name1 = in.next();
			System.out.print("Enter your college: ");
			String college1 = in.next();
			System.out.print("Enter your school: ");
			String school1 = in.next();
			System.out.print("Enter your job title: ");
			String job1 = in.next();
			System.out.println();	
		}
		
		public static void printservice() {
			Scanner in = new Scanner (System.in);
			
			System.out.println("Services Provided");
			System.out.println("Service No.1: Count Salary Per Month\"");
			
			System.out.println("Service No.2: Check Allowance");
			
			System.out.println("Service No.3: Sum Total Of The Salary");
		
		}
		
		public static void printservicecharge() {
			Scanner in = new Scanner (System.in);
			
			System.out.println("Service Charge Per Hour");
			System.out.println("RM10 per 1 hour");
			
		}
		
		public static void printquantityservice() {
			Scanner in = new Scanner (System.in);
			
			System.out.println("Order Services");
			

				System.out.println("Enter the service number you want to order:");
				int servicenum = in.nextInt();
				
				switch(servicenum) {
				
				case 1 : // Count Salary Per Month
					System.out.println("Count Salary Per Month");
					break;
					
				case 2 : // Check Allowance
					System.out.println("Check Allowance");
					break;
					
				case 3 : // Sum Total Of The Salary
					System.out.println("Sum Total Of The Salary");
					break;
					
				default:
					System.out.println("Invalid");
				}
				
				System.out.println("Enter the service hour:");
				int hour = in.nextInt();
				int total = hour * 10;
				System.out.println("Total: RM " + total);
		
	
		}
			
		
		

	

}
