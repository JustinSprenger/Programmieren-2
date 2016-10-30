package Übung3;
/**
 * 
 * @author Justin Sprenger s0556255
 * @author Friedrich Hartung s0556077
 * Gruppenarbeit
 * @date 29.10.2016
 */
public class BitFlagsTestMain {

	public static void main(String[] args) {

		BitFlags b = new BitFlags(8);
		System.out.println(b.switchOn(2));
		System.out.println(b.switchOff(2));
		System.out.println(b.swap(2));
		System.out.println(b.isSet(1));

	}

}
