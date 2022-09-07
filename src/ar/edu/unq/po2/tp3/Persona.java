package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private LocalDate fecNac;

	public Persona(String nombre, LocalDate fecNac) {
		this.setNombre(nombre);
		this.setFecNac(fecNac);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecNac() {
		return fecNac;
	}

	private void setFecNac(LocalDate fecNac) {
		this.fecNac = fecNac;
	}

	public int edad() {
		return (Period.between(this.getFecNac(), LocalDate.now())).getYears();
	}

	public boolean menorQue(Persona otraPersona) {
		return this.edad() < otraPersona.edad();
	}

}
