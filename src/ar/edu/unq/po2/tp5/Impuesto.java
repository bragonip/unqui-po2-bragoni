package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	private Double tasa;

	public Impuesto(Double tasa) {
		this.setTasa(tasa);
	}

	private Double getTasa() {
		return this.tasa;
	}

	private void setTasa(Double tasa) {
		this.tasa = tasa;
	}

	@Override
	public Double getMontoAPagar() {
		return this.getTasa();
	}

	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrar(Caja caja) {
		// TODO Auto-generated method stub
		
	}
}
