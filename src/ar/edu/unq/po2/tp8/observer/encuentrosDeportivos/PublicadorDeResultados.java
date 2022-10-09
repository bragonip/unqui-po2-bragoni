package ar.edu.unq.po2.tp8.observer.encuentrosDeportivos;

import java.util.List;

public class PublicadorDeResultados {

	private List<Servidor> suscriptores;
	private List<Partido> partidos;
//	private List<Servidor> suscriptoresTenis;
//	private List<Servidor> suscriptoresFutbol;
//	private List<Servidor> suscriptoresBasquet;
//	private List<Servidor> suscriptoresPingPong;

	public List<Servidor> getSuscriptores() {
		return this.suscriptores;
	}

	public void setSuscriptores(List<Servidor> suscriptores) {
		this.suscriptores = suscriptores;
	}

	public List<Partido> getPartidos() {
		return this.partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

	public void agregarSuscriptor(Servidor servidor) {
		this.getSuscriptores().add(servidor);
	}
	
	public void agregarPartido(Partido partido) {
		this.getPartidos().add(partido);
	}

	public void notificar(Partido partido) {
		this.getSuscriptores().stream().forEach(suscriptor -> suscriptor.serNotificado(this, partido.getDeporte()));
		this.agregarPartido(partido);
//		this.getSuscriptores().stream().filter(suscriptor -> suscriptor.getDeportes().contains(partido.getDeporte())).
//			forEach(suscriptor -> suscriptor.recibir(partido));
	}

	public void enviarUltimoPartidoDe(Deporte deporte, Servidor suscriptor) {
		Partido partidoDeseado = this.getPartidos().stream().filter(partido -> partido.getDeporte() == deporte).toList().get(0);
		suscriptor.agregarPartido(partidoDeseado);
	}

}
