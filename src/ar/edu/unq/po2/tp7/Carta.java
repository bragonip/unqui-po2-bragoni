package ar.edu.unq.po2.tp7;

public class Carta {
	
	private PaloCarta palo;
	private String valor;
	
	public Carta(PaloCarta palo, String valor) {
		this.setPalo(palo);
		this.setValor(valor);
	}
	
	private PaloCarta getPalo() {
		return this.palo;
	}
	private void setPalo(PaloCarta palo) {
		this.palo = palo;
	}

	private String getValor() {
		return this.valor;
	}

	private void setValor(String valor) {
		this.valor = valor;
	}

	public boolean esSuperiorA(Carta carta) {
		return this.getValor() > carta.getValor();
	}



	public boolean esMismoPalo(Carta carta) {
		return this.getPalo() == carta.getPalo();
	}


}
