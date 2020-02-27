package online;

public class InvalidAmountException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidAmountException() {
		super("Recharge Amount should be less than 500 or greater than 10");
	}
	
}
