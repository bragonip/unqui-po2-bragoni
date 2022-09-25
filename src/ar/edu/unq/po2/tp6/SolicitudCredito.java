package ar.edu.unq.po2.tp6;

public abstract class SolicitudCredito {

	private Cliente cliente;
	private double monto;
	private int plazo;
	
	public SolicitudCredito(Cliente cliente, Double monto, int plazo){
		this.setCliente(cliente);
		this.setMonto(plazo);
		this.setPlazo(plazo);
	}

	public Cliente getCliente() {
		return cliente;
	}

	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMonto() {
		return monto;
	}

	private void setMonto(double monto) {
		this.monto = monto;
	}

	public int getPlazo() {
		return plazo;
	}

	private void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public abstract boolean esAceptable();

}
