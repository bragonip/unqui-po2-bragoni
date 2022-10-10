package ar.edu.unq.po2.tp8.observer.encuentrosDeportivos;

import java.util.List;
import java.util.Map;

public class Servidor implements IObservable, IObserver {

	private List<Deporte> deportes;
	private List<Partido> partidos;
	private List<IObserver> suscriptores;

	public List<Deporte> getDeportes() {
		return this.deportes;
	}

	public void setDeportes(List<Deporte> deportes) {
		this.deportes = deportes;
	}

	public List<Partido> getPartidos() {
		return this.partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

	public List<IObserver> getSuscriptores() {
		return suscriptores;
	}

	public void setSuscriptores(List<IObserver> suscriptores) {
		this.suscriptores = suscriptores;
	}

	@Override
	public void suscribir(IObservable observable) {
		observable.agregarSuscriptor(this);
	}

	@Override
	public void serNotificado(Partido partido) {
		if (this.estaInteresadoEn(partido)) {
			this.agregarPartido(partido);
			;
		}
	}

	public void agregarPartido(Partido partidoDeseado) {
		this.getPartidos().add(partidoDeseado);
		this.notificar(partidoDeseado);
	}

	@Override
	public void agregarSuscriptor(IObserver suscriptor) {
		this.getSuscriptores().add(suscriptor);
	}

	@Override
	public void notificar(Partido partidoDeseado) {
		this.getSuscriptores().stream().filter(suscriptor -> suscriptor.estaInteresadoEn(partidoDeseado))
				.forEach(suscriptor -> suscriptor.serNotificado(partidoDeseado));
	}

	@Override
	public boolean estaInteresadoEn(Partido partido) {
		return this.getDeportes().contains(partido.getDeporte());
	}

}
