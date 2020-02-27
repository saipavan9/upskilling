package online;

import java.util.Set;

public interface PayTM {

	void recharge(long mob,int amt);

	Set<Integer> denominations();
}
