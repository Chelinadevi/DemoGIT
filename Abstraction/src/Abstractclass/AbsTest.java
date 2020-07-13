package Abstractclass;

public class AbsTest {

	public static void main(String[] args) {

		AbsChild c = new AbsChild();
		// AbstractClass c1 = new AbstractClass(); cannot create instantace of abstract class
	
		c.absmethod();
		c.commonfunc();

	}

}
