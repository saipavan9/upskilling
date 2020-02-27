package online;

import java.util.Set;
import java.util.TreeSet;

public class Idea implements PayTM {

	@Override
	public Set<Integer> denominations() {
		Set<Integer> amountSet = new TreeSet<>();
		amountSet.add(55);
		amountSet.add(255);
		amountSet.add(155);
		amountSet.add(455);
		amountSet.add(855);
		amountSet.add(655);
		return amountSet;
	}

	@Override
	public void recharge(long mobileNumber, int amount) {
		System.out.println("Idea Recharge of Amount "+amount+" is done on "+mobileNumber);
		
	}

}
