package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IngresoPorHorasExtrasTest {

	private IngresoPorHorasExtras enero;

	@BeforeEach
	public void setUp() {
		enero = new IngresoPorHorasExtras("Enero", "Sueldo de Enero", 10000d, 8);
	}

	@Test
	public void testMontoImponible() {
		assertEquals(enero.montoImponible(), 0d);
	}
}
