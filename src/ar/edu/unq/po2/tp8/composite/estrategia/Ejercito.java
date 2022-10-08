package ar.edu.unq.po2.tp8.composite.estrategia;

import java.util.ArrayList;
import java.util.List;

public class Ejercito extends Personaje {

	private List<Personaje> personajes;

	public Ejercito() {
		this.setPersonajes(new ArrayList<Personaje>());
	}

	private List<Personaje> getPersonajes() {
		return this.personajes;
	}

	private void setPersonajes(List<Personaje> personajes) {
		this.personajes = personajes;
	}

	@Override
	public void mover(Posicion posicion) {
		this.getPersonajes().forEach(personaje -> personaje.mover(posicion));
	}
}
