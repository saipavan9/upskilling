package travel;

public class AirTicketReservation extends Reservation {

	private String flightName;
	private int numberOfTickets;
	private String bookingClass;
	
	public AirTicketReservation(String category,String customerName,String f,int no,String b) {
		super(category,customerName);
		this.flightName = f;
		this.bookingClass = b;
		this.numberOfTickets = no;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
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
		if(bookingClass.equalsIgnoreCase("business")) value = 4500;
		else if(bookingClass.equalsIgnoreCase("economy")) value = 3500;
		else value = 0;
		
		System.out.println("Amount: "+ numberOfTickets*value);
	}
	
}
