package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

//ejercicio 6
public class Multioperador {
	public Multioperador() {
	}

	public int sumar(ArrayList<Integer> lista) {
		int c = 0;
		for (int entero : lista) {
			c += entero;
		}
		return c;
	}

	public int restar(ArrayList<Integer> lista) {
		int c = 0;
		for (int entero : lista) {
			c -= entero;
		}
		return c;
	}

	public int multiplicar(ArrayList<Integer> lista) {
		Integer c = lista.get(0);
		int tamanioDeLista = lista.toArray().length;

		for (int i = 1; i != tamanioDeLista; i++) {
			c = c * lista.get(i);
		}
		return c;
	}
}
