package �bung3;

public class BinaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahlpositiv = 128;
		int zahlnegativ = -256;
		Binary positiv = new Binary(zahlpositiv);
		Binary negativ = new Binary(zahlnegativ);
		
		System.out.println("Positive Zahl in Bin�r:");
		System.out.println(positiv.inBinary());
		System.out.println("Negative Zahl in Bin�r:");
		System.out.println(negativ.inBinary());
	}

}
