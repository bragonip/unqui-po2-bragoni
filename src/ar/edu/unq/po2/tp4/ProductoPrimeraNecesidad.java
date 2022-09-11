package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private Double descuentoPrimeraNecesiada;

	public ProductoPrimeraNecesidad(String nombre, Double precio, Double descuentoPrimeraNecesidad) {
		super(nombre, precio);
		this.setDescuentoPrimeraNecesiada(descuentoPrimeraNecesidad); 
	}

	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidado, Double descuentoPrimeraNecesidad) {
		super(nombre, precio, esPrecioCuidado);
		this.setDescuentoPrimeraNecesiada(descuentoPrimeraNecesidad); 
	}
	
	@Override
	public Double getPrecio() {
		return super.getPrecio() * (1-this.getDescuentoPrimeraNecesiada());
	}

	public Double getDescuentoPrimeraNecesiada() {
		return descuentoPrimeraNecesiada;
	}

	private void setDescuentoPrimeraNecesiada(Double descuentoPrimeraNecesiada) {
		this.descuentoPrimeraNecesiada = descuentoPrimeraNecesiada;
	}
}
