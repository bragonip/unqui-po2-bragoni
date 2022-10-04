package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEsSuperiorATrue() {

		Carta carta4C = new Carta(PaloCarta.CORAZON, 4);
		Carta carta5C = new Carta(PaloCarta.CORAZON, 5);

		assertTrue(carta5C.esSuperiorA(carta4C));
	}

	@Test
	void testEsSuperiorAFalse() {

		Carta carta4C = new Carta(PaloCarta.CORAZON, 4);
		Carta carta5C = new Carta(PaloCarta.CORAZON, 5);

		assertFalse(carta4C.esSuperiorA(carta5C));
	}

	@Test
	void testEsMismoPaloTrue() {

		Carta carta4C = new Carta(PaloCarta.CORAZON, 4);
		Carta carta5C = new Carta(PaloCarta.CORAZON, 5);

		assertTrue(carta5C.esMismoPalo(carta4C));
	}

	@Test
	void testEsMismoPaloFals() {

		Carta carta4P = new Carta(PaloCarta.PICA, 4);
		Carta carta5C = new Carta(PaloCarta.CORAZON, 5);

		assertFalse(carta5C.esMismoPalo(carta4P));
	}
}
