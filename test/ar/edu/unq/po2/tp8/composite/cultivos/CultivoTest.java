package ar.edu.unq.po2.tp8.composite.cultivos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivoTest {
	
	Mixto mixto;
	Soja soja;
	Trigo trigo;
	
	@BeforeEach
	void setUp() throws Exception {
		mixto = new Mixto();
		soja = new Soja();
		trigo = new Trigo();
	}

	@Test
	void testGetGanancia() {
		mixto.addCultivo(trigo);
		mixto.addCultivo(soja);
		assertEquals(300, trigo.getGanacia());
		assertEquals(500, soja.getGanacia());
		assertEquals(800, mixto.getGanacia());
	}


}
