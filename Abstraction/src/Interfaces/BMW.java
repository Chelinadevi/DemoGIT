package Interfaces;

public class BMW implements carInterface, Walk {

	@Override
	public void go() {
		System.out.println("BMW Go");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW Stop");
	}

	
	public void waiting() {
		System.out.println("BMW wait");
	}

	@Override
	public void walk() {

		System.out.println("BMW overriden walk");
	}
}
