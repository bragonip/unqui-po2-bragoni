package ar.edu.unq.po2.tp6;

public class SolicitudCreditoPersonal extends SolicitudCredito{
	
	public SolicitudCreditoPersonal(Cliente cliente, Double monto, int plazo) {
		this.Super(cliente, monto, plazo);
	}

	@Override
	public boolean esAceptable() {
		
		return false;
	}
}
