package ar.edu.unq.po2.tp6;

import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudesDeCredito;

	private List<Cliente> getClientes() {
		return clientes;
	}

	private void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	private List<SolicitudDeCredito> getSolicitudesDeCredito() {
		return solicitudesDeCredito;
	}

	private void setSolicitudesDeCredito(List<SolicitudDeCredito> solicitudesDeCredito) {
		this.solicitudesDeCredito = solicitudesDeCredito;
	}
	
	public void nuevaSolicitudCredito(Cliente cliente, Double monto, int plazo) {
		SolicitudDeCredito nuevaSolicitudDeCredito = new SolicitudDeCredito(cliente, monto, plazo);
		this.registrarSolicitudCredito(nuevaSolicitudDeCredito);
	}

	public void registrarSolicitudCredito(SolicitudDeCredito nuevaSolicitudDeCredito) {
		this.getSolicitudesDeCredito().add(nuevaSolicitudDeCredito);
	}

	public void evaluarSolicitudCredito() {

	}

	public void otorgarCredito() {

	}



}
