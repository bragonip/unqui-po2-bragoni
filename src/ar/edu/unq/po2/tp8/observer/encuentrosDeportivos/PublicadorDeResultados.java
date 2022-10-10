package ar.edu.unq.po2.tp8.observer.encuentrosDeportivos;

import java.util.List;

public class PublicadorDeResultados implements IObservable{

	private List<Partido> partidos;
	private List<IObserver> suscriptores;

	public List<IObserver> getSuscriptores() {
		return this.suscriptores;
	}

	public void setSuscriptores(List<IObserver> suscriptores) {
		this.suscriptores = suscriptores;
	}

	public List<Partido> getPartidos() {
		return this.partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
	@Override
	public void agregarSuscriptor(IObserver suscriptor) {
		this.getSuscriptores().add(suscriptor);
	}

	public void agregarPartido(Partido partido) {
		this.getPartidos().add(partido);
	}

	@Override
	public void notificar(Partido partido) {
		this.getSuscriptores().stream().forEach(suscriptor -> suscriptor.serNotificado(partido));
		this.agregarPartido(partido);
	}

//	public void enviarUltimoPartidoDe(Deporte deporte, Servidor suscriptor) {
//		Partido partidoDeseado = this.getPartidos().stream().filter(partido -> partido.getDeporte() == deporte).toList().get(0);
//		suscriptor.agregarPartido(partidoDeseado);
//	}

}
