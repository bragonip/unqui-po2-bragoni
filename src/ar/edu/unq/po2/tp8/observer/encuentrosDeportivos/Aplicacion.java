package ar.edu.unq.po2.tp8.observer.encuentrosDeportivos;

import java.util.List;

public class Aplicacion implements IObserver {

	private List<String> contrincantes;
	private List<Deporte> deportes;

	public List<String> getContrincantes() {
		return contrincantes;
	}

	public void setContrincantes(List<String> contrincantes) {
		this.contrincantes = contrincantes;
	}

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

	
	public boolean estaInteresadoEn(Partido partido) {
		return this.leInteresaDeporte(partido.getDeporte())|| this.leInteresaContrincante(partido.getContrincantes());
	}
	
	private boolean leInteresaDeporte(Deporte deporte) {
		return this.getDeportes().contains(deporte);
	}

	private boolean leInteresaContrincante(List<String> contrincantes) {
		return this.getContrincantes().stream().anyMatch(contrincante -> contrincantes.contains(contrincante));
	}
}
