package Übung3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Justin Sprenger s0556255
 * @author Friedrich Hartung s0556077
 * Gruppenarbeit
 * @date 29.10.2016
 */
public class BitFlagsTest {
	private BitFlags bitpositiv;
	private BitFlags bitnegativ;
	
	@Before
	public void objektErzeugen()
	{
		bitpositiv = new BitFlags(24);
		bitnegativ = new BitFlags(-12);
	}
	
	@Test
	public void switchOnPositiv() {
		assertTrue(bitpositiv.switchOn(3) == 28);
	}
	@Test
	public void switchOnNegativ() {
		assertTrue(bitnegativ.switchOn(1) == -11);
	}
	@Test
	public void switchOffPositiv() {
		assertTrue(bitpositiv.switchOff(5) == 8);
	}
	@Test
	public void switchOffNegativ() {
		assertTrue(bitnegativ.switchOff(3) == -16);
	}
	@Test
	public void swapPositiv0Zu1() {
		assertTrue(bitpositiv.swap(2) == 26);
	}
	@Test
	public void swapPositiv1Zu0() {
		assertTrue(bitpositiv.swap(4) == 16);
	}
	@Test
	public void swapNegativ0Zu1() {
		assertTrue(bitnegativ.swap(4) == -4);
	}
	@Test
	public void swapNegativ1Zu0() {
		assertTrue(bitnegativ.swap(3) == -16);
	}
	@Test
	public void isSetTrue() {
		assertTrue(bitpositiv.isSet(4) == true);
	}
	@Test
	public void isSetFalse() {
		assertTrue(bitnegativ.isSet(2) == false);
	}
}
