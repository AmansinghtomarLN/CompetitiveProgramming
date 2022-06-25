package multiThreading;

public class Company {

	int n;

	boolean chance = false;

	synchronized void produce_item(int n) {

		if (chance) {
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}

		this.n = n;
		System.out.println("Produced :" + n);
		chance = true;
		notify();
	}

	synchronized public int consume_item() {

		if (!chance) {
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}

		System.out.println("Consumed :" + this.n);
		chance=false;
		notify();
		return this.n;
	}
}
