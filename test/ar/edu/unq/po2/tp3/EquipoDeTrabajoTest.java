package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class EquipoDeTrabajoTest {
	EquipoDeTrabajo elRejunte = new EquipoDeTrabajo("El Rejunte");
	Persona pablo = new Persona("Pablo", LocalDate.of(1989, 7, 2));
	Persona ornella = new Persona("Ornella", LocalDate.of(1993, 5, 30));
	Persona alberto = new Persona("Alberto", LocalDate.of(1989, 9, 6));
	Persona nico = new Persona("Nicolás", LocalDate.of(1989, 9, 14));
	Persona martin = new Persona("Pablo", LocalDate.of(1992, 9, 2));

//	private EquipoDeTrabajo elRejunte;
//	Persona pablo;
//	Persona ornella;
//	Persona alberto;
//	Persona nico;
//	Persona martin;

	@BeforeEach
	public void setUp() {
		
		elRejunte.agregarIntegrante(pablo);
		elRejunte.agregarIntegrante(ornella);
		elRejunte.agregarIntegrante(alberto);
		elRejunte.agregarIntegrante(nico);
		elRejunte.agregarIntegrante(martin);
	}

	@Test
	public void testPromedioDeEdadDeIntegrantes() {
		elRejunte.agregarIntegrante(pablo);
		elRejunte.agregarIntegrante(ornella);
		elRejunte.agregarIntegrante(alberto);
		elRejunte.agregarIntegrante(nico);
		elRejunte.agregarIntegrante(martin);
		
		double amount = elRejunte.promedioDeEdadDeIntegrantes();
		assertEquals(amount, 31.4);
	}
}
