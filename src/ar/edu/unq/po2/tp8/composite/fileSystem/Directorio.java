package ar.edu.unq.po2.tp8.composite.fileSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directorio implements FileSystem {

	private String nombre;
	private Date fechaCreacion;
	private List<FileSystem> contenido;

	public Directorio(String nombre, Date fechaCreacion) {
		this.setNombre(nombre);
		this.setFechaCreacion(fechaCreacion);
		this.setRamas(new ArrayList<FileSystem>());
	}

	private String getNombre() {
		return this.nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	private void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	private List<FileSystem> getContenido() {
		return this.contenido;
	}

	private void setRamas(List<FileSystem> contenido) {
		this.contenido = contenido;
	}

	@Override
	public int totalSize() {
		return this.getContenido().stream().mapToInt(file -> file.totalSize()).sum();
	}

	@Override
	public void printStructure() {

	}

	@Override
	public FileSystem lastModified() {
		return this.getContenido().stream().reduce(this.getContenido().get(0),
				(masNuevo, actual) -> Math.min(masNuevo,actual));
	}

	@Override
	public FileSystem oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}

}
