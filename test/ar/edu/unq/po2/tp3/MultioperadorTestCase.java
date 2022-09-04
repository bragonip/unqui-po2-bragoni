package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTestCase {
	Multioperador multioperador = new Multioperador();
	ArrayList<Integer> listaDeEnteros = new ArrayList<Integer>();

	@BeforeEach
	public void setUp() {
		listaDeEnteros.add(2);
		listaDeEnteros.add(2);
		listaDeEnteros.add(2);
		listaDeEnteros.add(2);
		listaDeEnteros.add(2);
	}

	@Test
	public void testSumar() {
		int amount = multioperador.sumar(listaDeEnteros);
		assertEquals(10, amount);
	}
	
	@Test
	public void testRestar() {
		int amount = multioperador.restar(listaDeEnteros);
		assertEquals(-10, amount);
	}
	
	@Test
	public void testMultiplicar() {
		int amount = multioperador.multiplicar(listaDeEnteros);
		assertEquals(32, amount);
	}
}
