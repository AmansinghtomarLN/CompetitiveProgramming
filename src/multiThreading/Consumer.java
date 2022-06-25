package multiThreading;

public class Consumer extends Thread{

	Company c = new Company();

	@Override
	public void run() {
		while(true) {
		c.consume_item();
		try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
}
