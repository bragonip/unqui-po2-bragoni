package ar.edu.unq.po2.tp4;

public class Ingreso {

	private String mesDePercepcion;
	private String conceptoDePercepcion;
	private Double montoPercibido;

	public Ingreso(String mesDePercepcion, String conceptoDePercepcion, Double montoPercibido) {
		this.setMesDePercepcion(mesDePercepcion);
		this.setConceptoDePercepcion(conceptoDePercepcion);
		this.setMontoPercibido(montoPercibido);
	}

	public String getMesDePercepcion() {
		return this.mesDePercepcion;
	}

	private void setMesDePercepcion(String mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}

	public String getConceptoDePercepcion() {
		return this.conceptoDePercepcion;
	}

	private void setConceptoDePercepcion(String conceptoDePercepcion) {
		this.conceptoDePercepcion = conceptoDePercepcion;
	}

	public Double getMontoPercibido() {
		return this.montoPercibido;
	}

	private void setMontoPercibido(Double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}

	public Double montoImponible() {
		return this.getMontoPercibido();
	}

}
