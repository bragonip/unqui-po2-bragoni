package ar.edu.unq.po2.tp7;

import java.util.*;

public class Mano {

	private List<Carta> cartas;

	public List<Carta> getCartas() {
		return cartas;
	}

	private void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}

	public Mano(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		this.setCartas(new ArrayList<Carta>());
		this.getCartas().add(carta1);
		this.getCartas().add(carta2);
		this.getCartas().add(carta3);
		this.getCartas().add(carta4);
		this.getCartas().add(carta5);
	}

	public boolean esSuperior(Mano jugada) {
		
		return true;
	}

	public int valor() {
		// TODO Auto-generated method stub
		return 0;
	}

}
