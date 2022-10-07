package polymorphismParentAndChildReference;

public class Child extends Parent{

	public int x = 20;
	
	@Override
	public void display() {
			System.out.println("Child class display method called");	
			
	}
	
	public void visible() {
		System.out.println("Child class display method called");
	}
	
	
	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		Parent p = new Child();
		Child c = new Child();
		
		p1.display();// Parent class display method called
		System.out.println(p1.x);
		
		p.display1();// Parent class display1 method called
		
		p.display();// Child  class display method called because method is overridden in child class -> priority= overridden method
		System.out.println(p.x);
		
		c.display();// Child class display method called
		System.out.println(c.x);
		
		
		
	}
	
}
