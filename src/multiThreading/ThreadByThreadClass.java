package multiThreading;

public class ThreadByThreadClass extends Thread{

	@Override
	public void run() {
		 for(int i =1; i<10;i+=2) {
			 System.out.println(i+1);
			 try {
				Thread.sleep(1000); // time in miliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	}
	
}
