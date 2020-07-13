package Interfaces;

public class IntefaceTest {

	public static void main(String[] args) {

		carInterface cf = new Honda();
		carInterface bf = new BMW();
		cf.go();
		cf.stop();
		
		System.out.println("-".repeat(100));

		bf.go();
		bf.stop();
		System.out.println("-".repeat(100));
		
		Honda h = new Honda();
		BMW b = new BMW();
		h.walk();
		b.waiting();

	}

}
