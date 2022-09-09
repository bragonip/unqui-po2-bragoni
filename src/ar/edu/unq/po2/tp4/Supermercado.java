package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;

	public String getNombre() {
		return nombre;
	}

	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setProductos(new ArrayList<Producto>());
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

	public int cantidadDeProductos() {
		return this.getProductos().size();
	}

	public Double sumaDePreciosDeProductos() {
		Double sumaDePrecios = 0.0;
		for (Producto producto : this.getProductos()) {
			sumaDePrecios += producto.getPrecio();
		}
		return sumaDePrecios;
//		return this.getProductos().stream().map(producto -> producto.getPrecio()).sum();
	}
}
