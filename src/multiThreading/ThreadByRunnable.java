package multiThreading;

public class ThreadByRunnable implements Runnable{

	@Override
	public  void run() {
		 for(int i =0; i<10;i+=2) {
			 System.out.println(i+1);
			 try {
				Thread.sleep(1000); // time in miliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	}
	
	public static void main(String[] args) {
	
		ThreadByRunnable thread = new ThreadByRunnable(); // First Thread
		ThreadByThreadClass t2 = new ThreadByThreadClass();
		
		Thread t1 = new Thread(thread); // to avail start() present in Thread Class
		
		t1.start();
		t2.start();

	}
		
	
}
