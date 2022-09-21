package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {

	private Double costoPorUnidadConsumida;

	private int unidadesConsumidas;

	public Servicio(Double costoPorUnidadConsumida, int unidadesConsumidas) {
		setCostoPorUnidadConsumida(costoPorUnidadConsumida);
		setUnidadesConsumidas(unidadesConsumidas);
	}

	private Double getCostoPorUnidadConsumida() {
		return this.costoPorUnidadConsumida;
	}

	private void setCostoPorUnidadConsumida(Double costoPorUnidadConsumida) {
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
	}

	private int getUnidadesConsumidas() {
		return this.unidadesConsumidas;
	}

	private void setUnidadesConsumidas(Integer unidadesConsumidas) {
		this.unidadesConsumidas = unidadesConsumidas;
	}

	public Double getMontoAPagar() {
		return this.getCostoPorUnidadConsumida() * this.getUnidadesConsumidas();
	}

}
