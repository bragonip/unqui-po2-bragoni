package ar.edu.unq.po2.tp6;

public class SolicitudCreditoHipotecario extends SolicitudDeCredito {

	private Propiedad propiedad;

	public SolicitudCreditoHipotecario(Cliente cliente, Double monto, int plazo, Propiedad propiedad) {
		super(cliente, monto, plazo);
		this.setPropiedad(propiedad);
	}

	private Propiedad getPropiedad() {
		return propiedad;
	}

	private void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	@Override
	public boolean esAceptable() {

		return this.sueldoNetoMensualAceptable() && this.valorPropiedadAceptable() && this.edadAceptable();
	}

	private boolean sueldoNetoMensualAceptable() {
		return this.montoCuotaMensual() <= this.getCliente().getSueldoNetoMesual() * 0.5;
	}

	private boolean valorPropiedadAceptable() {
		return this.getMonto() <= (this.getPropiedad().getValorFiscal() * 0.5);
	}

	private boolean edadAceptable() {
		return (this.getCliente().getEdad() + (this.getPlazo() / 12)) <= 65;
	}

}
