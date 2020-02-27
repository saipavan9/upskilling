package online;

import java.util.Scanner;

import online.TestImplementation;

import online.Factory.Company;

public class TestPayTM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long mobile = 0;
		boolean validMob = false;
		
		try {
			do {
				if(!validMob) System.out.println("Enter 10 digit mobile number");
				else
					System.out.println("Kindly, Enter 10 digit mobile number");		
				
				String mobileNumber = sc.nextLine();
				int len = mobileNumber.length();
				if(len > 10 || len < 10) {
					validMob = true;
					continue;
				}
				mobile = Long.parseLong(mobileNumber);
				validMob = false;
			}while(validMob);
			
			System.out.println("Enter Service Provider Name From Below List"
					+"\n1.Airtel\t2.Idea\t 3.Jio");
			String serviceProvider = sc.nextLine();
			
			Company company = null;
			for(Company comp : Company.values()) {
				if(comp.toString().equalsIgnoreCase(serviceProvider)) {
					company = comp;
					break;
				}
			}
			if(company!=null)
				TestImplementation.callRecharge(mobile, company);
			else 
				System.out.println("Invalid Service Provider Name!");
		}
		catch(NumberFormatException nfe) {
			System.out.println("You have entered invalid mobile number!!!");
		}
		System.out.println("Thank you for using Paytm!!!");
		sc.close();
	}
}
