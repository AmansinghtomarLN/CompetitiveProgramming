package multiThreading;

public class Thread2 extends Thread{

	
	@Override
	public void run() {
	
		try {
			Thread1.tRef1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =1; i<5;i++) {
			System.out.println("Consume :"+i);
		}
	
		
	}
}
