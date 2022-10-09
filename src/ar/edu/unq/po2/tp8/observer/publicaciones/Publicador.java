package ar.edu.unq.po2.tp8.observer.publicaciones;

import java.util.List;

public class Publicador {

	private List<Articulo> articulos;
	private List<Investigador> suscriptores;

	public Publicador(List<Articulo> articulos, List<Investigador> investigador) {
		this.setArticulos(articulos);
		this.setSuscriptores(investigador);
	}

	private List<Articulo> getArticulos() {
		return this.articulos;
	}

	private void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	private List<Investigador> getSuscriptores() {
		return this.suscriptores;
	}

	private void setSuscriptores(List<Investigador> suscriptores) {
		this.suscriptores = suscriptores;
	}

	public void agregarSuscriptor(Investigador invesitgador) {
		this.getSuscriptores().add(invesitgador);
	}

	public void publicar(Articulo articulo) {
		this.getSuscriptores().stream().filter(suscriptor -> suscriptor.estaInteresadoEn(articulo.getPalabrasClave()))
				.forEach(suscriptor -> suscriptor.recibirArticulo(articulo));
	}

	public void agregarArticulo(Articulo articulo) {
		this.getArticulos().add(articulo);
		this.publicar(articulo);
	}
}
