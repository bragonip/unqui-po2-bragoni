package ar.edu.unq.po2.tp6;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private Double valorFiscal;
	
	private String getDescripcion() {
		return descripcion;
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	private String getDireccion() {
		return direccion;
	}
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Double getValorFiscal() {
		return valorFiscal;
	}
	private void setValorFiscal(Double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}

}
