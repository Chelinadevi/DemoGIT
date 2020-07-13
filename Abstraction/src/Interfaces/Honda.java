package Interfaces;

public class Honda implements carInterface, Walk {

	@Override
	public void go() {
		System.out.println("Honda Go");
	}

	@Override
	public void stop() {
		System.out.println("Honda Stop");
	}

	public void walking() {
		System.out.println("Honda Walking");
	}

	@Override
	public void walk() {
		System.out.println("Honda overriden walk");
		
	}
}
