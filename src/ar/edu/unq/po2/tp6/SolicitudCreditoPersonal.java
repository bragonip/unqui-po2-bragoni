package ar.edu.unq.po2.tp6;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(Cliente cliente, Double monto, int plazo) {
		super(cliente, monto, plazo);
	}

	@Override
	public boolean esAceptable() {

		return this.sueldoNetoAnualsuficiente() && this.sueldoNetoMensualDentroDelLimite();
	}

	private boolean sueldoNetoAnualsuficiente() {
		return getCliente().getSueldoNetoAnual() >= 15000;
	}

	private boolean sueldoNetoMensualDentroDelLimite() {
		return (this.getMonto() / this.getPlazo()) <= (this.getCliente().getSueldoNetoMesual() * 0.7);
	}

}
