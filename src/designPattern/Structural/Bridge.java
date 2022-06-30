package designPattern.Structural;

public class Bridge {

	// client class
	// class hierarchy
	// interface hierarchy
	
	// Bridge -> class hiearchy + interface hierarchy 
	
	
	public static void main(String[] args) {
		
		TV sonyOldRemote = new Sony(new OldRemote());
		sonyOldRemote.off();
		sonyOldRemote.on();
		System.out.println();
		
		TV sonyNewRemote = new Sony(new NewRemote());
		sonyNewRemote.off();
		sonyNewRemote.on();
		System.out.println();
		
		TV philippsOldRemote = new Philipps(new OldRemote());
		philippsOldRemote.off();
		philippsOldRemote.on();
		System.out.println();

		TV philippsNewRemote = new Philipps(new NewRemote());
		philippsNewRemote.off();
		philippsNewRemote.on();
		System.out.println();

		
}
	
	
}

abstract class TV {

	Remote remote;

	TV(Remote r) {
		this.remote = r;
	}

	abstract void on();

	abstract void off();

}

class Sony extends TV {

	Remote remoteType;

	Sony(Remote r) {
		super(r);
		this.remoteType = r;
	}

	@Override
	void on() {
		System.out.println("Sony TV ON");
		remoteType.on();
	}

	@Override
	void off() {
		System.out.println("Sony TV OFF");
		remoteType.off();

	}

}

class Philipps extends TV {

	Remote remoteType;

	Philipps(Remote r) {
		super(r);
		this.remoteType = r;
	}

	@Override
		void on() {
			System.out.println("Philips TV is on");
			remoteType.on();
		}

	@Override
	void off() {
		System.out.println("Philips TV is off");
		remoteType.off();

	}

}



interface Remote{
	public void on();
	public void off();
	
}



	class OldRemote implements Remote {

		@Override
		public void on() {
			System.out.println("ON with old Remote");			
		}

		@Override
		public void off() {
			System.out.println("OFF with old Remote");						
		}
		
		
	}
	
	
	
	
	class NewRemote implements Remote {

		@Override
		public void on() {
			System.out.println("ON with new Remote");			
		}

		@Override
		public void off() {
			System.out.println("OFF with new Remote");						
		}
		
		
	}