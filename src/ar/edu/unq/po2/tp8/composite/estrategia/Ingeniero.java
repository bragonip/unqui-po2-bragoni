package ar.edu.unq.po2.tp8.composite.estrategia;

import java.util.List;

public class Ingeniero extends Personaje {
	
	List<Laja> lajas;
	
	@Override
	public void mover(Posicion posicion) {
		while(!(this.getPosicion()==posicion)) {
			if((!this.hayLaja(posicion)) && (lajas.size()!=0)) {
				this.dejarLaja();
			}
			this.avanzar();
		}
		
	}

	private void avanzar() {
		// TODO Auto-generated method stub
		
	}

	private void dejarLaja() {
		// TODO Auto-generated method stub
		
	}

	private boolean hayLaja(Posicion posicion) {
		// TODO Auto-generated method stub
		return false;
	}

}
