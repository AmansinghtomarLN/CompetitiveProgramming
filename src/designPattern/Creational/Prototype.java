package designPattern.Creational;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Prototype {

	public static void main(String[] args) {
		
	/*
	  Original object gets preserved
	  Need to implement Cloneable interface and override clone()
	 
	 */
		
		
		Vehiclee a = new Vehiclee();
		a.insertData();
		
	Vehiclee b = (Vehiclee)	a.clone();
	List<String> list = 	b.getVehicleList();
	
	System.out.println("Original object list : "+a.getVehicleList());
	
	list.remove("Amaze");
	System.out.println("Clone object list : "+b.getVehicleList());
	
	}
	
}


class Vehiclee implements Cloneable{
	
	private List<String> vehicleList = new ArrayList<>();
	
	public Vehiclee() {}
	
	public Vehiclee(List<String> list) {
	this.vehicleList = list;
	}
	
	public void insertData() {
		vehicleList.add("Amaze");
		vehicleList.add("Glanza");
		vehicleList.add("Baleno");
		vehicleList.add("Verna");
		vehicleList.add("Cruze");
	}
	
	
	public List<String> getVehicleList(){
		return this.vehicleList;
	}

	public Object clone() {
		List<String> tempList = new ArrayList<>();
		tempList = this.vehicleList.stream().collect(Collectors.toList());
	
		return new Vehiclee(tempList);
	}

}

