package online;

import java.util.Scanner;
import java.util.Set;

import online.Factory.Company;

public class TestImplementation {

	
	public static void callRecharge(long mobileNumber,Company company) {
		
		PayTM paytm = Factory.getFactory(company);
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> listRecharge = paytm.denominations();
		
		System.out.println("Please Enter recharge amount from Below list");
		for(Integer i : listRecharge) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		try {
			int rechargeAmount = Integer.parseInt(sc.nextLine());
			sc.close();
			System.out.println();
	        
			if(listRecharge.contains(rechargeAmount)) {
				paytm.recharge(mobileNumber, rechargeAmount);
			}else throw new InvalidAmountException();
			
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException nfe) { 
			System.out.println("Only Integers are allowed for Recharge Amount");
		}
		
	}
	
}
