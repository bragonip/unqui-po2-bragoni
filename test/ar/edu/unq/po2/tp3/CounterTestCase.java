package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;

	/**
	 * Crea un escenario de test básico, que consiste en un contador con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
//Se crea el contador
		counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

	/**
	 * Verifica la cantidad de pares
	 */
	@Test
	public void testEvenNumbers() {
// Getting the even occurrences
		int amount = counter.getEvenOcurrences();
// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	
	@Test
	public void testOddNumbers() {
// Getting the odd occurrences
		int amount = counter.getOddOcurrences();
// I check the amount is the expected one
		assertEquals(amount, 9);
	}
	
	@Test
	public void testGetMultiplosDe() {
// Obtener la cantidad de multiplos del numero dado
		int amount = counter.getMultiplosDe(1);
// I check the amount is the expected one
		assertEquals(amount, 10);
	}
	
	@Test
	public void testElQueMasParesTiene() {
//	Buscar el numero con mas digitos pares en la lista dada
		ArrayList<Integer> listaDeEnteros = new ArrayList<Integer>();
		listaDeEnteros.add(222);
		listaDeEnteros.add(333);
		listaDeEnteros.add(24149174);
		listaDeEnteros.add(1);
		int amount = counter.elQueMasParesTiene(listaDeEnteros);
// I check the amount is the expected one
		assertEquals(amount, 24149174);
		
	}
	@Test
	public void testMaxMultiploMenorA1000() {
//	
		int amount = counter.maxMultiploMenorA1000(7777,7777);
// I check the amount is the expected one
		assertEquals(-1, amount);
		
	}
}