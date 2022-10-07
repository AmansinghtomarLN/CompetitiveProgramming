package multiThreading;

public class Company {

	int n;

	boolean chance = false;

	// false = producer chance
	// true =  consumer chance
	
	synchronized void produce_item(int n) throws InterruptedException {

		if(chance) {
			wait();
		}
		
		this.n = n;
		System.out.println("Produced :" + n);
		chance = true;
		notify();
	}

	synchronized public void consume_item() throws InterruptedException {

		if(!chance) {
			wait();
		}
		
		System.out.println("Consumed :" + this.n);
		chance= false;
		notify();
//		return this.n;
	}
}
