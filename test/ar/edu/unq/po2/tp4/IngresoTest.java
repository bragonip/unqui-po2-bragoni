package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IngresoTest {

	private Ingreso enero;

	@BeforeEach
	public void setUp() {
		enero = new Ingreso("Enero", "Sueldo de Enero", 10000d);
	}

	@Test
	public void testMontoImponible() {
		assertEquals(enero.getMontoPercibido(), enero.montoImponible());
	}
}
