package ar.edu.unq.po2.tp6;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMesual;
	private Banco banco;

	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual, Banco banco) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDireccion(direccion);
		this.setEdad(edad);
		this.setSueldoNetoMesual(sueldoNetoMensual);
		this.setBanco(banco);
	}

	private String getNombre() {
		return this.nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getApellido() {
		return this.apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private String getDireccion() {
		return this.direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return this.edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoNetoMesual() {
		return this.sueldoNetoMesual;
	}

	private void setSueldoNetoMesual(double sueldoNetoMesual) {
		this.sueldoNetoMesual = sueldoNetoMesual;
	}

	private Banco getBanco() {
		return this.banco;
	}

	private void setBanco(Banco banco) {
		this.banco = banco;
	}

	public double getSueldoNetoAnual() {
		return this.getSueldoNetoMesual() * 12;
	}

	public void solicitarCredito(SolicitudDeCredito solicitud) {
		this.getBanco().registrarSolicitudDeCredito(solicitud);
	}

	public void solicitarCreditoPersonal(Double monto, int plazo) {
		SolicitudDeCredito nuevaSolicitudDeCredito = new SolicitudCreditoPersonal(this, monto, plazo);
		this.solicitarCredito(nuevaSolicitudDeCredito);
	}

	public void solicitarCreditoHipotecario(Double monto, int plazo, Propiedad garantia) {
		SolicitudDeCredito nuevaSolicitudDeCredito = new SolicitudCreditoHipotecario(this, monto, plazo, garantia);
		this.solicitarCredito(nuevaSolicitudDeCredito);
	}
	
	public void recibirDinero(double monto) {
		
	}
}
