package ar.edu.unq.po2.tp6;

import java.util.List;

public class Banco implements ISoporteDeGestion{

	private List<Cliente> clientes;
	private List<SolicitudDeCredito> solicitudesDeCredito;

	public Banco(List<Cliente> clientes, List<SolicitudDeCredito> solicitudes) {
		this.setClientes(clientes);
		this.setSolicitudesDeCredito(solicitudes);
	}

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

	@Override
	public void agregarCliente(Cliente cliente) {
		this.getClientes().add(cliente);
	}

	@Override
	public void registrarSolicitudDeCredito(SolicitudDeCredito solicitud) {
		this.getSolicitudesDeCredito().add(solicitud);
	}

	public void evaluarSolicitudCredito(SolicitudDeCredito solicitud) {
		if (solicitud.esAceptable()) {
			this.otorgarCredito(solicitud.getCliente(), solicitud.getMonto());
		}
	}

	public void otorgarCredito(Cliente cliente, double monto) {
		cliente.recibirDinero(monto);
	}

	@Override
	public double montoADesembolsarEnCreditos() {
		return this.getSolicitudesDeCredito().stream().
				filter(solicitud -> solicitud.esAceptable())
				.map(solicitud -> solicitud.getMonto())
				.reduce(0d, (a,b) -> a + b);
	}

}
