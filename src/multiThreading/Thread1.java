package multiThreading;

public class Thread1 extends Thread{

	public static Thread tRef1 = Thread.currentThread();
	@Override
	public void run() {
		
		for(int i =1; i<5;i++) {
			
			System.out.println("produce :"+i);
			
		}
		
		
	}
	
}
