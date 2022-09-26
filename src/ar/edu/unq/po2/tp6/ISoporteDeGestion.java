package ar.edu.unq.po2.tp6;

public interface ISoporteDeGestion {
	
	public void agregarCliente(Cliente cliente);
	public void registrarSolicitudDeCredito(SolicitudDeCredito solicitud);
	public double montoADesembolsarEnCreditos();

}
