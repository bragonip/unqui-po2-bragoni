package ar.edu.unq.po2.tp8.observer.encuentrosDeportivos;

import java.util.List;

public class Aplicacion implements IObserver {

	private List<Deporte> deportes;
	
	public Aplicacion(List<Deporte> deportes) {
		this.setDeportes(deportes);
	}

	private List<Deporte> getDeportes() {
		return deportes;
	}

	private void setDeportes(List<Deporte> deportes) {
		this.deportes = deportes;
	}

	@Override
	public void suscribir(IObservable observable) {
		observable.agregarSuscriptor(this);

	}

	@Override
	public void serNotificado(Partido partido) {
		// TODO Auto-generated method stub

	}
	@Override
	public boolean estaInteresadoEn(Deporte deporte) {
		return this.getDeportes().contains(deporte);
	}


}
