package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerStatus {

	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {

		List<String> mano = new ArrayList<String>();

		mano.add(carta1);
		mano.add(carta2);
		mano.add(carta3);
		mano.add(carta4);
		mano.add(carta5);

		if (this.hayPoker(mano)) {
			return "Poker";
		} else if (this.hayColor(mano)) {
			return "Color";
		} else if (this.hayTrio(mano)) {
			return "Trio";
		} else
			return "Nada";
	}

	private boolean hayPoker(List<String> mano) {

		List<String> manoEditada = new ArrayList<String>();

		mano.stream().forEach(carta -> manoEditada.add(carta.substring(0, carta.length() - 1)));

		return manoEditada.stream().anyMatch(carta -> Collections.frequency(manoEditada, carta) > 3);
	}

	private boolean hayColor(List<String> mano) {
		List<String> manoEditada = new ArrayList<String>();

		mano.stream().forEach(carta -> manoEditada.add(carta.substring(carta.length() - 1, carta.length())));

		return manoEditada.stream().anyMatch(carta -> Collections.frequency(manoEditada, carta) == 5);
	}

	private boolean hayTrio(List<String> mano) {
		List<String> manoEditada = new ArrayList<String>();

		mano.stream().forEach(carta -> manoEditada.add(carta.substring(0, carta.length() - 1)));

		return manoEditada.stream().anyMatch(carta -> Collections.frequency(manoEditada, carta) > 2);
	}

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

		mano.stream().forEach(carta -> System.out.println(carta.substring(carta.length() - 1, carta.length())));

	}
}
