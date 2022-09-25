package ar.edu.unq.po2.tp6;

public class SolicitudCreditoPersonal extends SolicitudDeCredito {

	public SolicitudCreditoPersonal(Cliente cliente, Double monto, int plazo) {
		super(cliente, monto, plazo);
	}

	@Override
	public boolean esAceptable() {

		return this.sueldoNetoAnualAceptable() && this.sueldoNetoMensualAceptable();
	}

	private boolean sueldoNetoAnualAceptable() {
		return getCliente().getSueldoNetoAnual() >= 15000;
	}

	private boolean sueldoNetoMensualAceptable() {
		return (this.montoCuotaMensual() <= (this.getCliente().getSueldoNetoMesual() * 0.7));
	}

}
