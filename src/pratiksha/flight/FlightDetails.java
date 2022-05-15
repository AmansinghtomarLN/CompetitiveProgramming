package pratiksha.flight;

public class FlightDetails {

	
	public String category;
	public String flightNumber;
	public int seats;
	public int price;
	public String arrivalCity;
	public String departureCity;
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "FlightDetails [category=" + category + ", flightNumber=" + flightNumber + ", seats=" + seats
				+ ", price=" + price + ", arrivalCity=" + arrivalCity + ", departureCity=" + departureCity + "]";
	}
	
	
	
}
