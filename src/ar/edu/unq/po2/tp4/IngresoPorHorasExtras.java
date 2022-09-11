package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {

	private int horasExtras;

	public IngresoPorHorasExtras(String mesDePercepcion, String conceptoDePercepcion, Double montoPercibido,
			int horasExtras) {
		super(conceptoDePercepcion, conceptoDePercepcion, montoPercibido);
		this.setHorasExtras(horasExtras);
	}

	public int getHorasExtras() {
		return this.horasExtras;
	}

	private void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public Double montoImponible() {
		return 0.0;
	}

}
