package ar.edu.unq.po2.tp5;

import java.util.*;

public class MercadoCentral {

	private Map<ProductoEmpresa, Integer> stock;

//	Constructores
	public MercadoCentral() {
		this.setStock(new HashMap<ProductoEmpresa, Integer>());
	}

//	getters y setters
	private Map<ProductoEmpresa, Integer> getStock() {
		return this.stock;
	}

	private void setStock(Map<ProductoEmpresa, Integer> stock) {
		this.stock = stock;
	}

//	metodos
	public void restarProducto(ProductoEmpresa producto) {
		this.getStock().put(producto, this.getStock().get(producto) - 1);
	}

}
