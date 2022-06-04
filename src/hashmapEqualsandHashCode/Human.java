package hashmapEqualsandHashCode;

import java.util.Objects;

public class Human {

	public Integer aadhar;
	public String name;
	
	public Integer getAadhar() {
		return aadhar;
	}
	public void setAadhar(Integer aadhar) {
		this.aadhar = aadhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Human() {
		
	}
	public Human(Integer aadhar, String name) {
		super();
		this.aadhar = aadhar;
		this.name = name;
	}
	
	//hashCode() is override as a part of improvised hashFunction to return unique value ALWAYS
	@Override
	public int hashCode() {
		return aadhar;
	}
	
	// equals() is override of Object Class to make custom comparison logic 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;

		if(this.aadhar != other.getAadhar())
		{return false;}
		
		if(this.name.equals(other.getName()))
		{return false;}
		
		
		return Objects.equals(aadhar, other.aadhar) && Objects.equals(name, other.name);
	}
	
	

	
	
	
	
}
