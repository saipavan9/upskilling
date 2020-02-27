package online;
import java.util.Set;
import java.util.TreeSet;

public class Airtel implements PayTM {


	@Override
	public void recharge(long mob, int amt) {
		System.out.println("Airtel Recharge of Amount "+amt+" is done on "+mob);
	}


	@Override
	public Set<Integer> denominations() {
		Set<Integer> amountSet = new TreeSet<>();
		amountSet.add(501);
		amountSet.add(201);
		amountSet.add(1001);
		amountSet.add(301);
		amountSet.add(701);
		amountSet.add(201);
		return amountSet;
	}
	
}
