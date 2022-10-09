package ar.edu.unq.po2.tpobserver.encuentrosDeportivos;

import java.util.List;

public class Suscripcion {

	private List<Deporte> deportes;
	private List<String> contrincantes;

	public List<Deporte> getDeportes() {
		return deportes;
	}

	public void setDeportes(List<Deporte> deportes) {
		this.deportes = deportes;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}

	public void setContrincantes(List<String> contrincantes) {
		this.contrincantes = contrincantes;
	}

}
