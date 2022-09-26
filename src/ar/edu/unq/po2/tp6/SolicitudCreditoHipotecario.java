package ar.edu.unq.po2.tp6;

public class SolicitudCreditoHipotecario extends SolicitudDeCredito {

	private Propiedad garantia;

	public SolicitudCreditoHipotecario(Cliente cliente, Double monto, int plazo, Propiedad garantia) {
		super(cliente, monto, plazo);
		this.setGarantia(garantia);
	}

	private Propiedad getGarantia() {
		return this.garantia;
	}

	private void setGarantia(Propiedad garantia) {
		this.garantia = garantia;
	}

	@Override
	public boolean esAceptable() {

		return this.sueldoNetoMensualAceptable() && this.valorPropiedadAceptable() && this.edadAceptable();
	}

	private boolean sueldoNetoMensualAceptable() {
		return this.montoCuotaMensual() <= this.getCliente().getSueldoNetoMesual() * 0.5;
	}

	private boolean valorPropiedadAceptable() {
		return this.getMonto() <= (this.getGarantia().getValorFiscal() * 0.7);
	}

	private boolean edadAceptable() {
		return (this.getCliente().getEdad() + (this.getPlazo() / 12)) <= 65;
	}

}
