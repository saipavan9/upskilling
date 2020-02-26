package travel;

public class Demo {

	public static void main(String[] args) {
		
		String cust1 = "Ashok";
		String train = "Rajdhani";
		RailwayReservation objRailReservation = new RailwayReservation("train",cust1,train,2,"AC2");
		
		
		System.out.println("Transaction Number: "+ objRailReservation.getTransactionNumber());
		System.out.println("Ticket Category: "+ objRailReservation.getCategory());
		System.out.println("Customer Name: "+ objRailReservation.getCustomerName());
		System.out.println("Train Name: "+ objRailReservation.getTrainName());
		System.out.println("Number of Tickets: "+ objRailReservation.getNumberOfTickets());
		
		objRailReservation.calculateAmount();
		
		System.out.println("---------------------------------");
		String cust2 = "Anjana";
		String flight = "Air India";
		AirTicketReservation objAirTicketReservation = new AirTicketReservation("flight",cust2,flight,3,"economy");
		
		System.out.println("Transaction Number: "+ objAirTicketReservation.getTransactionNumber());
		System.out.println("Ticket Category: "+ objAirTicketReservation.getCategory());
		System.out.println("Customer Name: "+ objAirTicketReservation.getCustomerName());
		System.out.println("Flight Name: "+ objAirTicketReservation.getFlightName());
		System.out.println("Number of Tickets: "+ objAirTicketReservation.getNumberOfTickets());
		
		objAirTicketReservation.calculateAmount();
		
		
		
		
	}
}
