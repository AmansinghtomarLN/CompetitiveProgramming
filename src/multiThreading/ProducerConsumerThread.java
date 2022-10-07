package multiThreading;

import javax.sql.rowset.spi.SyncFactory;

public class ProducerConsumerThread {

	public static Thread test ;
	public static void main(String[] args) throws InterruptedException {
	
		
		Producer p = new Producer();
		Consumer c = new Consumer();
		
//		p.start();
//		c.start();
	
	Thread1 t1 = new Thread1();
	Thread2 t2 = new Thread2();

	
	//t2.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t2.start();
	
	
	
	System.out.println("t1 thread "+t1.getPriority());
	System.out.println("t2 thread "+t2.getPriority());

	
	}
}
