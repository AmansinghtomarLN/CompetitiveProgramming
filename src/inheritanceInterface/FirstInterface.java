package inheritanceInterface;

public interface FirstInterface {
	
	public default String getConflictName() {
		
		return "Conflict from First Interface";
	}
	
}
