package online;

import online.Airtel;
import online.Idea;
import online.Jio;
import online.PayTM;


public class Factory {
	private static final PayTM AIRTEL_OBJ = new Airtel();
	private static final PayTM IDEA_OBJ = new Idea();
	private static final PayTM JIO_OBJ = new Jio();

	public enum Company {
		AIRTEL,IDEA,JIO
	}
	
	static PayTM getFactory(Company comp) {
		PayTM paytm = null;
		switch(comp) {
		case AIRTEL :
			paytm = AIRTEL_OBJ;
			break;
		case IDEA :
			paytm = IDEA_OBJ;
			break;
		case JIO :
			paytm = JIO_OBJ;
			break;
		}
		return paytm;}
}