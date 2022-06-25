package multiThreading;

public class ProducerConsumerThread {

	public static void main(String[] args) {
		
		Producer p = new Producer();
		Consumer c = new Consumer();
		
		p.start();
		c.start();
	}
}
