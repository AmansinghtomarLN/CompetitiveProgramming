package multiThreading;

public class DaemonThread extends Thread{

	@Override
	public void run() {
	int i =1;
		while(true) {
			System.out.println("Daemon thread" +i);
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		
		
//		System.out.println("Main Thread");  nothing will print because main thread is not doing anything
		DaemonThread d = new DaemonThread();
		d.setDaemon(true);
		d.start();
		
		
/*	 we have started the thread and then changing the nature it will throw IllegalState Exception	
		d.start();
		d.setDaemon(true);

	*/
	}
	
}
