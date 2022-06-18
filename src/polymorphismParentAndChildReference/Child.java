package polymorphismParentAndChildReference;

public class Child extends Parent{

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
		p.display1();// Parent class display1 method called
		p.display();// Child  class display method called because method is overridden in child class -> priority= overridden method
		c.display();// Child class display method called
		
	}
}
