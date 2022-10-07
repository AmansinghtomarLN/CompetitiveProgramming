package multiThreading;

public class Producer extends Thread{

	Company c = new Company();
	
	@Override
	public void run() {
		int i =1;
		while(i<=5) {
				try {
					c.produce_item(i);
					i++;
			//		Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}
	
	}
}
