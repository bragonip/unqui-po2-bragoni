package ar.edu.unq.po2.tpobserver.encuentrosDeportivos;

import java.util.List;
import java.util.Map;

public class Servidor {

	private List<Deporte> deportes;
	private List<Partido> partidos;
	private Map<Aplicacion, List<String>> suscriptores;

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

	public void suscribir(PublicadorDeResultados publicador) {
		publicador.agregarSuscriptor(this);
	}

	public void serNotificado(PublicadorDeResultados publicador, Deporte deporte) {
		if (this.getDeportes().contains(deporte)) {
			publicador.enviarUltimoPartidoDe(deporte, this);
		}
	}

	public void agregarPartido(Partido partidoDeseado) {
		this.getPartidos().add(partidoDeseado);
	}



}
