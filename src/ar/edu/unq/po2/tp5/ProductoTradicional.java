package ar.edu.unq.po2.tp5;

public class ProductoTradicional {

	private Double precio;

	public ProductoTradicional(Double precio) {
		this.setPrecio(precio);
	}

	public Double getPrecio() {
		return this.precio;
	}

	private void setPrecio(Double precio) {
		this.precio = precio;
	}

}
