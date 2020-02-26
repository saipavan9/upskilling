package travel;

public class RailwayReservation extends Reservation {
	
	private String trainName;
	private int numberOfTickets;
	private String bookingClass;

	public RailwayReservation(String category,String customerName,String t,int no,String b) {
		
		super(category,customerName);
		this.bookingClass = b;
		this.numberOfTickets = no;
		this.trainName = t;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public String getBookingClass() {
		return bookingClass;
	}

	public void setBookingClass(String bookingClass) {
		this.bookingClass = bookingClass;
	}
	
	public void calculateAmount() {
		
		int value = 0;
		if(bookingClass.equalsIgnoreCase("AC1")) value = 1500;
		else if(bookingClass.equalsIgnoreCase("AC2")) value = 1100;
		else if(bookingClass.equalsIgnoreCase("AC3")) value = 700;
		else value = 0;
		
		System.out.println("Amount : "+ numberOfTickets*value);
	}
}
