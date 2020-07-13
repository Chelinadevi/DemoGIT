package Abstractclass;

public class AbsTest {

	public static void main(String[] args) {

		AbsChild c = new AbsChild();
		// AbstractClass c1 = new AbstractClass(); cannot create instantace of abstract class
		System.out.println("This is ABSTest class");
		c.absmethod();
		c.commonfunc();

	}

}
