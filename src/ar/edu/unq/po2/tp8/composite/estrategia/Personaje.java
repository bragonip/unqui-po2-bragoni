package ar.edu.unq.po2.tp8.composite.estrategia;

public abstract class Personaje {
	private Posicion posicion;

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public abstract void mover(Posicion posicion);
}
