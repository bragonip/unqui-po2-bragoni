package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;

	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setProductos(new ArrayList<Producto>());
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	private void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}

	public Double getPrecioTotal() {
		Double sumaDePrecios = 0.0;
		for (Producto producto : this.getProductos()) {
			sumaDePrecios += producto.getPrecio();
		}
		return sumaDePrecios;
//		return this.getProductos().stream().map(producto -> producto.getPrecio()).sum();
	}

	public void agregarProducto(Producto producto) {
		this.getProductos().add(producto);
	}
}
