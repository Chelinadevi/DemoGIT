package Abstractclass;

public class AbsChild extends AbstractClass {


	
	@Override
	void commonfunc() {
		super.commonfunc();
		System.out.println("This is child class common function");
	}

	@Override
	void absmethod() {
		System.out.println("Thsi is implemented in child Class");
	}

	
}
