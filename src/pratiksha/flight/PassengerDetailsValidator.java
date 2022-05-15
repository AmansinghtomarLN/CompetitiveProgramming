package pratiksha.flight;

import java.util.ArrayList;
import java.util.List;

public class PassengerDetailsValidator {

		public static List<String> flightNumberList(List<FlightDetails> flights){
			List<String> flightsNumbersList = new ArrayList<String>();
			for(FlightDetails f: flights) {
				flightsNumbersList.add(f.getFlightNumber());
			}
		//	System.out.println("total flights is "+flightsNumbersList.size());
			return flightsNumbersList;
		} 
	
		public static boolean seatAvailability(List<PassengerDetails> passengers, List<FlightDetails> flights) {
			boolean seat = true;
			
			for(PassengerDetails p: passengers) {
				for(FlightDetails f: flights) {
					if(p.getFlightNumber().equals(f.getFlightNumber())) {
							if(p.getNumberOfSeats()>f.getSeats()) {
								seat = false;
								System.out.println(p.getNumberOfSeats()+" seats are not available for flight "+p.getFlightNumber()+" out of Total "+f.getSeats());
								break;	
							}		
						
					if(!seat) {break;}
					
					}if(!seat) {break;}
				}if(!seat) {break;}
			}
			
			return seat;
		}
		
		public static  boolean flightExists(List<PassengerDetails> passengers, List<FlightDetails> flights) {
			boolean exists = true;
			List<String> flightsNumberList = flightNumberList(flights);
			for(PassengerDetails p: passengers) {
				if(!flightsNumberList.contains(p.getFlightNumber())) {
					exists = false;
				System.out.println("For passenger "+p.getPassengerName()+" Flight Number : "+p.getFlightNumber()+" Does Not Exists");
					break;
					}
				}		
			return exists;
		}
	
		public static int calculatePrice(List<PassengerDetails> passengers, List<FlightDetails> flights) {
		int count = 0;
			for(PassengerDetails p: passengers) {
				count++;
				for(FlightDetails f: flights) {
					if(p.getFlightNumber().equals(f.getFlightNumber()) && p.getSeatCategory().equals(f.getCategory())) {
						System.out.println("Total price is :"+p.getPassengerName()+" "+p.getNumberOfSeats()*f.getPrice()+ "for flight "+f.getFlightNumber()+" and "+ f.getCategory());
					// validate card number method
						validateCard(p.getPaymentCardNumber());
					}
				}
			
			
		}
		return 0;
		}
		
		
		public static void validateCard(String cardNumber) {
		
			if(cardNumber.charAt(0)=='4' && cardNumber.length()==13 || cardNumber.length()==16 ) {
				System.out.println("VISA Card");
				
			}else if(cardNumber.charAt(0)=='5' && cardNumber.length()==16 ) {
				System.out.println("Master Card");
			}else if(cardNumber.length()==16 && cardNumber.substring(0, 4).equals("6011")) {
				System.out.println("Discover");
			}else if (cardNumber.length()==15 && cardNumber.charAt(0)=='3' && cardNumber.charAt(1)=='4' || cardNumber.charAt(1)=='7' ) {
				System.out.println("Amex");
			}else if (cardNumber.length()>=19) {
				System.out.println("Invalid card : length is more than or equal to  19 digits");
			}else {
				System.out.println("Please input valid card");
			}
			
		}
		
}
	