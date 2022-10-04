package ar.edu.unq.po2.tp7;

public class Carta {

	private PaloCarta palo;
	private ValorCarta valor;

	public Carta(PaloCarta palo, ValorCarta valor) {
		this.setPalo(palo);
		this.setValor(valor);
	}

	public PaloCarta getPalo() {
		return this.palo;
	}

	private void setPalo(PaloCarta palo) {
		this.palo = palo;
	}

	public ValorCarta getValor() {
		return this.valor;
	}

	private void setValor(ValorCarta valor) {
		this.valor = valor;
	}

	public boolean esSuperiorA(Carta carta) {
		return this.getValor().ordinal() > carta.getValor().ordinal();
	}

	public boolean esMismoPalo(Carta carta) {
		return this.getPalo() == carta.getPalo();
	}

}
