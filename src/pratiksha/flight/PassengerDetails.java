package pratiksha.flight;

public class PassengerDetails {

	public String passengerName;
	public String flightNumber;
	public String seatCategory;
	public int numberOfSeats;
	public String paymentCardNumber;
	
	
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getSeatCategory() {
		return seatCategory;
	}
	public void setSeatCategory(String seatCategory) {
		this.seatCategory = seatCategory;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String getPaymentCardNumber() {
		return paymentCardNumber;
	}
	public void setPaymentCardNumber(String paymentCardNumber) {
		this.paymentCardNumber = paymentCardNumber;
	}
	@Override
	public String toString() {
		return "PassengerDetails [passengerName=" + passengerName + ", flightNumber=" + flightNumber + ", seatCategory="
				+ seatCategory + ", numberOfSeats=" + numberOfSeats + ", paymentCardNumber=" + paymentCardNumber + "]";
	}
	
		
	
	
}
