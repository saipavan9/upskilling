package travel;

public class Reservation {

	private static int transactionNumber=1;
	private String category;
	private String customerName;
	
	public Reservation(String category, String customerName) {
		this.category = category;
		this.customerName = customerName;
	}

	public int getTransactionNumber() {
		return transactionNumber++;
	}


	public String getCategory() {
		return category;
	}

	public String getCustomerName() {
		return customerName;
	}

	public boolean validateCategory() {
		
		if(category.equalsIgnoreCase("train") || category.equalsIgnoreCase("flight")) return true;
		
		return false;
	}
	
	
}
