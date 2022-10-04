package ar.edu.unq.po2.tp7;

import static org.junit.Assert.*;

import org.junit.jupiter.api.*;

public class PokerStatusTest {

	PokerStatus pokerStatus;

	@BeforeEach
	public void setUp() throws Exception {
		pokerStatus = new PokerStatus();

	}
	
// ejercicio 1
//	@Test
//	public void testVerificarTrue() {
//
//		assertTrue(pokerStatus.verificar("10P", "10D", "10T", "10C", "KC"));
//		assertTrue(pokerStatus.verificar("10P", "10D", "10T", "10C", "10C"));
//		assertTrue(pokerStatus.verificar("2P", "2D", "2T", "2C", "KC"));
//		assertTrue(pokerStatus.verificar("QP", "QD", "QT", "QC", "QC"));
//
//	}
//
//	@Test
//	public void testVerificarFalse() {
//
//		assertFalse(pokerStatus.verificar("10P", "10D", "10T", "8C", "KC"));
//		assertFalse(pokerStatus.verificar("2P", "2D", "2T", "QD", "KC"));
//		assertFalse(pokerStatus.verificar("8P", "10D", "10T", "10C", "2C"));
//		assertFalse(pokerStatus.verificar("KP", "3C", "10T", "1C", "2C"));
//
//	}

	@Test
	public void testVerificarPoker() {

		assertEquals("Poker", pokerStatus.verificar("10P", "10D", "10T", "10C", "KC"));
		assertEquals("Poker", pokerStatus.verificar("10P", "10D", "10T", "10C", "10C"));
		assertEquals("Poker", pokerStatus.verificar("2P", "2D", "2T", "2C", "KC"));
		assertEquals("Poker", pokerStatus.verificar("QP", "QD", "QT", "QC", "QC"));

	}

	@Test
	public void testVerificarColor() {

		assertEquals("Color", pokerStatus.verificar("5C", "1C", "3C", "QC", "10C"));
	}

	@Test
	public void testVerificarTrio() {
		assertEquals("Trio", pokerStatus.verificar("10P", "10D", "10T", "9C", "KC"));
		assertEquals("Trio", pokerStatus.verificar("2P", "2D", "2T", "JC", "KC"));

	}
	
	@Test
	public void testVerificarNada() {
		assertEquals("Nada", pokerStatus.verificar("10P", "10D", "1T", "9C", "KC"));

	}
}
