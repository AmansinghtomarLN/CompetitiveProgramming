package designPattern.Creational;

public class Factory {

	public static void main(String[] args) {
		
		// Also called virtual constructor pattern
		
		Vehicle car = VehicleFactory.getObject("car", 4);
		System.out.println(car);

		Vehicle bike = VehicleFactory.getObject("bike", 2);
		System.out.println(bike);

		
	}
	
}


class VehicleFactory{
	
	public static Vehicle getObject(String type, int wheel) {
		if(type=="car") {
			return new Car(wheel);
		}else if(type=="bike") {
			return new Bike(wheel);
		}
		return null;
	}
	
}

abstract class Vehicle{
	
	public abstract int getWheel();
	
	public String toString() {
		return "Wheel is : "+ this.getWheel();
	}
}


class Car extends Vehicle {
	int wheel;

	Car(){};
	
	Car(int wheel) {
		this.wheel = wheel;
	}
	
	@Override
	public int getWheel() {
		return this.wheel;
	}
	
}


class Bike extends Vehicle {
	int wheel;

	Bike(){};
	
	Bike(int wheel) {
		this.wheel = wheel;
	}
	
	@Override
	public int getWheel() {
		return this.wheel;
	}
	
}