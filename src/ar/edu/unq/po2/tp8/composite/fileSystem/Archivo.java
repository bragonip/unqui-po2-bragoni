package ar.edu.unq.po2.tp8.composite.fileSystem;

import java.util.Date;

public class Archivo extends Directorio {

	private int espacioOcupado;
	private Date ultimaModificacion;

	public Archivo(String nombre, Date fechaCreacion, int espacioOcupado) {
		super(nombre, fechaCreacion);
		this.setEspacioOcupado(espacioOcupado);
		this.setUltimaModificacion(fechaCreacion);
	}

	public int getEspacioOcupado() {
		return this.espacioOcupado;
	}

	public void setEspacioOcupado(int espacioOcupado) {
		this.espacioOcupado = espacioOcupado;
	}

	public Date getUltimaModificacion() {
		return this.ultimaModificacion;
	}

	public void setUltimaModificacion(Date ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}

	@Override
	public int totalSize() {
		return this.getEspacioOcupado();
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub

	}

	@Override
	public FileSystem lastModified() {
		return this;
	}

	@Override
	public FileSystem oldestElement() {
		return this;
	}

	@Override
	public Date getFecha() {
		return this.getUltimaModificacion();
	}
}
