package Assignment2;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		printbackground();
		printservice();
		printquantityservice();
		printconfirmservice();
		in.close();
	}
		public static void printbackground() {
			Scanner in = new Scanner (System.in);
			
			System.out.println("1. Personal Background");
			
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
			
			System.out.println("2. Services Provided");
			int Totalservice=3;

			
			for(int i=0;i<=Totalservice;i++) {
				if(i==1)
				{
				System.out.println("Service No."+ i +": Count Monthly Basic Salary - RM10 per hour");
				}
				else if
				(i==2)
				{
				System.out.println("Service No."+ i +": Check Allowance - RM12 per hour");
				}
				else if
				(i==3)
				{
				System.out.println("Service No."+ i +": Total Of The Salary - RM15 per hour");
				}
			}
			System.out.println();
		}
		
		public static void printquantityservice() {
			Scanner in = new Scanner (System.in);
			
			System.out.println("3. Order Services");
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
				 
				System.out.println();
				 
			} while (confirm != 'Y');
			
				
				if (servicenum == 1) {
					System.out.println("Service Ordered : Count Monthly Basic Salary");
				    System.out.println("Hours Ordered   : "+ servicehour + "hours");
				    System.out.println("Total Charge    : RM"+ servicehour*10);
				} 
				
				else if (servicenum == 2) {
					System.out.println("Service Ordered : Check Allowance");
					System.out.println("Hours Ordered   : "+ servicehour + "hours");
					System.out.println("Total Charge    : RM"+ servicehour*12);
				} 
				
				else if (servicenum == 3) {
					System.out.println("Service Ordered : Total Of The Salary");
					System.out.println("Hours Ordered   : "+ servicehour + "hours");
					System.out.println("Total Charge    : RM"+ servicehour*15);
				} 
				
				else {
					System.out.println("The number you entered is not in the services.");
				} 
			System.out.println();
		}
	
		public static void printconfirmservice() {
			Scanner in = new Scanner (System.in);
		
			char confirmPayment;
			System.out.print("Confirm your order (Y/N): ");
			confirmPayment = in.next().charAt(0);
			
			if(confirmPayment == 'Y') {
				System.out.println("Please proceed to the counter for payment.");
			}
			
			else {
				System.out.println("Please exit and re-enter the information.");
			}
		
			
		
		
		}
	
}
