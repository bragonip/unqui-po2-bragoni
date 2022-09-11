package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private Double precio;
	private boolean esPrecioCuidado = false;

	public Producto(String nombre, Double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}

	public Producto(String nombre, Double precio, boolean esPrecioCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(esPrecioCuidado);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return this.precio;
	}

	private void setPrecio(Double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}

	private void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public void aumentarPrecio(Double incremento) {
		this.setPrecio(this.getPrecio() + incremento);
	}
}
