package ar.edu.unq.po2.tp7;

import static org.junit.Assert.*;

import org.junit.jupiter.api.*;

public class PokerStatusTest {

	PokerStatus pokerStatus;
	Carta C1;
	Carta C2;
	Carta C3;
	Carta C4;
	Carta C5;
	Carta C6;
	Carta D1;
	Carta D2;
	Carta D3;
	Carta D4;
	Carta D5;
	Carta D6;
	Carta P1;
	Carta P2;
	Carta P3;
	Carta P4;
	Carta P5;
	Carta P6;
	Carta T1;
	Carta T2;
	Carta T3;
	Carta T4;
	Carta T5;
	Carta T6;

	@BeforeEach
	public void setUp() throws Exception {
		pokerStatus = new PokerStatus();
		C1 = new Carta(PaloCarta.CORAZON, ValorCarta.AS);
		C2 = new Carta(PaloCarta.CORAZON, ValorCarta.DOS);
		C3 = new Carta(PaloCarta.CORAZON, ValorCarta.TRES);
		C4 = new Carta(PaloCarta.CORAZON, ValorCarta.CUATRO);
		C5 = new Carta(PaloCarta.CORAZON, ValorCarta.CINCO);
		C6 = new Carta(PaloCarta.CORAZON, ValorCarta.SEIS);
		D1 = new Carta(PaloCarta.DIAMANTE, ValorCarta.AS);
		D2 = new Carta(PaloCarta.DIAMANTE, ValorCarta.DOS);
		D3 = new Carta(PaloCarta.DIAMANTE, ValorCarta.TRES);
		D4 = new Carta(PaloCarta.DIAMANTE, ValorCarta.CUATRO);
		D5 = new Carta(PaloCarta.DIAMANTE, ValorCarta.CINCO);
		D6 = new Carta(PaloCarta.DIAMANTE, ValorCarta.SEIS);
		P1 = new Carta(PaloCarta.PICA, ValorCarta.AS);
		P2 = new Carta(PaloCarta.PICA, ValorCarta.DOS);
		P3 = new Carta(PaloCarta.PICA, ValorCarta.TRES);
		P4 = new Carta(PaloCarta.PICA, ValorCarta.CUATRO);
		P5 = new Carta(PaloCarta.PICA, ValorCarta.CINCO);
		P6 = new Carta(PaloCarta.PICA, ValorCarta.SEIS);
		T1 = new Carta(PaloCarta.TREBOL, ValorCarta.AS);
		T2 = new Carta(PaloCarta.TREBOL, ValorCarta.DOS);
		T3 = new Carta(PaloCarta.TREBOL, ValorCarta.TRES);
		T4 = new Carta(PaloCarta.TREBOL, ValorCarta.CUATRO);
		T5 = new Carta(PaloCarta.TREBOL, ValorCarta.CINCO);
		T6 = new Carta(PaloCarta.TREBOL, ValorCarta.SEIS);

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

	// ejercicio 2
//	@Test
//	public void testVerificarPoker() {
//
//		assertEquals("Poker", pokerStatus.verificar("10P", "10D", "10T", "10C", "KC"));
//		assertEquals("Poker", pokerStatus.verificar("10P", "10D", "10T", "10C", "10C"));
//		assertEquals("Poker", pokerStatus.verificar("2P", "2D", "2T", "2C", "KC"));
//		assertEquals("Poker", pokerStatus.verificar("QP", "QD", "QT", "QC", "QC"));
//
//	}
//
//	@Test
//	public void testVerificarColor() {
//
//		assertEquals("Color", pokerStatus.verificar("5C", "1C", "3C", "QC", "10C"));
//		assertEquals("Color", pokerStatus.verificar("5C", "1D", "3C", "QC", "10C"));
//		assertEquals("Color", pokerStatus.verificar("5P", "1T", "3T", "QP", "10T"));
//		assertEquals("Color", pokerStatus.verificar("5T", "1T", "3T", "QT", "10T"));
//	}
//
//	@Test
//	public void testVerificarTrio() {
//		assertEquals("Trio", pokerStatus.verificar("10P", "10D", "10T", "9C", "KC"));
//		assertEquals("Trio", pokerStatus.verificar("2P", "2D", "2T", "JC", "KC"));
//
//	}
//	
//	@Test
//	public void testVerificarNada() {
//		assertEquals("Nada", pokerStatus.verificar("10P", "10D", "1T", "9C", "KC"));
//
//	}

	@Test
	public void testVerificarPoker() {
		assertEquals("Poker", pokerStatus.verificar(C1, D1, P1, T1, C1));
		assertEquals("Poker", pokerStatus.verificar(C1, D1, P1, T1, C2));
	}

	@Test
	public void testVerificarColor() {

		assertEquals("Color", pokerStatus.verificar(C1, C3, C3, C5, C3));
		assertEquals("Color", pokerStatus.verificar(C1, D1, C3, C4, D6));
		assertEquals("Color", pokerStatus.verificar(T1, T2, T3, T4, T5));
		assertEquals("Color", pokerStatus.verificar(T1, P1, P2, T5, P3));
	}

	@Test
	public void testVerificarTrio() {
		assertEquals("Trio", pokerStatus.verificar(C1, C2, P1,T1, C3));

	}

	@Test
	public void testVerificarNada() {
		assertEquals("Nada", pokerStatus.verificar(C1, D2, P3,T5, C6));

	}
}
