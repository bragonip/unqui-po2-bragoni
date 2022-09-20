package ar.edu.unq.po2.tp5;

import java.util.*;

public class MercadoCentral {

	private Map<ProductoTradicional, Integer> stock;

	public MercadoCentral() {
		this.setStock(new HashMap<ProductoTradicional, Integer>());
	}

	private Map<ProductoTradicional, Integer> getStock() {
		return this.stock;
	}

	private void setStock(Map<ProductoTradicional, Integer> stock) {
		this.stock = stock;
	}

	public void restarProducto(ProductoTradicional producto) {
		this.getStock().put(producto, this.getStock().get(producto) - 1);
	}

}
