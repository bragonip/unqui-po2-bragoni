package ar.edu.unq.po2.tpobserver.publicaciones;

import java.util.List;

public class Investigador {

	private List<String> temasDeInteres;

	public Investigador(List<String> temasDeInteres) {
		this.setTemasDeInteres(temasDeInteres);
	}

	public void suscribirse(Publicador publicador) {
		publicador.agregarSuscriptor(this);
	}

	private List<String> getTemasDeInteres() {
		return temasDeInteres;
	}

	private void setTemasDeInteres(List<String> temasDeInteres) {
		this.temasDeInteres = temasDeInteres;
	}

	public void recibirArticulo(Articulo articulo) {
//		if (this.getTemasDeInteres().stream().anyMatch(palabra -> palabrasClave.contains(palabra))) {
//			publicador.enviarPublicacion(this);
//		}
	}

	public void publicar(Publicador publicador, Articulo articulo) {
		publicador.agregarArticulo(articulo);
	}

	public boolean estaInteresadoEn(List<String> palabrasClave) {
		return this.getTemasDeInteres().stream().anyMatch(tema -> palabrasClave.contains(tema));
	}


}
