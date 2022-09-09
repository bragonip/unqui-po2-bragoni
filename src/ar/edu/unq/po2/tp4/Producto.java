package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private Double precio;
	private boolean tienePrecioCuidado = false;

	public Producto(String nombre, Double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}

	public Producto(String nombre, Double precio, boolean tienePrecioCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setTienePrecioCuidado(tienePrecioCuidado);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		if (this.getTienePrecioCuidado()) {
			return this.precio * 0.9;
		} else {
			return this.precio;
		}
	}

	private void setPrecio(Double precio) {
		this.precio = precio;
	}

	public boolean getTienePrecioCuidado() {
		return tienePrecioCuidado;
	}

	private void setTienePrecioCuidado(boolean tienePrecioCuidado) {
		this.tienePrecioCuidado = tienePrecioCuidado;
	}
}
