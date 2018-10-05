package _03_Klasy;

class ConstField{
	final double pi = 3.14159;

	public ConstField() {
//		this.pi = 8.8;
	}
}

class Readonly{
	final double rr;

	public Readonly(double rr) {
		this.rr = rr;
	}
}

public class FinalTest {

	public static void main(String[] args) {
		ConstField cf = new ConstField();
		
		System.out.println("cf.pi = " + cf.pi);
//		cf.pi = 111;
		
		Readonly ro1 = new Readonly(11.11);
		Readonly ro2 = new Readonly(22.22);
		
//		ro1.rr = 33.33;
		System.out.println("ro1.rr = " + ro1.rr);
		System.out.println("ro2.rr = " + ro2.rr);
	}

}