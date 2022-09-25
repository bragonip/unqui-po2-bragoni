package ar.edu.unq.po2.tp6;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMesual;
	private Banco banco;
	
	public Cliente(String nombre,String apellido,String direccion,int edad, double sueldoNetoMensual, Banco banco) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDireccion(direccion);
		this.setEdad(edad);
		this.setSueldoNetoMesual(sueldoNetoMensual);
		this.setBanco(banco);
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoNetoMesual() {
		return sueldoNetoMesual;
	}

	private void setSueldoNetoMesual(double sueldoNetoMesual) {
		this.sueldoNetoMesual = sueldoNetoMesual;
	}
	
	private Banco getBanco() {
		return banco;
	}

	private void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public double getSueldoNetoAnual(){
		return this.getSueldoNetoMesual() * 12;
	}
	
	public solicitarCredito() {
		SolicitudCredito nuevaSolicitud = new Solicitud(this, );
		this.getBanco().registrarSolicitudCredito(nuevaSolicitud);
		
	}


}
