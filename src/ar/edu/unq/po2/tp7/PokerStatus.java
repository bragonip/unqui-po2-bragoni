package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerStatus {

	public String verificar(Carta c1, Carta d1, Carta p1, Carta t1, Carta c12) {

		List<Carta> mano = new ArrayList<Carta>();

		mano.add(c1);
		mano.add(d1);
		mano.add(p1);
		mano.add(t1);
		mano.add(c12);

		if (this.hayPoker(mano)) {
			return "Poker";
		} else if (this.hayColor(mano)) {
			return "Color";
		} else if (this.hayTrio(mano)) {
			return "Trio";
		} else
			return "Nada";
	}

	private boolean hayPoker(List<Carta> mano) {

		List<ValorCarta> valores = new ArrayList<ValorCarta>();

		mano.stream().forEach(carta -> valores.add(carta.getValor()));

		return valores.stream().anyMatch(carta -> Collections.frequency(valores, carta) > 3);
	}

	private boolean hayColor(List<Carta> mano) {
		List<PaloCarta> palos = new ArrayList<PaloCarta>();

		mano.stream().forEach(carta -> palos.add(carta.getPalo()));

		return palos.stream().allMatch(carta -> (carta == PaloCarta.CORAZON || carta == PaloCarta.DIAMANTE))
				|| palos.stream().allMatch(carta -> (carta == PaloCarta.PICA || carta == PaloCarta.TREBOL));
	}

	private boolean hayTrio(List<Carta> mano) {
		List<ValorCarta> valores = new ArrayList<ValorCarta>();

		mano.stream().forEach(carta -> valores.add(carta.getValor()));

		return valores.stream().anyMatch(carta -> Collections.frequency(valores, carta) > 2);

	}

	//ejercicio 2
//	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
//
//		List<String> mano = new ArrayList<String>();
//
//		mano.add(carta1);
//		mano.add(carta2);
//		mano.add(carta3);
//		mano.add(carta4);
//		mano.add(carta5);
//
//		if (this.hayPoker(mano)) {
//			return "Poker";
//		} else if (this.hayColor(mano)) {
//			return "Color";
//		} else if (this.hayTrio(mano)) {
//			return "Trio";
//		} else
//			return "Nada";
//	}
//
//	private boolean hayPoker(List<String> mano) {
//
//		List<String> manoEditada = new ArrayList<String>();
//
//		mano.stream().forEach(carta -> manoEditada.add(carta.substring(0, carta.length() - 1)));
//
//		return manoEditada.stream().anyMatch(carta -> Collections.frequency(manoEditada, carta) > 3);
//	}
//
//	private boolean hayColor(List<String> mano) {
//		List<String> manoEditada = new ArrayList<String>();
//
//		mano.stream().forEach(carta -> manoEditada.add(carta.substring(carta.length() - 1, carta.length())));
//
//		return manoEditada.stream().allMatch(carta -> (carta == "C" || carta == "D"))
//				|| manoEditada.stream().allMatch(carta -> (carta == "P" || carta == "T"));
//	}
//
//	private boolean hayTrio(List<String> mano) {
//		List<String> manoEditada = new ArrayList<String>();
//
//		mano.stream().forEach(carta -> manoEditada.add(carta.substring(0, carta.length() - 1)));
//
//		return manoEditada.stream().anyMatch(carta -> Collections.frequency(manoEditada, carta) > 2);
//
//	}

// ejercicio 1
//	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
//
//		List<String> manoEditada = new ArrayList<String>();
//		List<String> mano = new ArrayList<String>();
//
//		mano.add(carta1);
//		mano.add(carta2);
//		mano.add(carta3);
//		mano.add(carta4);
//		mano.add(carta5);
//
////		mano.stream().forEach(carta -> carta.substring(0, carta.length() - 1));
//
//		mano.stream().forEach(carta -> manoEditada.add(carta.substring(0, carta.length() - 1)));
//
//		return manoEditada.stream().anyMatch(carta -> Collections.frequency(manoEditada, carta) > 3);
//
//	}

	public static void main(String args[]) {
		List<String> mano = new ArrayList<String>();

		mano.add("10D");
		mano.add("10K");
//		System.out.println("10D".substring("10D".length() - 1, "10D".length()));

		System.out.println("10D".charAt("10D".length() - 1));

	}
}
