package ar.edu.unq.po2.claseStreams;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AgendaTest {

	Agenda agenda = new Agenda();

	@BeforeEach
	public void setUp() {
		agenda.agregarElemento("Jose");
		agenda.agregarElemento("Mariana");
		agenda.agregarElemento("Fabian");
	}

	@Test
	public void testTieneAlMenosUnNombreQueEmpiezaCon() {
		assertTrue(agenda.tieneAlMenosUnNombreQueEmpiezaCon("J"));
	}

	@Test
	public void testTodosEmpiezanCon() {
		assertFalse(agenda.todosEmpiezanCon("J"));
	}

	@Test
	public void testFiltrar() {
		List<String> lista = new ArrayList<String>();
		lista.add("Jose");
		assertEquals(lista, agenda.filtrar("J"));
	}

}
