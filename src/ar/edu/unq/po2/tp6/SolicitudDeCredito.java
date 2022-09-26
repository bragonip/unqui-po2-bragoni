package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {

	private Cliente cliente;
	private double monto;
	private int plazo;

	public SolicitudDeCredito(Cliente cliente, Double monto, int plazo) {
		this.setCliente(cliente);
		this.setMonto(plazo);
		this.setPlazo(plazo);
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMonto() {
		return this.monto;
	}

	private void setMonto(double monto) {
		this.monto = monto;
	}

	public int getPlazo() {
		return this.plazo;
	}

	private void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public double montoCuotaMensual() {
		return this.getMonto() / this.getPlazo();
	}

	public abstract boolean esAceptable();

}
