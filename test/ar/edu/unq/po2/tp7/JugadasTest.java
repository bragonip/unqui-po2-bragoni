package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadasTest {

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

	@Test
	void testJugadaSuperiorTrue() {
		Mano poker = new Mano(C1,D1,P1,T1,C1);
		Mano color = new Mano(C1,D1,C2,C3,D4);
		assertTrue(poker.esSuperior(color));
	}

}
