package multiThreading;

public class Producer extends Thread{

	Company c = new Company();
	
	@Override
	public void run() {
		int i =1;
		while(true) {
				c.produce_item(i);
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
			i++;
		}
	
	}
}
