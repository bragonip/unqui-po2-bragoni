package ar.edu.unq.po2.tpobserver.publicaciones;

import java.util.List;

public class Articulo {

	private String titulo;
	private String autor;
	private String filiacion;
	private String tipo;
	private List<String> palabrasClave;

	
	public Articulo(String titulo, String autor, String filiacion, String tipo, List<String> palabrasClave) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setFiliacion(filiacion);
		this.setTipo(tipo);
		this.setPalabrasClave(palabrasClave);
	}
	private String getTitulo() {
		return this.titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private String getAutor() {
		return this.autor;
	}

	private void setAutor(String autor) {
		this.autor = autor;
	}

	private String getFiliacion() {
		return this.filiacion;
	}

	private void setFiliacion(String filiacion) {
		this.filiacion = filiacion;
	}

	private String getTipo() {
		return this.tipo;
	}

	private void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<String> getPalabrasClave() {
		
		List<String> palabrasClave = this.palabrasClave;

		palabrasClave.add(this.getTitulo());
		palabrasClave.add(this.getAutor());
		palabrasClave.add(this.getFiliacion());
		palabrasClave.add(this.getTipo());
		
		return palabrasClave;
	}

	private void setPalabrasClave(List<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}
	
	
}
