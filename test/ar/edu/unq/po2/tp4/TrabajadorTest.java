package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrabajadorTest {
	
	private Trabajador trabajador;
	private Ingreso enero;
	private Ingreso febrero;
	private IngresoPorHorasExtras marzo;
	
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador();
		enero = new Ingreso("Enero", "Sueldo de Enero", 10000d);
		febrero = new Ingreso("Enero", "Sueldo de Febrero", 10000d);
		marzo = new IngresoPorHorasExtras("Enero", "Horas extras de febrero", 500d, 8);
		trabajador.agregarIngreso(enero);
		trabajador.agregarIngreso(febrero);
		trabajador.agregarIngreso(marzo);
	}

	@Test
	public void testTotalPercibido() {
		assertEquals(20500d, trabajador.getTotalPercibido());
	}
	@Test
	public void testMontoImponible() {
		assertEquals(20000d, trabajador.getMontoImponible());
	}
	@Test
	public void testImpuestoAPagar() {
		assertEquals(400d, trabajador.getImpuestoAPagar());
	}

}
