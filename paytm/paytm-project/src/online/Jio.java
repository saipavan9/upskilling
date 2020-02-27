package online;

import java.util.Set;
import java.util.TreeSet;

public class Jio implements PayTM {

	@Override
	public Set<Integer> denominations() {
		Set<Integer> amountSet = new TreeSet<>();
		amountSet.add(123);
		amountSet.add(234);
		amountSet.add(678);
		amountSet.add(567);
		amountSet.add(456);
		amountSet.add(345);
		return amountSet;
	}

	@Override
	public void recharge(long mobileNumber, int amount) {
		System.out.println("Jio Recharge of Amount "+amount+" is done on "+mobileNumber);
		
	}


}
