package Assignment3;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner in = new Scanner (System.in);
		
		printbackground();
		printserviceprovide();
		printquantityservice();
		printconfirmservice();
		
		in.close();
	}
	
		public static void printbackground() {
			Scanner in = new Scanner (System.in);
		
			System.out.println("1. Personal Background.");
			
			System.out.println("Please enter your personal information here.");
			System.out.print("Enter your name     : ");
			String name1 = in.next();
			System.out.print("Enter your college  : ");
			String college1 = in.next();
			System.out.print("Enter your school   : ");
			String school1 = in.next();
			System.out.print("Enter your job title: ");
			String job1 = in.next();
			System.out.println();	
			
			String[][] personal = { {"Name\t : ", "College\t : ", "School\t : ", "Job Title: "},
									{name1, college1, school1, job1} };
			
			printbackground(personal);
			
			System.out.println();
		}
			
		public static void printbackground(String[][]x) {
			System.out.println(x[0][0] + x[1][0]);
			System.out.println(x[0][1] + x[1][1]);
			System.out.println(x[0][2] + x[1][2]);
			System.out.println(x[0][3] + x[1][3]);
		}	
		
		public static void printserviceprovide() {
			Scanner in = new Scanner (System.in);
			
			System.out.println("2. Services Provided And Service Charge.");
			
			System.out.println("We provide:");
			
			String[] services1 = {"Service No.1", "Service No.2", "Service No.3"};
			String[] services2 = {"Count Monthly Basic Salary", "Check Allowance", "Total Of The Salary"};
			String[] services3 = {"RM10 per hour", "RM12 per hour", "RM15 per hour"};
			
			for(int i = 0; i < services1.length; i++) {
				System.out.println(services1[i] + ": " + services2[i] + " - " + services3[i]);
			}
		
		}
		
		public static void printquantityservice() {
			Scanner in = new Scanner (System.in);
			
			System.out.println();
			System.out.println("3. Order Services");
			
			System.out.println("Please enter your order here.");
			
			int servicenum;
			int servicehour;
			char confirm;
			
			do {
				System.out.print("Enter the service number you want to order: ");
				 servicenum = in.nextInt();
				System.out.print("Enter the service hour you want to order: ");
				 servicehour = in.nextInt();
				System.out.print("Confirm your order (Y/N): ");
				 confirm = in.next().charAt(0);
				 
				 if(confirm != 'Y' && confirm == 'N') {
					 System.out.println("Please re-enter your order.");
				 }
				 
				System.out.println();
				 
			} while (confirm != 'Y');
			
				if (servicenum == 1) {
					System.out.println("Service Ordered : Count Monthly Basic Salary");
				    System.out.println("Hours Ordered   : " + servicehour + " hours");
				    System.out.println("Total Charge    : RM" + servicehour*10);
				    
				} 
				
				else if (servicenum == 2) {
					System.out.println("Service Ordered : Check Allowance");
					System.out.println("Hours Ordered   : " + servicehour + " hours");
					System.out.println("Total Charge    : RM" + servicehour*12);
				} 
				
				else if (servicenum == 3) {
					System.out.println("Service Ordered : Total Of The Salary");
					System.out.println("Hours Ordered   : "+ servicehour + " hours");
					System.out.println("Total Charge    : RM" + servicehour*15);
				} 
				
				else {
					System.out.println("The number you entered is not in the services.");
				} 
			
			System.out.println();
		}
		
		public static void printconfirmservice() {
			Scanner in = new Scanner (System.in);
		
			char order;
		    System.out.print("Do you want to add-on order? (Y/N): ");
			order = in.next().charAt(0);
			if(order == 'Y') {
				printquantityservice();
			}
			
			else if(order != 'Y') {
				System.out.println();
			}
			
			char confirmPayment;
			System.out.print("Confirm your all order (Y/N): ");
			confirmPayment = in.next().charAt(0);
			
			if(confirmPayment == 'Y') {
				System.out.println("Please proceed to the counter for payment.");
			}
			
			else {
				System.out.println("Please exit and re-enter the information.");
			}
		}

}
