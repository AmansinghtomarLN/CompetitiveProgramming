package designPattern.Creational;

public class Singleton {

	public static void main(String[] args) {

		
		/*
		 
		 "class that has only one instance and provides a global point of access to it"
		 "only single instance should be created and single object can be used by all other classes" 
		 
					4 Types of Singleton Instantiation
		1. Eager
		2. Lazy
		3. Synchronized Method
		4. Synchronized Block		
		*/
		
		SingletonEager eagerObj1 = SingletonEager.getObject(); 
		SingletonEager eagerObj2 = SingletonEager.getObject(); 

		SingletonLazy eagerObj3 = SingletonLazy.getObject();
		SingletonLazy eagerObj4 = SingletonLazy.getObject();

		SingletonSynchronizedMethod eagerObj5 = SingletonSynchronizedMethod.getObject();
		SingletonSynchronizedMethod eagerObj6 = SingletonSynchronizedMethod.getObject();

		SingletonSynchronizedBlock eagerObj7 = SingletonSynchronizedBlock.getObject();
		SingletonSynchronizedBlock eagerObj8 = SingletonSynchronizedBlock.getObject();

		
		System.out.println(eagerObj1); // same hash value
		System.out.println(eagerObj2); // same hash value

		System.out.println(eagerObj3); // same hash value
		System.out.println(eagerObj4); // same hash value
		
		System.out.println(eagerObj5); // same hash value
		System.out.println(eagerObj6); // same hash value
		
		System.out.println(eagerObj7); // same hash value
		System.out.println(eagerObj8); // same hash value
	}

}

class SingletonEager {

	// since all are static content that's why they are getting instanciated at
	// compile time

	private static SingletonEager obj = new SingletonEager(); // 1:- defining private static variable & at the same time
																// we are declaring it

	private SingletonEager() {
	} // 2:- private constructor

	public static SingletonEager getObject() { // 3:- public method that return object of class
		return obj;
	}

}

class SingletonLazy {

	private static SingletonLazy obj;

	private SingletonLazy() {
	}

	public static SingletonLazy getObject() {
		if (obj == null) {
			obj = new SingletonLazy();
		}
		return obj;
	}

}


//If multiple user are using same object at a time : Singleton using Synchronized Method
class SingletonSynchronizedMethod {

	private static SingletonSynchronizedMethod obj;

	private SingletonSynchronizedMethod() {
	}

	public static synchronized SingletonSynchronizedMethod getObject() {
		if (obj == null) {
			obj = new SingletonSynchronizedMethod();
		}
		return obj;
	}

}

//Singleton Using Synchronized Block
class SingletonSynchronizedBlock {

	private static SingletonSynchronizedBlock obj;

	private SingletonSynchronizedBlock() {
	}

	public static SingletonSynchronizedBlock getObject() {
		if (obj == null) {
			synchronized (SingletonSynchronizedBlock.class) {
				obj = new SingletonSynchronizedBlock();
			}
		}
		return obj;
	}

}

