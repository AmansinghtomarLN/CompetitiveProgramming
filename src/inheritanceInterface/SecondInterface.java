package inheritanceInterface;

public interface SecondInterface {

	
public default String getConflictName() {
		
		return "Conflict from First Interface";
}
}
